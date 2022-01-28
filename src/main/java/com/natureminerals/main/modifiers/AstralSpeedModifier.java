package com.natureminerals.main.modifiers;

import java.util.UUID;
import java.util.function.BiConsumer;

import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class AstralSpeedModifier extends Modifier {
	private static final UUID ATTRIBUTE_UUID = UUID.fromString("f8a6e738-642b-11eb-ae93-0242ac130002");

	public AstralSpeedModifier() {
		super(0xFF3222);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(event.getPlayer().isCrouching() && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 1.25f));	
		}
	}
	
	@Override
	public void addAttributes(IModifierToolStack tool, int level, EquipmentSlotType slot, BiConsumer<Attribute, AttributeModifier> consumer) {
		consumer.accept(Attributes.MOVEMENT_SPEED, new AttributeModifier(ATTRIBUTE_UUID, "astral_speed", level * 0.1, Operation.MULTIPLY_BASE));
	}
}
