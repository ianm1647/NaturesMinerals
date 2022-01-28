package com.natureminerals.main.init;

import com.natureminerals.main.NatureMinerals;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NatureMinerals.MODID);
	
	//materials
	public static final RegistryObject<Item> UVAROVITE_INGOT = ITEMS.register("uvarovite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> UVAROVITE_NUGGET = ITEMS.register("uvarovite_nugget", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> KUNZITE_INGOT = ITEMS.register("kunzite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> KUNZITE_NUGGET = ITEMS.register("kunzite_nugget",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> STIBNITE_INGOT = ITEMS.register("stibnite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> STIBNITE_NUGGET = ITEMS.register("stibnite_nugget", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> ASTRITE_INGOT = ITEMS.register("astrite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> ASTRITE_NUGGET = ITEMS.register("astrite_nugget", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> THOUNITE_INGOT = ITEMS.register("thounite_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> THOUNITE_NUGGET = ITEMS.register("thounite_nugget", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	//compat
	public static final RegistryObject<Item> UVAROVITE_CRUSHED = ITEMS.register("uvarovite_crushed", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> KUNZITE_CRUSHED = ITEMS.register("kunzite_crushed", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> STIBNITE_CRUSHED = ITEMS.register("stibnite_crushed", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> ASTRITE_CRUSHED = ITEMS.register("astrite_crushed", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> THOUNITE_CRUSHED = ITEMS.register("thounite_crushed", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	
	public static final RegistryObject<Item> UVAROVITE_DUST = ITEMS.register("uvarovite_dust", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> KUNZITE_DUST = ITEMS.register("kunzite_dust",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> STIBNITE_DUST = ITEMS.register("stibnite_dust", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> ASTRITE_DUST = ITEMS.register("astrite_dust",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> THOUNITE_DUST = ITEMS.register("thounite_dust",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	
	public static final RegistryObject<Item> UVAROVITE_ROD = ITEMS.register("uvarovite_rod", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("createaddition") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> KUNZITE_ROD = ITEMS.register("kunzite_rod",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("createaddition") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> STIBNITE_ROD = ITEMS.register("stibnite_rod", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("createaddition") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> ASTRITE_ROD = ITEMS.register("astrite_rod",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("createaddition") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> THOUNITE_ROD = ITEMS.register("thounite_rod",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("createaddition") ? ItemGroup.MATERIALS : null)));
	
	public static final RegistryObject<Item> UVAROVITE_GEAR = ITEMS.register("uvarovite_gear", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> KUNZITE_GEAR = ITEMS.register("kunzite_gear",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> STIBNITE_GEAR = ITEMS.register("stibnite_gear", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> ASTRITE_GEAR = ITEMS.register("astrite_gear",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> THOUNITE_GEAR = ITEMS.register("thounite_gear",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null)));
	
	public static final RegistryObject<Item> UVAROVITE_PLATE = ITEMS.register("uvarovite_plate", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> KUNZITE_PLATE = ITEMS.register("kunzite_plate",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> STIBNITE_PLATE = ITEMS.register("stibnite_plate", 
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> ASTRITE_PLATE = ITEMS.register("astrite_plate",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	public static final RegistryObject<Item> THOUNITE_PLATE = ITEMS.register("thounite_plate",
			() -> new Item(new Item.Properties().group(ModList.get().isLoaded("thermal") ? ItemGroup.MATERIALS : null).group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));
	
	//molten material buckets
	public static final RegistryObject<Item> UVAROVITE_BUCKET = ITEMS.register("uvarovite_bucket",
            () -> new BucketItem(FluidInit.UVAROVITE,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> KUNZITE_BUCKET = ITEMS.register("kunzite_bucket",
            () -> new BucketItem(FluidInit.KUNZITE,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> STIBNITE_BUCKET = ITEMS.register("stibnite_bucket",
            () -> new BucketItem(FluidInit.STIBNITE,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> ASTRITE_BUCKET = ITEMS.register("astrite_bucket",
            () -> new BucketItem(FluidInit.ASTRITE,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> THOUNITE_BUCKET = ITEMS.register("thounite_bucket",
            () -> new BucketItem(FluidInit.THOUNITE,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	
	//fuel buckets
	public static final RegistryObject<Item> BLOODLAVA_BUCKET = ITEMS.register("bloodlava_bucket",
            () -> new BucketItem(FluidInit.BLOODLAVA,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> SCORCHINGBLOOD_BUCKET = ITEMS.register("scorchingblood_bucket",
            () -> new BucketItem(FluidInit.SCORCHINGBLOOD,
                    new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	
	//block items
	public static final RegistryObject<BlockItem> UVAROVITE_ORE = ITEMS.register("uvarovite_ore", 
			() -> new BlockItem(BlockInit.UVAROVITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> UVAROVITE_BLOCK = ITEMS.register("uvarovite_block", 
			() -> new BlockItem(BlockInit.UVAROVITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> KUNZITE_ORE = ITEMS.register("kunzite_ore", 
			() -> new BlockItem(BlockInit.KUNZITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> KUNZITE_BLOCK = ITEMS.register("kunzite_block", 
			() -> new BlockItem(BlockInit.KUNZITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> STIBNITE_ORE = ITEMS.register("stibnite_ore", 
			() -> new BlockItem(BlockInit.STIBNITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STIBNITE_BLOCK = ITEMS.register("stibnite_block", 
			() -> new BlockItem(BlockInit.STIBNITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> ASTRITE_ORE = ITEMS.register("astrite_ore", 
			() -> new BlockItem(BlockInit.ASTRITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ASTRITE_BLOCK = ITEMS.register("astrite_block", 
			() -> new BlockItem(BlockInit.ASTRITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> THOUNITE_BLOCK = ITEMS.register("thounite_block", 
			() -> new BlockItem(BlockInit.THOUNITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	

}






