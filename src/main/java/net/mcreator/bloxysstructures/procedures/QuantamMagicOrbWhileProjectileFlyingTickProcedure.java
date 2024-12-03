package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class QuantamMagicOrbWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, 0, 0, 0);
		immediatesourceentity.getPersistentData().putDouble("counter1", (immediatesourceentity.getPersistentData().getDouble("counter1") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("counter1") % 60 == 0) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
