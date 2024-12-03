package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.QuantumGuardianEntity;

public class QuantumGuardianDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof QuantumGuardianEntity _datEntI ? _datEntI.getEntityData().get(QuantumGuardianEntity.DATA_runicactive) : 0) > 60;
	}
}
