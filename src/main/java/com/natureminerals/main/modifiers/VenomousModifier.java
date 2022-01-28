package com.natureminerals.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class VenomousModifier extends Modifier {

	public VenomousModifier() {
		super(0x30D513);

	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if(context.getCooldown() > 0.9 && damageDealt > 0) {
			target.addPotionEffect(new EffectInstance(Effects.POISON, level * 50, 0));
		}
		return 0;
	}

}
