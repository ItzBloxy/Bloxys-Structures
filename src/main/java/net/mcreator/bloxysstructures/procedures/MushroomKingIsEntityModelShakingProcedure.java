package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.MushroomKingEntity;

public class MushroomKingIsEntityModelShakingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof MushroomKingEntity _datEntI ? _datEntI.getEntityData().get(MushroomKingEntity.DATA_attackcooldown) : 0) > 160;
	}
}
