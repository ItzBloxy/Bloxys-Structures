package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;

public class PurpleLightningShockwavePlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON))) {
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(BloxysstructuresModMobEffects.PURPLE_POISON, 40, 0));
		}
		sourceentity.setDeltaMovement(new Vec3(((entity.getX() - sourceentity.getX()) * 0.25 * (-1)), ((entity.getY() - sourceentity.getY()) * 0.5), ((entity.getZ() - sourceentity.getZ()) * 0.25 * (-1))));
	}
}
