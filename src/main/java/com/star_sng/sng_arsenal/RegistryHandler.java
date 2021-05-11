package com.star_sng.sng_arsenal;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SngArsenal.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SngArsenal.MODID);
	
	public static void init()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Item> SNG_INGOT = ITEMS.register("sng_ingot", () ->
	new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MATERIALS)
			)
	);
	
	public static final RegistryObject<Block> SNG_ORE = BLOCKS.register("sng_ore", () ->
		new Block(AbstractBlock.Properties
				.of(Material.METAL)
				.strength(5.0f, 6.0f)
				.sound(SoundType.STONE)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
				.requiresCorrectToolForDrops()
				)
		);
	
	public static final RegistryObject<Item> SNG_ORE_ITEM = ITEMS.register("sng_ore", () ->
		new BlockItem(
				SNG_ORE.get(),
				new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
				)
		);
	
	public static final RegistryObject<Block> SNG_BLOCK = BLOCKS.register("sng_block", () ->
	new Block(AbstractBlock.Properties
			.of(Material.METAL)
			.strength(7.0f, 9.0f)
			.sound(SoundType.METAL)
			.harvestLevel(2)
			.harvestTool(ToolType.PICKAXE)
			.requiresCorrectToolForDrops()
			)
	);
	
	public static final RegistryObject<Item> SNG_BLOCK_ITEM = ITEMS.register("sng_block", () ->
	new BlockItem(
			SNG_BLOCK.get(),
			new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
			)
	);
}
