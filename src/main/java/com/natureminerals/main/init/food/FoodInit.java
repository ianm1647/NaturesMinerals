package com.natureminerals.main.init.food;

import com.natureminerals.main.NatureMinerals;

import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodInit {
	
	public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, NatureMinerals.MODID);
	
	public static final RegistryObject<Item> UVAROVITE_APPLE = FOODS.register("uvarovite_apple", 
			() -> new Item(new Item.Properties().food(NatureFoods.UVAROVITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ENCHANTED_UVAROVITE_APPLE = FOODS.register("enchanted_uvarovite_apple", 
			() -> new EnchantedGoldenAppleItem(new Item.Properties().food(NatureFoods.ENCHANTED_UVAROVITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
	
	public static final RegistryObject<Item> KUNZITE_APPLE = FOODS.register("kunzite_apple",
			() -> new Item(new Item.Properties().food(NatureFoods.KUNZITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ENCHANTED_KUNZITE_APPLE = FOODS.register("enchanted_kunzite_apple",
			() -> new EnchantedGoldenAppleItem(new Item.Properties().food(NatureFoods.ENCHANTED_KUNZITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
	
	public static final RegistryObject<Item> STIBNITE_APPLE = FOODS.register("stibnite_apple",
			() -> new Item(new Item.Properties().food(NatureFoods.STIBNITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ENCHANTED_STIBNITE_APPLE = FOODS.register("enchanted_stibnite_apple",
			() -> new EnchantedGoldenAppleItem(new Item.Properties().food(NatureFoods.ENCHANTED_STIBNITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
	
	public static final RegistryObject<Item> ASTRITE_APPLE = FOODS.register("astrite_apple",
			() -> new Item(new Item.Properties().food(NatureFoods.ASTRITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ENCHANTED_ASTRITE_APPLE = FOODS.register("enchanted_astrite_apple",
			() -> new EnchantedGoldenAppleItem(new Item.Properties().food(NatureFoods.ENCHANTED_ASTRITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
	
	public static final RegistryObject<Item> THOUNITE_APPLE = FOODS.register("thounite_apple",
			() -> new Item(new Item.Properties().food(NatureFoods.THOUNITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ENCHANTED_THOUNITE_APPLE = FOODS.register("enchanted_thounite_apple",
			() -> new EnchantedGoldenAppleItem(new Item.Properties().food(NatureFoods.ENCHANTED_THOUNITE_APPLE).group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
}
