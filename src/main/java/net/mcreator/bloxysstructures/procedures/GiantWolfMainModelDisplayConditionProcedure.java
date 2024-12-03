package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

public class GiantWolfMainModelDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof GiantWolfEntity _datEntL0 && _datEntL0.getEntityData().get(GiantWolfEntity.DATA_Sitting)) == false;
	}
}
