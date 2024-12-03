package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

public class GiantWolfHealth20Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 20 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 35
				&& (entity instanceof GiantWolfEntity _datEntL2 && _datEntL2.getEntityData().get(GiantWolfEntity.DATA_Sitting)) == false;
	}
}
