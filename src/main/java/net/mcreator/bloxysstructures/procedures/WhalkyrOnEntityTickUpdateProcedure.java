package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

public class WhalkyrOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.push((entity.getLookAngle().x * 0.025), (entity.getLookAngle().y * 0.1), (entity.getLookAngle().z * 0.025));
	}
}
