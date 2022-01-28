package com.natureminerals.main.modifiers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class NetherCrushingModifier extends Modifier {
	
	public NetherCrushingModifier() {
		super(0xB7C3DE);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		PlayerEntity player = event.getPlayer();
		if (isEffective) {
			if (player.world.getWorldInfo() == World.THE_NETHER.getLocation()) {
				event.setNewSpeed(event.getNewSpeed() * (level * 5.0f));
			}
		}
	}
}