package com.natureminerals.main.modifiers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class LifeStealModifier extends Modifier {

	public LifeStealModifier() {
		super(0xCF6284);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		context.getAttacker().getLastDamageSource();
		DamageSource.causeIndirectMagicDamage(context.getAttacker(), context.getTarget());
		return damage;
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		Entity target = context.getTarget();
		LivingEntity attacker = context.getAttacker();
		if(attacker instanceof PlayerEntity && target instanceof MobEntity) {
			if(context.getCooldown() > 0.9 && damageDealt > 0) {
				attacker.addPotionEffect(new EffectInstance(Effects.ABSORPTION, level * 50, (int) (damageDealt/4)));
			}
		}
		return 0;
		
	}
}
