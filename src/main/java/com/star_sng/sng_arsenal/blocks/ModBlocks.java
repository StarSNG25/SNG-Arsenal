package com.star_sng.sng_arsenal.blocks;

import com.star_sng.sng_arsenal.util.RegistryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks
{
	public static void init() {}
	
	public static final RegistryObject<Block> SNG_ORE = RegistryHandler.BLOCKS.register("sng_ore", () ->
			new Block(AbstractBlock.Properties
					.of(Material.STONE)
					.strength(3.0f, 3.0f)
					.sound(SoundType.STONE)
					.harvestLevel(3)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
					)
			);
	
	public static final RegistryObject<Block> SNG_BLOCK = RegistryHandler.BLOCKS.register("sng_block", () ->
			new Block(AbstractBlock.Properties
					.of(Material.METAL)
					.strength(10.0f, 15.0f)
					.sound(SoundType.METAL)
					.harvestLevel(3)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
					)
			);
	
	public static final RegistryObject<Block> CONDENSED_SNG_BLOCK = RegistryHandler.BLOCKS.register("condensed_sng_block", () ->
			new Block(AbstractBlock.Properties
					.of(Material.METAL)
					.strength(15.0f, 22.5f)
					.sound(SoundType.METAL)
					.harvestLevel(4)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
					)
			);
}
