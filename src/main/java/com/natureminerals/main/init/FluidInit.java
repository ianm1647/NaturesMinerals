package com.natureminerals.main.init;

import com.natureminerals.main.NatureMinerals;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(NatureMinerals.MODID,
            "blocks/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(NatureMinerals.MODID,
            "blocks/fluids/molten_metal_flowing");
    
    public static final ResourceLocation BLOOD_STILL = new ResourceLocation(NatureMinerals.MODID,
    		"blocks/fluids/blood_lava_still");
    public static final ResourceLocation BLOOD_FLOW = new ResourceLocation(NatureMinerals.MODID,
    		"blocks/fluids/blood_lava_flow");
    
    public static final ResourceLocation SCORCHING_STILL = new ResourceLocation(NatureMinerals.MODID,
    		"blocks/fluids/scorching_blood_still");
    public static final ResourceLocation SCORCHING_FLOW = new ResourceLocation(NatureMinerals.MODID,
    		"blocks/fluids/scorching_blood_flow");
    		
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, NatureMinerals.MODID);
	
	
	//materials
    public static final RegistryObject<ForgeFlowingFluid.Source> UVAROVITE = FLUIDS.register("molten_uvarovite",
            () -> new ForgeFlowingFluid.Source(makeUvaroviteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_UVAROVITE = FLUIDS.register("flowing_molten_uvarovite",
            () -> new ForgeFlowingFluid.Flowing(makeUvaroviteProperties()));
	
    public static final RegistryObject<ForgeFlowingFluid.Source> KUNZITE = FLUIDS.register("molten_kunzite",
            () -> new ForgeFlowingFluid.Source(makeKunziteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_KUNZITE = FLUIDS.register("flowing_molten_kunzite",
            () -> new ForgeFlowingFluid.Flowing(makeKunziteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> STIBNITE = FLUIDS.register("molten_stibnite", 
    		() -> new ForgeFlowingFluid.Source(makeStibniteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_STIBNITE = FLUIDS.register("flowing_molten_stibnite", 
    		() -> new ForgeFlowingFluid.Flowing(makeStibniteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> ASTRITE = FLUIDS.register("molten_astrite", 
    		() -> new ForgeFlowingFluid.Source(makeAstriteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ASTRITE = FLUIDS.register("flowing_molten_astrite", 
    		() -> new ForgeFlowingFluid.Flowing(makeAstriteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> THOUNITE = FLUIDS.register("molten_thounite", 
    		() -> new ForgeFlowingFluid.Source(makeThouniteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_THOUNITE = FLUIDS.register("flowing_molten_thounite", 
    		() -> new ForgeFlowingFluid.Flowing(makeThouniteProperties()));
    
    //fuels
    public static final RegistryObject<ForgeFlowingFluid.Source> BLOODLAVA = FLUIDS.register("blood_lava",
            () -> new ForgeFlowingFluid.Source(makeBloodlavaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLOODLAVA = FLUIDS.register("flowing_bloodlava",
            () -> new ForgeFlowingFluid.Flowing(makeBloodlavaProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> SCORCHINGBLOOD = FLUIDS.register("scorching_blood",
            () -> new ForgeFlowingFluid.Source(makeScorchingBloodProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SCORCHINGBLOOD = FLUIDS.register("flowing_scorchingblood",
            () -> new ForgeFlowingFluid.Flowing(makeScorchingBloodProperties()));

    
    //materials
    private static ForgeFlowingFluid.Properties makeUvaroviteProperties() {
    	return new ForgeFlowingFluid.Properties(UVAROVITE, flowing_UVAROVITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF30D513)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.UVAROVITE_BUCKET).block(BlockInit.MOLTEN_UVAROVITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeKunziteProperties() {
    	return new ForgeFlowingFluid.Properties(KUNZITE, flowing_KUNZITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFCF6284)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.KUNZITE_BUCKET).block(BlockInit.MOLTEN_KUNZITE).explosionResistance(1000F).tickRate(9);       
    } 
    
    private static ForgeFlowingFluid.Properties makeStibniteProperties() {
    	return new ForgeFlowingFluid.Properties(STIBNITE, flowing_STIBNITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB7C3DE)
                        .luminosity(15).density(3000).viscosity(6000).temperature(2000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.STIBNITE_BUCKET).block(BlockInit.MOLTEN_STIBNITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeAstriteProperties() {
    	return new ForgeFlowingFluid.Properties(ASTRITE, flowing_ASTRITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFF3222)
                        .luminosity(15).density(3000).viscosity(6000).temperature(2500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.ASTRITE_BUCKET).block(BlockInit.MOLTEN_ASTRITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeThouniteProperties() {
    	return new ForgeFlowingFluid.Properties(THOUNITE, flowing_THOUNITE,
    			FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFBBE53)
    					.luminosity(15).density(3000).viscosity(6000).temperature(2750).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
					.bucket(ItemInit.THOUNITE_BUCKET).block(BlockInit.MOLTEN_THOUNITE).explosionResistance(1000F).tickRate(9);
    }
    
    //fuels
    private static ForgeFlowingFluid.Properties makeBloodlavaProperties() {
    	return new ForgeFlowingFluid.Properties(BLOODLAVA, flowing_BLOODLAVA,
                FluidAttributes.builder(BLOOD_STILL, BLOOD_FLOW)
                		.luminosity(15).density(3000).viscosity(6000).temperature(1250).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.BLOODLAVA_BUCKET).block(BlockInit.BLOOD_LAVA).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeScorchingBloodProperties() {
    	return new ForgeFlowingFluid.Properties(SCORCHINGBLOOD, flowing_SCORCHINGBLOOD,
    			FluidAttributes.builder(SCORCHING_STILL, SCORCHING_FLOW)
    					.luminosity(15).density(3000).viscosity(6000).temperature(3000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
    				.bucket(ItemInit.SCORCHINGBLOOD_BUCKET).block(BlockInit.SCORCHING_BLOOD).explosionResistance(1000F).tickRate(9);
    }
    
}





