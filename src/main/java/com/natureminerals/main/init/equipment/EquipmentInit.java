package com.natureminerals.main.init.equipment;

import com.natureminerals.main.NatureMinerals;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EquipmentInit {
	
	public static final DeferredRegister<Item> EQUIP = DeferredRegister.create(ForgeRegistries.ITEMS, NatureMinerals.MODID);
	
	//uvarovite
	public static RegistryObject<Item> UVAROVITE_HEAD = EQUIP.register("uvarovite_head", () -> new ArmorItem(ArmorMatInit.UVAROVITE, EquipmentSlotType.HEAD, 
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> UVAROVITE_CHEST = EQUIP.register("uvarovite_chest", () -> new ArmorItem(ArmorMatInit.UVAROVITE, EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> UVAROVITE_LEGS = EQUIP.register("uvarovite_legs", () -> new ArmorItem(ArmorMatInit.UVAROVITE, EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> UVAROVITE_FEET = EQUIP.register("uvarovite_feet", () -> new ArmorItem(ArmorMatInit.UVAROVITE, EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)));
	
	//kunzite
	public static RegistryObject<Item> KUNZITE_HEAD = EQUIP.register("kunzite_head", () -> new ArmorItem(ArmorMatInit.KUNZITE, EquipmentSlotType.HEAD, 
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> KUNZITE_CHEST = EQUIP.register("kunzite_chest", () -> new ArmorItem(ArmorMatInit.KUNZITE, EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> KUNZITE_LEGS = EQUIP.register("kunzite_legs", () -> new ArmorItem(ArmorMatInit.KUNZITE, EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> KUNZITE_FEET = EQUIP.register("kunzite_feet", () -> new ArmorItem(ArmorMatInit.KUNZITE, EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)));
	
	//stibnite
	public static RegistryObject<Item> STIBNITE_HEAD = EQUIP.register("stibnite_head", () -> new ArmorItem(ArmorMatInit.STIBNITE, EquipmentSlotType.HEAD, 
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> STIBNITE_CHEST = EQUIP.register("stibnite_chest", () -> new ArmorItem(ArmorMatInit.STIBNITE, EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> STIBNITE_LEGS = EQUIP.register("stibnite_legs", () -> new ArmorItem(ArmorMatInit.STIBNITE, EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> STIBNITE_FEET = EQUIP.register("stibnite_feet", () -> new ArmorItem(ArmorMatInit.STIBNITE, EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)));
	
	//astrite
	public static RegistryObject<Item> ASTRITE_HEAD = EQUIP.register("astrite_head", () -> new ArmorItem(ArmorMatInit.ASTRITE, EquipmentSlotType.HEAD, 
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> ASTRITE_CHEST = EQUIP.register("astrite_chest", () -> new ArmorItem(ArmorMatInit.ASTRITE, EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> ASTRITE_LEGS = EQUIP.register("astrite_legs", () -> new ArmorItem(ArmorMatInit.ASTRITE, EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> ASTRITE_FEET = EQUIP.register("astrite_feet", () -> new ArmorItem(ArmorMatInit.ASTRITE, EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)));
	
	//thounite
	public static RegistryObject<Item> THOUNITE_HEAD = EQUIP.register("thounite_head", () -> new ArmorItem(ArmorMatInit.THOUNITE, EquipmentSlotType.HEAD, 
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> THOUNITE_CHEST = EQUIP.register("thounite_chest", () -> new ArmorItem(ArmorMatInit.THOUNITE, EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> THOUNITE_LEGS = EQUIP.register("thounite_legs", () -> new ArmorItem(ArmorMatInit.THOUNITE, EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> THOUNITE_FEET = EQUIP.register("thounite_feet", () -> new ArmorItem(ArmorMatInit.THOUNITE, EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)));
	
}