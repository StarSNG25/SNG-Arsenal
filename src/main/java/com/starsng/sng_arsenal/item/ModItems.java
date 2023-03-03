package com.starsng.sng_arsenal.item;

import com.starsng.sng_arsenal.blocks.ModBlocks;
import com.starsng.sng_arsenal.item.armor.ModArmorItem;
import com.starsng.sng_arsenal.item.armor.ModArmorMaterials;
import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.world.entity.EquipmentSlot;
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
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
	private static final Item.Properties sngItemProperties = new Item.Properties();
	private static final Item.Properties condensedSngItemProperties = new Item.Properties().fireResistant();
	private static final Item.Properties durabilityItemProperties = new Item.Properties().durability(256); //Durability of Flint and SNG
	
	//Ingredients
	public static final RegistryObject<Item> RAW_SNG = RegistryHandler.ITEMS.register("raw_sng", () ->
			new Item(sngItemProperties));
	public static final RegistryObject<Item> SNG_INGOT = RegistryHandler.ITEMS.register("sng_ingot", () ->
			new Item(sngItemProperties));
	public static final RegistryObject<Item> CONDENSED_SNG_INGOT = RegistryHandler.ITEMS.register("condensed_sng_ingot", () ->
			new Item(condensedSngItemProperties));
	
	//Blocks
	public static final RegistryObject<BlockItem> SNG_ORE_ITEM = RegistryHandler.ITEMS.register("sng_ore", () ->
			new BlockItem(ModBlocks.SNG_ORE.get(), sngItemProperties));
	public static final RegistryObject<BlockItem> DEEPSLATE_SNG_ORE_ITEM = RegistryHandler.ITEMS.register("deepslate_sng_ore", () ->
			new BlockItem(ModBlocks.DEEPSLATE_SNG_ORE.get(), sngItemProperties));
	public static final RegistryObject<BlockItem> RAW_SNG_BLOCK_ITEM = RegistryHandler.ITEMS.register("raw_sng_block", () ->
			new BlockItem(ModBlocks.RAW_SNG_BLOCK.get(), sngItemProperties));
	public static final RegistryObject<BlockItem> SNG_BLOCK_ITEM = RegistryHandler.ITEMS.register("sng_block", () ->
			new BlockItem(ModBlocks.SNG_BLOCK.get(), sngItemProperties));
	public static final RegistryObject<BlockItem> CONDENSED_SNG_BLOCK_ITEM = RegistryHandler.ITEMS.register("condensed_sng_block", () ->
			new BlockItem(ModBlocks.CONDENSED_SNG_BLOCK.get(), condensedSngItemProperties));
	
	//Tools and Weapons
	public static final RegistryObject<SwordItem> SNG_SWORD = RegistryHandler.ITEMS.register("sng_sword", () ->
			new SwordItem(ModTiers.SNG, 3, -2.0f, sngItemProperties));
	public static final RegistryObject<PickaxeItem> SNG_PICKAXE = RegistryHandler.ITEMS.register("sng_pickaxe", () ->
			new PickaxeItem(ModTiers.SNG, 1, -2.4f, sngItemProperties));
	public static final RegistryObject<AxeItem> SNG_AXE = RegistryHandler.ITEMS.register("sng_axe", () ->
			new AxeItem(ModTiers.SNG, 5, -2.6f, sngItemProperties));
	public static final RegistryObject<ShovelItem> SNG_SHOVEL = RegistryHandler.ITEMS.register("sng_shovel", () ->
			new ShovelItem(ModTiers.SNG, 1.5f, -2.6f, sngItemProperties));
	public static final RegistryObject<HoeItem> SNG_HOE = RegistryHandler.ITEMS.register("sng_hoe", () ->
			new HoeItem(ModTiers.SNG, -6, 0.0f, sngItemProperties));
	public static final RegistryObject<FlintAndSteelItem> FLINT_AND_SNG = RegistryHandler.ITEMS.register("flint_and_sng", () ->
			new FlintAndSteelItem(durabilityItemProperties));
	public static final RegistryObject<ShearsItem> SNG_SHEARS = RegistryHandler.ITEMS.register("sng_shears", () ->
			new ShearsItem(durabilityItemProperties.durability(952)));
	
	public static final RegistryObject<SwordItem> CONDENSED_SNG_SWORD = RegistryHandler.ITEMS.register("condensed_sng_sword", () ->
			new SwordItem(ModTiers.CONDENSED_SNG, 7, -2.0f, condensedSngItemProperties));
	public static final RegistryObject<PickaxeItem> CONDENSED_SNG_PICKAXE = RegistryHandler.ITEMS.register("condensed_sng_pickaxe", () ->
			new PickaxeItem(ModTiers.CONDENSED_SNG, 3, -2.4f, condensedSngItemProperties));
	public static final RegistryObject<AxeItem> CONDENSED_SNG_AXE = RegistryHandler.ITEMS.register("condensed_sng_axe", () ->
			new AxeItem(ModTiers.CONDENSED_SNG, 11, -2.6f, condensedSngItemProperties));
	public static final RegistryObject<ShovelItem> CONDENSED_SNG_SHOVEL = RegistryHandler.ITEMS.register("condensed_sng_shovel", () ->
			new ShovelItem(ModTiers.CONDENSED_SNG, 4, -2.6f, condensedSngItemProperties));
	public static final RegistryObject<HoeItem> CONDENSED_SNG_HOE = RegistryHandler.ITEMS.register("condensed_sng_hoe", () ->
			new HoeItem(ModTiers.CONDENSED_SNG, -12, 0.0f, condensedSngItemProperties));
	public static final RegistryObject<FlintAndSteelItem> FLINT_AND_CONDENSED_SNG = RegistryHandler.ITEMS.register("flint_and_condensed_sng", () ->
			new FlintAndSteelItem(durabilityItemProperties.durability(512)));
	public static final RegistryObject<ShearsItem> CONDENSED_SNG_SHEARS = RegistryHandler.ITEMS.register("condensed_sng_shears", () ->
			new ShearsItem(durabilityItemProperties.durability(1904)));
	
	//Armor
	public static final RegistryObject<ArmorItem> SNG_HELMET = RegistryHandler.ITEMS.register("sng_helmet", () ->
			new ModArmorItem(ModArmorMaterials.SNG, EquipmentSlot.HEAD, sngItemProperties));
	public static final RegistryObject<ArmorItem> SNG_CHESTPLATE = RegistryHandler.ITEMS.register("sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterials.SNG, EquipmentSlot.CHEST, sngItemProperties));
	public static final RegistryObject<ArmorItem> SNG_LEGGINGS = RegistryHandler.ITEMS.register("sng_leggings", () ->
			new ModArmorItem(ModArmorMaterials.SNG, EquipmentSlot.LEGS, sngItemProperties));
	public static final RegistryObject<ArmorItem> SNG_BOOTS = RegistryHandler.ITEMS.register("sng_boots", () ->
			new ModArmorItem(ModArmorMaterials.SNG, EquipmentSlot.FEET, sngItemProperties));
	
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_HELMET = RegistryHandler.ITEMS.register("condensed_sng_helmet", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, EquipmentSlot.HEAD, condensedSngItemProperties));
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_CHESTPLATE = RegistryHandler.ITEMS.register("condensed_sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, EquipmentSlot.CHEST, condensedSngItemProperties));
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_LEGGINGS = RegistryHandler.ITEMS.register("condensed_sng_leggings", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, EquipmentSlot.LEGS, condensedSngItemProperties));
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_BOOTS = RegistryHandler.ITEMS.register("condensed_sng_boots", () ->
			new ModArmorItem(ModArmorMaterials.CONDENSED_SNG, EquipmentSlot.FEET, condensedSngItemProperties));
	
	public ModItems(IEventBus modEventBus)
	{
		modEventBus.addListener(this::addCreative);
	}
	
	private void addCreative(CreativeModeTabEvent.BuildContents event)
	{
		if (event.getTab() == CreativeModeTabs.INGREDIENTS)
		{
        	event.accept(RAW_SNG);
        	event.accept(SNG_INGOT);
        	event.accept(CONDENSED_SNG_INGOT);
		}
		if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS)
		{
			event.accept(SNG_ORE_ITEM);
			event.accept(DEEPSLATE_SNG_ORE_ITEM);
		}
		if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS)
		{
			event.accept(RAW_SNG_BLOCK_ITEM);
			event.accept(SNG_BLOCK_ITEM);
			event.accept(CONDENSED_SNG_BLOCK_ITEM);
		}
		if (event.getTab() == CreativeModeTabs.COMBAT)
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
		if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES)
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
