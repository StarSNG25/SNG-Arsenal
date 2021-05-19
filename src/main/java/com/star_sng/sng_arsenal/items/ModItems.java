package com.star_sng.sng_arsenal.items;

import com.star_sng.sng_arsenal.armor.ModArmorItem;
import com.star_sng.sng_arsenal.armor.ModArmorMaterial;
import com.star_sng.sng_arsenal.blocks.ModBlocks;
import com.star_sng.sng_arsenal.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
	public static void init() {}
	
	public static final RegistryObject<Item> SNG_INGOT = RegistryHandler.ITEMS.register("sng_ingot", () ->
		new Item(new Item.Properties()
				.tab(ItemGroup.TAB_MATERIALS)
				)
		);
	
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
	
	public static final RegistryObject<SwordItem> SNG_SWORD = RegistryHandler.ITEMS.register("sng_sword", () ->
		new SwordItem(ModItemTier.SNG, 3, -2.0f, (new Item.Properties())
				.tab(ItemGroup.TAB_COMBAT)
				)
		);
	
	public static final RegistryObject<PickaxeItem> SNG_PICKAXE = RegistryHandler.ITEMS.register("sng_pickaxe", () ->
		new PickaxeItem(ModItemTier.SNG, 1, -2.4f, (new Item.Properties())
				.tab(ItemGroup.TAB_TOOLS)
				)
		);
	
	public static final RegistryObject<AxeItem> SNG_AXE = RegistryHandler.ITEMS.register("sng_axe", () ->
		new AxeItem(ModItemTier.SNG, 5, -2.6f, (new Item.Properties())
				.tab(ItemGroup.TAB_TOOLS)
				)
		);
	
	public static final RegistryObject<ShovelItem> SNG_SHOVEL = RegistryHandler.ITEMS.register("sng_shovel", () ->
		new ShovelItem(ModItemTier.SNG, (float) 1.5, -2.6f, (new Item.Properties())
				.tab(ItemGroup.TAB_TOOLS)
				)
		);
	
	public static final RegistryObject<HoeItem> SNG_HOE = RegistryHandler.ITEMS.register("sng_hoe", () ->
		new HoeItem(ModItemTier.SNG, -6, 0.0f, (new Item.Properties())
				.tab(ItemGroup.TAB_TOOLS)
				)
		);
	
	public static final RegistryObject<ArmorItem> SNG_HELMET = RegistryHandler.ITEMS.register("sng_helmet", () ->
		new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.HEAD, (new Item.Properties())
				.tab(ItemGroup.TAB_COMBAT)
				)
		);
	
	public static final RegistryObject<ArmorItem> SNG_CHESTPLATE = RegistryHandler.ITEMS.register("sng_chestplate", () ->
		new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.CHEST, (new Item.Properties())
				.tab(ItemGroup.TAB_COMBAT)
				)
		);
	
	public static final RegistryObject<ArmorItem> SNG_LEGGINGS = RegistryHandler.ITEMS.register("sng_leggings", () ->
		new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.LEGS, (new Item.Properties())
				.tab(ItemGroup.TAB_COMBAT)
				)
		);
	
	public static final RegistryObject<ArmorItem> SNG_BOOTS = RegistryHandler.ITEMS.register("sng_boots", () ->
		new ModArmorItem(ModArmorMaterial.SNG, EquipmentSlotType.FEET, (new Item.Properties())
				.tab(ItemGroup.TAB_COMBAT)
				)
		);
}
