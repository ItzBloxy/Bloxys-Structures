package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;

public class MushroomKingPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!(sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON))) {
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(BloxysstructuresModMobEffects.PURPLE_POISON, 160, 0));
		}
	}
}
