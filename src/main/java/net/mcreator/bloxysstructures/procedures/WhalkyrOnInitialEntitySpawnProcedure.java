package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.bloxysstructures.entity.WhalkyrEntity;

public class WhalkyrOnInitialEntitySpawnProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (y + Mth.nextDouble(RandomSource.create(), 96, 196)), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (y + Mth.nextDouble(RandomSource.create(), 96, 196)), z, _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof WhalkyrEntity _datEntSetI)
			_datEntSetI.getEntityData().set(WhalkyrEntity.DATA_variant, Mth.nextInt(RandomSource.create(), 0, 4));
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.SCALE))
			_livingEntity5.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 1, 2)));
		if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.FLYING_SPEED))
			_livingEntity6.getAttribute(Attributes.FLYING_SPEED).setBaseValue(2);
	}
}
