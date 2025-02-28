package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.WhalkyrEntity;

public class WhalkyrDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof WhalkyrEntity _datEntI ? _datEntI.getEntityData().get(WhalkyrEntity.DATA_variant) : 0) == 2;
	}
}
