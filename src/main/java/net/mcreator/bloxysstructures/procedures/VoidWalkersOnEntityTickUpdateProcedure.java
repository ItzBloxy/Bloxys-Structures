package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bloxysstructures.entity.VoidWalkersEntity;

public class VoidWalkersOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particleAmount = 0;
		double particleRadius = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof VoidWalkersEntity _datEntSetI)
				_datEntSetI.getEntityData().set(VoidWalkersEntity.DATA_special, (int) ((entity instanceof VoidWalkersEntity _datEntI ? _datEntI.getEntityData().get(VoidWalkersEntity.DATA_special) : 0) + 1));
			if ((entity instanceof VoidWalkersEntity _datEntI ? _datEntI.getEntityData().get(VoidWalkersEntity.DATA_special) : 0) == 60) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("/execute at " + ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()) + " run tp " + entity.getStringUUID() + " ^ ^ ^-0.5"));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1, false);
					}
				}
				if (entity instanceof VoidWalkersEntity _datEntSetI)
					_datEntSetI.getEntityData().set(VoidWalkersEntity.DATA_special, 0);
			}
		}
		if ((entity instanceof VoidWalkersEntity _datEntI ? _datEntI.getEntityData().get(VoidWalkersEntity.DATA_special) : 0) == 50) {
			for (int index0 = 0; index0 < 8; index0++) {
				world.addParticle(ParticleTypes.LARGE_SMOKE, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * 2), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * 2), (z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * 2),
						(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
			}
		}
	}
}
