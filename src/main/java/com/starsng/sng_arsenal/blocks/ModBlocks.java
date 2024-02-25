package com.starsng.sng_arsenal.blocks;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks
{
	public static final RegistryObject<Block> SNG_ORE = RegistryHandler.BLOCKS.register("sng_ore", () ->
			new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> DEEPSLATE_SNG_ORE = RegistryHandler.BLOCKS.register("deepslate_sng_ore", () ->
			new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
	public static final RegistryObject<Block> RAW_SNG_BLOCK = RegistryHandler.BLOCKS.register("raw_sng_block", () ->
			new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_BLACK)));
	public static final RegistryObject<Block> SNG_BLOCK = RegistryHandler.BLOCKS.register("sng_block", () ->
			new Block(BlockBehaviour.Properties
					.of() //Material.METAL
					.mapColor(MapColor.METAL)
					.strength(10.0f, 20.0f)  //1.16.5: 10.0f, 15.0f
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()
					));
	public static final RegistryObject<Block> CONDENSED_SNG_BLOCK = RegistryHandler.BLOCKS.register("condensed_sng_block", () ->
			new Block(BlockBehaviour.Properties
					.of() //Material.HEAVY_METAL, MaterialColor.COLOR_GRAY
					.mapColor(MapColor.COLOR_GRAY)
					.strength(20.0f, 40.0f) //1.16.5: 15.0f, 22.5f
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()
					));
}
