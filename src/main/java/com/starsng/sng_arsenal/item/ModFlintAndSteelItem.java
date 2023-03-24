package com.starsng.sng_arsenal.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;

public class ModFlintAndSteelItem extends FlintAndSteelItem
{
	public ModFlintAndSteelItem(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public InteractionResult useOn(UseOnContext context) //From FlintAndSteelItem
	{
		Player player = context.getPlayer();
		Level level = context.getLevel();
		BlockPos blockPos = context.getClickedPos();
		BlockState blockState = level.getBlockState(blockPos);
		
		if (blockState.getBlock() instanceof TntBlock || blockState.getMaterial() == Material.EXPLOSIVE) //To prime/ignite TNT
		{
			blockState.getBlock().onCaughtFire(blockState, level, blockPos, null, player);
			level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 11);
		}
		else if (!CampfireBlock.canLight(blockState) && !CandleBlock.canLight(blockState) && !CandleCakeBlock.canLight(blockState))
		{
			BlockPos blockPos1 = blockPos.relative(context.getClickedFace());
			
			if (BaseFireBlock.canBePlacedAt(level, blockPos1, context.getHorizontalDirection()))
			{
				level.playSound(player, blockPos1, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
				BlockState blockState1 = BaseFireBlock.getState(level, blockPos1);
				level.setBlock(blockPos1, blockState1, 11);
				level.gameEvent(player, GameEvent.BLOCK_PLACE, blockPos);
				ItemStack itemStack = context.getItemInHand();
				
				if (player instanceof ServerPlayer)
				{
					CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, blockPos1, itemStack);
					itemStack.hurtAndBreak(1, player, (livingEntity) ->
					{
						livingEntity.broadcastBreakEvent(context.getHand());
					});
				}
			}
			else
				return InteractionResult.FAIL;
		}
		else
		{
			level.playSound(player, blockPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
			level.setBlock(blockPos, blockState.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
			level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
			
			if (player != null)
				context.getItemInHand().hurtAndBreak(1, player, (livingEntity) ->
				{
					livingEntity.broadcastBreakEvent(context.getHand());
				});
		}
		
		return InteractionResult.sidedSuccess(level.isClientSide());
	}
}
