package com.natureminerals.main.world;

import com.natureminerals.main.NatureMinerals;
import com.natureminerals.main.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;

//@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class OreGeneration {
	
	public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
	
	public static int UVARVEIN = 5;
	public static int UVARHEIGHT = 20;
	public static int UVARCHUNK = 5;
	
	public static int KUNZITEVEIN = 4;
	public static int KUNZITEHEIGHT = 16;
	public static int KUNZITECHUNK = 4;
	
	public static int STIBNITEVEIN = 3;
	public static int STIBNITEHEIGHT = 80;
	public static int STIBNITECHUNK = 3;
	
	public static int ASTRITEVEIN = 3;
	public static int ASTRITEHEIGHT = 120;
	public static int ASTRITECHUNK = 3;
	
	public static ConfiguredFeature <?,?> UVAROVITE_FEATURE = newConfiguredFeature("uvarovite_ore",Feature.ORE.withConfiguration(
			new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.UVAROVITE_ORE.get().getDefaultState(), UVARVEIN)).range(UVARHEIGHT)
			.square().count(UVARCHUNK));
	public static ConfiguredFeature <?,?> KUNZITE_FEATURE = newConfiguredFeature("kunzite_ore",Feature.ORE.withConfiguration(
			new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.KUNZITE_ORE.get().getDefaultState(), KUNZITEVEIN)).range(KUNZITEHEIGHT)
			.square().count(KUNZITECHUNK));
	public static ConfiguredFeature <?,?> STIBNITE_FEATURE = newConfiguredFeature("stibnite_ore",Feature.ORE.withConfiguration(
			new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.STIBNITE_ORE.get().getDefaultState(), STIBNITEVEIN)).range(STIBNITEHEIGHT)
			.square().count(STIBNITECHUNK));
	public static ConfiguredFeature <?,?> ASTRITE_FEATURE = newConfiguredFeature("astrite_ore",Feature.ORE.withConfiguration(
			new OreFeatureConfig(END_STONE, BlockInit.ASTRITE_ORE.get().getDefaultState(), ASTRITEVEIN)).range(ASTRITEHEIGHT)
			.square().count(ASTRITECHUNK));
	
	//@SubscribeEvent
	public static void generateOre(final BiomeLoadingEvent event) {
		if(event.getCategory() == Category.DESERT) {
			event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES).add(() -> UVAROVITE_FEATURE);
		}
		if(event.getCategory() == Category.SAVANNA) {
			event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES).add(() -> KUNZITE_FEATURE);
		}
		if(event.getCategory() == Category.NETHER) {
			event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES).add(() -> STIBNITE_FEATURE);
		}
		if(event.getCategory() == Category.THEEND) {
			event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES).add(() -> ASTRITE_FEATURE);
		}
	}
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(NatureMinerals.MODID, registryName), configuredFeature);
        	return configuredFeature;
    }
}
