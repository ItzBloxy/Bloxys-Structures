package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.QuantumMageEntity;

public class QuantumMageDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_orbs) : 0) == 4;
	}
}
