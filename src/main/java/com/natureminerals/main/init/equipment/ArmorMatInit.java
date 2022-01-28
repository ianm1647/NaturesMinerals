package com.natureminerals.main.init.equipment;

import java.util.function.Supplier;

import com.natureminerals.main.NatureMinerals;
import com.natureminerals.main.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ArmorMatInit implements IArmorMaterial
{	
	UVAROVITE(NatureMinerals.MODID + ":uvarovite", 40, new int[] { 4, 7, 9, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5F,
			() -> {	return Ingredient.fromItems(ItemInit.UVAROVITE_INGOT.get());	}, 0.2F),
	KUNZITE(NatureMinerals.MODID + ":kunzite", 42, new int[] { 5, 8, 10, 5 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F,
			() -> {	return Ingredient.fromItems(ItemInit.KUNZITE_INGOT.get());	}, 0.3F),	
	STIBNITE(NatureMinerals.MODID + ":stibnite", 46, new int[] { 6, 9, 11, 6 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.5F,
			() -> {	return Ingredient.fromItems(ItemInit.STIBNITE_INGOT.get());	}, 0.4F),
	ASTRITE(NatureMinerals.MODID + ":astrite", 50, new int[] { 7, 10, 12, 7 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F,
			() -> {	return Ingredient.fromItems(ItemInit.ASTRITE_INGOT.get());	}, 0.5F),
	THOUNITE(NatureMinerals.MODID + ":thounite", 60, new int[] { 10, 13, 15, 10 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F,
			() -> {	return Ingredient.fromItems(ItemInit.THOUNITE_INGOT.get());	}, 0.8F);


	private static final int[] MAX_DAMAGE_ARRAY = { 11, 16, 15, 13 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float thoughness;
	private final Supplier<Ingredient> repairMaterial;
	private final float knockbackResistance;
	
	ArmorMatInit(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, 
			SoundEvent soundEvent, float thoughness, Supplier<Ingredient> repairMaterial, float knockbackResistance)
	{
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.thoughness = thoughness;
		this.repairMaterial = repairMaterial;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) 
	{
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) 
	{
		return damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() 
	{
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return repairMaterial.get();
	}

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public float getToughness() 
	{
		return thoughness;
	}

	@Override
	public float getKnockbackResistance()
	{
		return knockbackResistance;
	}
}
