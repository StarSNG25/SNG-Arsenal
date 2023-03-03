package com.starsng.sng_arsenal.item;

import java.util.List;
import com.starsng.sng_arsenal.SngArsenal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class ModForgeTiers
{
	public static Tier SNG;
	public static Tier CONDENSED_SNG;
	
	static
	{
		SNG = TierSortingRegistry.registerTier(
				new ForgeTier(5, 3500, 12.0f, 6.0f, 20, BlockTags.MINEABLE_WITH_PICKAXE, () -> Ingredient.of(ModItems.SNG_INGOT.get())),
				new ResourceLocation(SngArsenal.MODID, "sng"), List.of(Tiers.NETHERITE), List.of());
		
		CONDENSED_SNG = TierSortingRegistry.registerTier(
				new ForgeTier(6, 7000, 24.0f, 12.0f, 22, BlockTags.MINEABLE_WITH_PICKAXE, () -> Ingredient.of(ModItems.CONDENSED_SNG_INGOT.get())),
				new ResourceLocation(SngArsenal.MODID, "condensed_sng"), List.of(SNG), List.of());
	}
}
