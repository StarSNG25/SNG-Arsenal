package com.starsng.sng_arsenal.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.TNTBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModFlintAndSteelItem extends FlintAndSteelItem
{
	public ModFlintAndSteelItem(Properties properties)
	{
		super(properties);
	}

	@Override
	public ActionResultType useOn(ItemUseContext context) //From FlintAndSteelItem
	{
		PlayerEntity player = context.getPlayer();
		World level = context.getLevel();
		BlockPos blockPos = context.getClickedPos();
		BlockState blockState = level.getBlockState(blockPos);
		
		if (blockState.getBlock() instanceof TNTBlock || blockState.getMaterial() == Material.EXPLOSIVE) //To prime/ignite TNT
		{
			blockState.getBlock().catchFire(blockState, level, blockPos, null, player);
			level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 11);

			if (player != null)
			{
				context.getItemInHand().hurtAndBreak(1, player, (livingEntity) ->
				{
					livingEntity.broadcastBreakEvent(context.getHand());
				});
			}
		}
		else if (CampfireBlock.canLight(blockState))
		{
			level.playSound(player, blockPos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
			level.setBlock(blockPos, blockState.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
			
			if (player != null)
			{
				context.getItemInHand().hurtAndBreak(1, player, (livingEntity) ->
				{
					livingEntity.broadcastBreakEvent(context.getHand());
				});
			}
		}
		else
		{
			BlockPos blockPos1 = blockPos.relative(context.getClickedFace());
			
			if (AbstractFireBlock.canBePlacedAt(level, blockPos1, context.getHorizontalDirection()))
			{
				level.playSound(player, blockPos1, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
				BlockState blockState1 = AbstractFireBlock.getState(level, blockPos1);
				level.setBlock(blockPos1, blockState1, 11);
				ItemStack itemStack = context.getItemInHand();
				
				if (player instanceof ServerPlayerEntity)
				{
					CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity) player, blockPos1, itemStack);
					itemStack.hurtAndBreak(1, player, (livingEntity) ->
					{
						livingEntity.broadcastBreakEvent(context.getHand());
					});
				}
			}
			else
				return ActionResultType.FAIL;
		}
		
		return ActionResultType.sidedSuccess(level.isClientSide());
	}
}
