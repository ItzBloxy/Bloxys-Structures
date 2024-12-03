package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;

public class QuantamMagicOrbProjectileHitsPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(BloxysstructuresModMobEffects.PURPLE_POISON, 60, 0, false, false));
			}
		}
	}
}
