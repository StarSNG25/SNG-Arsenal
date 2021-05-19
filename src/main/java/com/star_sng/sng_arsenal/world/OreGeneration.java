package com.star_sng.sng_arsenal.world;

import java.util.ArrayList;
import com.star_sng.sng_arsenal.SngArsenal;
import com.star_sng.sng_arsenal.blocks.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OreGeneration
{
	private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
	
	public static void registerOres()
	{
		overworldOres.add(register("sng_ore", Feature.ORE.configured(
			new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SNG_ORE.get().defaultBlockState(), 6))
				.range(16).squared()
				.chance(5)
				)
			);
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void gen(BiomeLoadingEvent event)
	{
		BiomeGenerationSettingsBuilder generation = event.getGeneration();
		
		for (ConfiguredFeature<?, ?> ore : overworldOres)
			if (ore != null)
				generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
	}
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature)
	{
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, SngArsenal.MODID + ":" + name, configuredFeature);
	}
}
