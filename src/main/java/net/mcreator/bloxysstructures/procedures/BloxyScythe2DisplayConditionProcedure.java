package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.BloxyEntity;

public class BloxyScythe2DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof BloxyEntity _datEntL0 && _datEntL0.getEntityData().get(BloxyEntity.DATA_scytheback);
	}
}
