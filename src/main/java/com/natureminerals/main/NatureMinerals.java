package com.natureminerals.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.natureminerals.main.init.BlockInit;
import com.natureminerals.main.init.FluidInit;
import com.natureminerals.main.init.ItemInit;
import com.natureminerals.main.init.ModifierInit;
import com.natureminerals.main.init.equipment.EquipmentInit;
import com.natureminerals.main.init.food.FoodInit;
import com.natureminerals.main.world.OreGeneration;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NatureMinerals.MODID)
public class NatureMinerals {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "natureminerals";
	
	public NatureMinerals() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		FluidInit.FLUIDS.register(bus);
		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		FoodInit.FOODS.register(bus);
		EquipmentInit.EQUIP.register(bus);
		ModifierInit.MODIFIERS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOre);
		
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(MODID, name);
	}
}
