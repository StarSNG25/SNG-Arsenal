package com.star_sng.sng_arsenal.world;

import com.star_sng.sng_arsenal.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration
{
	public static void generateOres(final BiomeLoadingEvent event)
	{
		if(!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND)))
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SNG_ORE.get().defaultBlockState(), 5, 16, 5);
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int maxHeight, int amount)
	{
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
				.range(maxHeight)
				.squared()
				.count(amount)
		);
	}
}
