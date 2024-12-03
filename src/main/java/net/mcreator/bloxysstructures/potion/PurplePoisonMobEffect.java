
package net.mcreator.bloxysstructures.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.bloxysstructures.procedures.PurplePoisonEffectStartedappliedProcedure;

public class PurplePoisonMobEffect extends MobEffect {
	public PurplePoisonMobEffect() {
		super(MobEffectCategory.HARMFUL, -4849409);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		PurplePoisonEffectStartedappliedProcedure.execute(entity.level(), entity);
	}
}
