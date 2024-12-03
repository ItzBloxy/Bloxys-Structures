package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.BloxyEntity;

public class BloxyOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BloxyEntity _datEntSetS)
			_datEntSetS.getEntityData().set(BloxyEntity.DATA_spawncoords, (entity.getX() + " " + entity.getY() + " " + entity.getZ()));
	}
}
