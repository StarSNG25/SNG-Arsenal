package com.starsng.sng_arsenal.item;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeModeTabs
{
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SNG_ARSENAL_TAB = RegistryHandler.CREATIVE_MODE_TABS.register("sng_arsenal_tab", () ->
			CreativeModeTab.builder()
					.title(Component.literal("SNG Arsenal"))
					.icon(() -> new ItemStack(ModItems.SNG_INGOT.get()))
					.displayItems((parameters, output) ->
					{
						//Ingredients
						output.accept(ModItems.RAW_SNG.get());
						output.accept(ModItems.SNG_INGOT.get());
						output.accept(ModItems.CONDENSED_SNG_INGOT.get());
						
						//Natural Blocks
						output.accept(ModItems.SNG_ORE_ITEM.get());
						output.accept(ModItems.DEEPSLATE_SNG_ORE_ITEM.get());
						
						//Building Blocks
						output.accept(ModItems.RAW_SNG_BLOCK_ITEM.get());
						output.accept(ModItems.SNG_BLOCK_ITEM.get());
						output.accept(ModItems.CONDENSED_SNG_BLOCK_ITEM.get());
						
						//Combat
						output.accept(ModItems.SNG_SWORD.get());
						output.accept(ModItems.SNG_HELMET.get());
						output.accept(ModItems.SNG_CHESTPLATE.get());
						output.accept(ModItems.SNG_LEGGINGS.get());
						output.accept(ModItems.SNG_BOOTS.get());
						output.accept(ModItems.CONDENSED_SNG_SWORD.get());
						output.accept(ModItems.CONDENSED_SNG_HELMET.get());
						output.accept(ModItems.CONDENSED_SNG_CHESTPLATE.get());
						output.accept(ModItems.CONDENSED_SNG_LEGGINGS.get());
						output.accept(ModItems.CONDENSED_SNG_BOOTS.get());
						
						//Tools and Utilities
						output.accept(ModItems.SNG_PICKAXE.get());
						output.accept(ModItems.SNG_AXE.get());
						output.accept(ModItems.SNG_SHOVEL.get());
						output.accept(ModItems.SNG_HOE.get());
						output.accept(ModItems.FLINT_AND_SNG.get());
						output.accept(ModItems.SNG_SHEARS.get());
						output.accept(ModItems.CONDENSED_SNG_PICKAXE.get());
						output.accept(ModItems.CONDENSED_SNG_AXE.get());
						output.accept(ModItems.CONDENSED_SNG_SHOVEL.get());
						output.accept(ModItems.CONDENSED_SNG_HOE.get());
						output.accept(ModItems.FLINT_AND_CONDENSED_SNG.get());
						output.accept(ModItems.CONDENSED_SNG_SHEARS.get());
					}).build()
	);
}
