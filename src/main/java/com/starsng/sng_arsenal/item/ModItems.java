package com.starsng.sng_arsenal.item;

import com.starsng.sng_arsenal.blocks.ModBlocks;
import com.starsng.sng_arsenal.item.armor.ModArmorItem;
import com.starsng.sng_arsenal.item.armor.ModArmorMaterials;
import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems
{
	private static final Item.Properties sngItemProperties = new Item.Properties();
	private static final Item.Properties condensedSngItemProperties = new Item.Properties().fireResistant();
	private static final Item.Properties durabilityItemProperties = new Item.Properties().durability(256); //Durability of Flint and SNG
	
	//Ingredients
	public static final DeferredItem<Item> RAW_SNG = RegistryHandler.ITEMS.registerSimpleItem("raw_sng");
	public static final DeferredItem<Item> SNG_INGOT = RegistryHandler.ITEMS.registerSimpleItem("sng_ingot");
	public static final DeferredItem<Item> CONDENSED_SNG_INGOT = RegistryHandler.ITEMS.registerSimpleItem("condensed_sng_ingot");
	
	//Blocks
	public static final DeferredItem<BlockItem> SNG_ORE_ITEM = RegistryHandler.ITEMS.registerSimpleBlockItem("sng_ore", ModBlocks.SNG_ORE);
	public static final DeferredItem<BlockItem> DEEPSLATE_SNG_ORE_ITEM = RegistryHandler.ITEMS.registerSimpleBlockItem("deepslate_sng_ore", ModBlocks.DEEPSLATE_SNG_ORE);
	public static final DeferredItem<BlockItem> RAW_SNG_BLOCK_ITEM = RegistryHandler.ITEMS.registerSimpleBlockItem("raw_sng_block", ModBlocks.RAW_SNG_BLOCK);
	public static final DeferredItem<BlockItem> SNG_BLOCK_ITEM = RegistryHandler.ITEMS.registerSimpleBlockItem("sng_block", ModBlocks.SNG_BLOCK);
	public static final DeferredItem<BlockItem> CONDENSED_SNG_BLOCK_ITEM = RegistryHandler.ITEMS.registerSimpleBlockItem("condensed_sng_block", ModBlocks.CONDENSED_SNG_BLOCK);
	
	//Tools and Weapons
	public static final DeferredItem<SwordItem> SNG_SWORD = RegistryHandler.ITEMS.register("sng_sword", () ->
			new SwordItem(ModTiers.SNG, 3, -2.0f, sngItemProperties));
	public static final DeferredItem<PickaxeItem> SNG_PICKAXE = RegistryHandler.ITEMS.register("sng_pickaxe", () ->
			new PickaxeItem(ModTiers.SNG, 1, -2.4f, sngItemProperties));
	public static final DeferredItem<AxeItem> SNG_AXE = RegistryHandler.ITEMS.register("sng_axe", () ->
			new AxeItem(ModTiers.SNG, 5, -2.6f, sngItemProperties));
	public static final DeferredItem<ShovelItem> SNG_SHOVEL = RegistryHandler.ITEMS.register("sng_shovel", () ->
			new ShovelItem(ModTiers.SNG, 1.5f, -2.6f, sngItemProperties));
	public static final DeferredItem<HoeItem> SNG_HOE = RegistryHandler.ITEMS.register("sng_hoe", () ->
			new HoeItem(ModTiers.SNG, -6, 0.0f, sngItemProperties));
	
	public static final DeferredItem<SwordItem> CONDENSED_SNG_SWORD = RegistryHandler.ITEMS.register("condensed_sng_sword", () ->
			new SwordItem(ModTiers.CONDENSED_SNG, 7, -2.0f, condensedSngItemProperties));
	public static final DeferredItem<PickaxeItem> CONDENSED_SNG_PICKAXE = RegistryHandler.ITEMS.register("condensed_sng_pickaxe", () ->
			new PickaxeItem(ModTiers.CONDENSED_SNG, 3, -2.4f, condensedSngItemProperties));
	public static final DeferredItem<AxeItem> CONDENSED_SNG_AXE = RegistryHandler.ITEMS.register("condensed_sng_axe", () ->
			new AxeItem(ModTiers.CONDENSED_SNG, 11, -2.6f, condensedSngItemProperties));
	public static final DeferredItem<ShovelItem> CONDENSED_SNG_SHOVEL = RegistryHandler.ITEMS.register("condensed_sng_shovel", () ->
			new ShovelItem(ModTiers.CONDENSED_SNG, 4, -2.6f, condensedSngItemProperties));
	public static final DeferredItem<HoeItem> CONDENSED_SNG_HOE = RegistryHandler.ITEMS.register("condensed_sng_hoe", () ->
			new HoeItem(ModTiers.CONDENSED_SNG, -12, 0.0f, condensedSngItemProperties));
	
	public static final DeferredItem<FlintAndSteelItem> FLINT_AND_SNG = RegistryHandler.ITEMS.register("flint_and_sng", () ->
			new ModFlintAndSteelItem(durabilityItemProperties));
	public static final DeferredItem<ShearsItem> SNG_SHEARS = RegistryHandler.ITEMS.register("sng_shears", () ->
			new ShearsItem(durabilityItemProperties.durability(952)));
	public static final DeferredItem<FlintAndSteelItem> FLINT_AND_CONDENSED_SNG = RegistryHandler.ITEMS.register("flint_and_condensed_sng", () ->
			new ModFlintAndSteelItem(durabilityItemProperties.durability(512).fireResistant()));
	public static final DeferredItem<ShearsItem> CONDENSED_SNG_SHEARS = RegistryHandler.ITEMS.register("condensed_sng_shears", () ->
			new ShearsItem(durabilityItemProperties.durability(1904)));
	
	//Armor
	public static final DeferredItem<ArmorItem> SNG_HELMET = RegistryHandler.ITEMS.register("sng_helmet", () ->
			new ModArmorItem(ModArmorMaterials.SNG, ArmorItem.Type.HELMET, sngItemProperties));
	public static final DeferredItem<ArmorItem> SNG_CHESTPLATE = RegistryHandler.ITEMS.register("sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterials.SNG, ArmorItem.Type.CHESTPLATE, sngItemProperties));
	public static final DeferredItem<ArmorItem> SNG_LEGGINGS = RegistryHandler.ITEMS.register("sng_leggings", () ->
			new ModArmorItem(ModArmorMaterials.SNG, ArmorItem.Type.LEGGINGS, sngItemProperties));
	public static final DeferredItem<ArmorItem> SNG_BOOTS = RegistryHandler.ITEMS.register("sng_boots", () ->
			new ModArmorItem(ModArmorMaterials.SNG, ArmorItem.Type.BOOTS, sngItemProperties));
	
	public static final DeferredItem<ArmorItem> CONDENSED_SNG_HELMET = RegistryHandler.ITEMS.register("condensed_sng_helmet", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, ArmorItem.Type.HELMET, condensedSngItemProperties));
	public static final DeferredItem<ArmorItem> CONDENSED_SNG_CHESTPLATE = RegistryHandler.ITEMS.register("condensed_sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, ArmorItem.Type.CHESTPLATE, condensedSngItemProperties));
	public static final DeferredItem<ArmorItem> CONDENSED_SNG_LEGGINGS = RegistryHandler.ITEMS.register("condensed_sng_leggings", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, ArmorItem.Type.LEGGINGS, condensedSngItemProperties));
	public static final DeferredItem<ArmorItem> CONDENSED_SNG_BOOTS = RegistryHandler.ITEMS.register("condensed_sng_boots", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, ArmorItem.Type.BOOTS, condensedSngItemProperties));
	
	public ModItems(IEventBus modEventBus)
	{
		modEventBus.addListener(this::addCreative);
	}
	
	private void addCreative(BuildCreativeModeTabContentsEvent event)
	{
		if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
		{
			event.accept(RAW_SNG);
			event.accept(SNG_INGOT);
			event.accept(CONDENSED_SNG_INGOT);
		}
		if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
		{
			event.accept(SNG_ORE_ITEM);
			event.accept(DEEPSLATE_SNG_ORE_ITEM);
		}
		if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
		{
			event.accept(RAW_SNG_BLOCK_ITEM);
			event.accept(SNG_BLOCK_ITEM);
			event.accept(CONDENSED_SNG_BLOCK_ITEM);
		}
		if (event.getTabKey() == CreativeModeTabs.COMBAT)
		{
			event.accept(SNG_SWORD);
			event.accept(SNG_HELMET);
			event.accept(SNG_CHESTPLATE);
			event.accept(SNG_LEGGINGS);
			event.accept(SNG_BOOTS);
			event.accept(CONDENSED_SNG_SWORD);
			event.accept(CONDENSED_SNG_HELMET);
			event.accept(CONDENSED_SNG_CHESTPLATE);
			event.accept(CONDENSED_SNG_LEGGINGS);
			event.accept(CONDENSED_SNG_BOOTS);
		}
		if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
		{
			event.accept(SNG_SHOVEL);
			event.accept(SNG_PICKAXE);
			event.accept(SNG_AXE);
			event.accept(SNG_HOE);
			event.accept(FLINT_AND_SNG);
			event.accept(SNG_SHEARS);
			event.accept(CONDENSED_SNG_SHOVEL);
			event.accept(CONDENSED_SNG_PICKAXE);
			event.accept(CONDENSED_SNG_AXE);
			event.accept(CONDENSED_SNG_HOE);
			event.accept(FLINT_AND_CONDENSED_SNG);
			event.accept(CONDENSED_SNG_SHEARS);
		}
	}
}
