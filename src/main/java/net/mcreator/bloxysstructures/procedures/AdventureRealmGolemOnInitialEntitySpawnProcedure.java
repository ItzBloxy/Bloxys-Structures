package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.bloxysstructures.entity.AdventureRealmGolemEntity;

public class AdventureRealmGolemOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AdventureRealmGolemEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AdventureRealmGolemEntity.DATA_size, Mth.nextInt(RandomSource.create(), 1, 2));
	}
}
