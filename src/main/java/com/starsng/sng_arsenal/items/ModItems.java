package com.starsng.sng_arsenal.items;

import com.starsng.sng_arsenal.armor.ModArmorItem;
import com.starsng.sng_arsenal.armor.ModArmorMaterial;
import com.starsng.sng_arsenal.blocks.ModBlocks;
import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
	//Ingot
	public static final RegistryObject<Item> SNG_INGOT = RegistryHandler.ITEMS.register("sng_ingot", () ->
			new Item(new Item.Properties()
					.tab(ItemGroup.TAB_MATERIALS)
					)
			);
	
	public static final RegistryObject<Item> CONDENSED_SNG_INGOT = RegistryHandler.ITEMS.register("condensed_sng_ingot", () ->
			new Item(new Item.Properties()
					.tab(ItemGroup.TAB_MATERIALS)
					)
			);
	
	//Blocks
	public static final RegistryObject<Item> SNG_ORE_ITEM = RegistryHandler.ITEMS.register("sng_ore", () ->
			new BlockItem(ModBlocks.SNG_ORE.get(), new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)
					)
			);
	
	public static final RegistryObject<Item> SNG_BLOCK_ITEM = RegistryHandler.ITEMS.register("sng_block", () ->
			new BlockItem(ModBlocks.SNG_BLOCK.get(), new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)
					)
			);
	
	public static final RegistryObject<Item> CONDENSED_SNG_BLOCK_ITEM = RegistryHandler.ITEMS.register("condensed_sng_block", () ->
			new BlockItem(ModBlocks.CONDENSED_SNG_BLOCK.get(), new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)
					)
			);
	
	//Tools
	public static final RegistryObject<SwordItem> SNG_SWORD = RegistryHandler.ITEMS.register("sng_sword", () ->
			new SwordItem(ModItemTier.SNG, 3, -2.0f, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<PickaxeItem> SNG_PICKAXE = RegistryHandler.ITEMS.register("sng_pickaxe", () ->
			new PickaxeItem(ModItemTier.SNG, 1, -2.4f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<AxeItem> SNG_AXE = RegistryHandler.ITEMS.register("sng_axe", () ->
			new AxeItem(ModItemTier.SNG, 5, -2.6f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<ShovelItem> SNG_SHOVEL = RegistryHandler.ITEMS.register("sng_shovel", () ->
			new ShovelItem(ModItemTier.SNG, (float) 1.5, -2.6f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<HoeItem> SNG_HOE = RegistryHandler.ITEMS.register("sng_hoe", () ->
			new HoeItem(ModItemTier.SNG, -6, 0.0f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<SwordItem> CONDENSED_SNG_SWORD = RegistryHandler.ITEMS.register("condensed_sng_sword", () ->
			new SwordItem(ModItemTier.CONDENSED_SNG, 7, -2.0f, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<PickaxeItem> CONDENSED_SNG_PICKAXE = RegistryHandler.ITEMS.register("condensed_sng_pickaxe", () ->
			new PickaxeItem(ModItemTier.CONDENSED_SNG, 3, -2.4f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<AxeItem> CONDENSED_SNG_AXE = RegistryHandler.ITEMS.register("condensed_sng_axe", () ->
			new AxeItem(ModItemTier.CONDENSED_SNG, 11, -2.6f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<ShovelItem> CONDENSED_SNG_SHOVEL = RegistryHandler.ITEMS.register("condensed_sng_shovel", () ->
			new ShovelItem(ModItemTier.CONDENSED_SNG, 4, -2.6f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<HoeItem> CONDENSED_SNG_HOE = RegistryHandler.ITEMS.register("condensed_sng_hoe", () ->
			new HoeItem(ModItemTier.CONDENSED_SNG, -12, 0.0f, new Item.Properties()
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<ShieldItem> SNG_SHIELD = RegistryHandler.ITEMS.register("sng_shield", () ->
			new ShieldItem(new Item.Properties()
					.durability(1344)
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ShieldItem> CONDENSED_SNG_SHIELD = RegistryHandler.ITEMS.register("condensed_sng_shield", () ->
			new ShieldItem(new Item.Properties()
					.durability(2688)
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<FlintAndSteelItem> FLINT_AND_SNG = RegistryHandler.ITEMS.register("flint_and_sng", () ->
			new FlintAndSteelItem(new Item.Properties()
					.durability(256)
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<FlintAndSteelItem> FLINT_AND_CONDENSED_SNG = RegistryHandler.ITEMS.register("flint_and_condensed_sng", () ->
			new FlintAndSteelItem(new Item.Properties()
					.durability(512)
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<ShearsItem> SNG_SHEARS = RegistryHandler.ITEMS.register("sng_shears", () ->
			new ShearsItem(new Item.Properties()
					.durability(952)
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	public static final RegistryObject<ShearsItem> CONDENSED_SNG_SHEARS = RegistryHandler.ITEMS.register("condensed_sng_shears", () ->
			new ShearsItem(new Item.Properties()
					.durability(1904)
					.tab(ItemGroup.TAB_TOOLS)
					)
			);
	
	//Armor
	public static final RegistryObject<ArmorItem> SNG_HELMET = RegistryHandler.ITEMS.register("sng_helmet", () ->
			new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.HEAD, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> SNG_CHESTPLATE = RegistryHandler.ITEMS.register("sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.CHEST, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> SNG_LEGGINGS = RegistryHandler.ITEMS.register("sng_leggings", () ->
			new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.LEGS, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> SNG_BOOTS = RegistryHandler.ITEMS.register("sng_boots", () ->
			new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.FEET, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_HELMET = RegistryHandler.ITEMS.register("condensed_sng_helmet", () ->
			new ModArmorItem(ModArmorMaterial.CONDENSED_SNG, EquipmentSlotType.HEAD, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_CHESTPLATE = RegistryHandler.ITEMS.register("condensed_sng_chestplate", () ->
			new ModArmorItem(ModArmorMaterial.CONDENSED_SNG, EquipmentSlotType.CHEST, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_LEGGINGS = RegistryHandler.ITEMS.register("condensed_sng_leggings", () ->
			new ModArmorItem(ModArmorMaterial.CONDENSED_SNG, EquipmentSlotType.LEGS, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
	
	public static final RegistryObject<ArmorItem> CONDENSED_SNG_BOOTS = RegistryHandler.ITEMS.register("condensed_sng_boots", () ->
			new ModArmorItem(ModArmorMaterial.CONDENSED_SNG, EquipmentSlotType.FEET, new Item.Properties()
					.tab(ItemGroup.TAB_COMBAT)
					)
			);
}
