package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;

public class PurplePoisonOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON);
	}
}
