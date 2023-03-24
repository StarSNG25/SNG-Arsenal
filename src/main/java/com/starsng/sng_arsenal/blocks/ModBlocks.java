package com.starsng.sng_arsenal.blocks;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks
{
	public static final RegistryObject<Block> SNG_ORE = RegistryHandler.BLOCKS.register("sng_ore", () ->
			new OreBlock(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> SNG_BLOCK = RegistryHandler.BLOCKS.register("sng_block", () ->
			new Block(AbstractBlock.Properties
					.of(Material.METAL)
					.strength(10.0f, 20.0f) //was 10.0f, 15.0f
					.sound(SoundType.METAL)
					.harvestLevel(3)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
	));
	public static final RegistryObject<Block> CONDENSED_SNG_BLOCK = RegistryHandler.BLOCKS.register("condensed_sng_block", () ->
			new Block(AbstractBlock.Properties
					.of(Material.METAL, MaterialColor.COLOR_GRAY)
					.strength(20.0f, 40.0f) //was 15.0f, 22.5f
					.sound(SoundType.METAL)
					.harvestLevel(4)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
	));
}
