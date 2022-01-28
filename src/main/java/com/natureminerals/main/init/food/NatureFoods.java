package com.natureminerals.main.init.food;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class NatureFoods {
	
	//uvarovite foods
	public static final Food UVAROVITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.STRENGTH, 750, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	public static final Food ENCHANTED_UVAROVITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.STRENGTH, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	 
	 //kunzite foods
	public static final Food KUNZITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.RESISTANCE, 750, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	public static final Food ENCHANTED_KUNZITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.RESISTANCE, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 2500, 1), 1.0f)
			.setAlwaysEdible()
			.build();

	//stibnite foods
	public static final Food STIBNITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.JUMP_BOOST, 750, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	public static final Food ENCHANTED_STIBNITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.JUMP_BOOST, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 2500, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	
	//astrite foods
	public static final Food ASTRITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.HASTE, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SPEED, 750, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	
	public static final Food ENCHANTED_ASTRITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SPEED, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.HASTE, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 2500, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	
	//thounite foods
	public static final Food THOUNITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.WATER_BREATHING, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 750, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.INVISIBILITY, 750, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	
	public static final Food ENCHANTED_THOUNITE_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.WATER_BREATHING, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SPEED, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.STRENGTH, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.RESISTANCE,  2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.INVISIBILITY,  2500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.HASTE, 2500, 1), 1.0f)
			.setAlwaysEdible()
			.build();
	
}
