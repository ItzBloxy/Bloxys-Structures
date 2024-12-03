package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.bloxysstructures.init.BloxysstructuresModItems;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class InfernoHydraEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BloxysstructuresMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 2), z, new ItemStack(BloxysstructuresModItems.SHIELD_OF_INFERNO.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		});
	}
}
