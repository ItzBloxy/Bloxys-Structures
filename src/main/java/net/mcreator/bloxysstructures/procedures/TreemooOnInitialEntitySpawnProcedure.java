package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.bloxysstructures.entity.TreemooEntity;

public class TreemooOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TreemooEntity _datEntSetI)
			_datEntSetI.getEntityData().set(TreemooEntity.DATA_tree, Mth.nextInt(RandomSource.create(), 0, 3));
	}
}
