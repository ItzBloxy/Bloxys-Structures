package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.AdventureRealmGolemEntity;

public class AdventureRealmGolemModelVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof AdventureRealmGolemEntity _datEntI ? _datEntI.getEntityData().get(AdventureRealmGolemEntity.DATA_size) : 0;
	}
}
