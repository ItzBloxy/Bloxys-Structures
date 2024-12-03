package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.bloxysstructures.entity.PrinceOfDarknessEntity;

import java.util.List;
import java.util.Comparator;

public class PrinceOfDarknessOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) == 230) {
			if (entity instanceof PrinceOfDarknessEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrinceOfDarknessEntity.DATA_selectedattack, Mth.nextInt(RandomSource.create(), 1, 2));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof PrinceOfDarknessEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrinceOfDarknessEntity.DATA_Shockwave, (int) ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) + 1));
			if (Math.random() < 0.03 && (entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) > 120
					&& (entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) < 200) {
				if (entity instanceof PrinceOfDarknessEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PrinceOfDarknessEntity.DATA_forcelook, false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 3, 0, 1, 0, 0.25);
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) == 300) {
			if (entity instanceof PrinceOfDarknessEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PrinceOfDarknessEntity.DATA_forcelook, false);
			if (entity instanceof PrinceOfDarknessEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrinceOfDarknessEntity.DATA_Shockwave, 0);
			if (entity instanceof PrinceOfDarknessEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrinceOfDarknessEntity.DATA_selectedattack, 0);
		}
		if ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_Shockwave) : 0) == 240) {
			if ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_selectedattack) : 0) == 1) {
				if (entity instanceof PrinceOfDarknessEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PrinceOfDarknessEntity.DATA_forcelook, false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 16, 0, 1, 0, 0.25);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bloxysstructures:shockwave")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bloxysstructures:shockwave")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
						}
					}
				}
				if (entity instanceof PrinceOfDarknessEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PrinceOfDarknessEntity.DATA_forcelook, false);
			}
			if ((entity instanceof PrinceOfDarknessEntity _datEntI ? _datEntI.getEntityData().get(PrinceOfDarknessEntity.DATA_selectedattack) : 0) == 2) {
				if (entity instanceof PrinceOfDarknessEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PrinceOfDarknessEntity.DATA_forcelook, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, false, false));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1, false, false));
						}
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 120, 1));
				}
				if (entityiterator instanceof Player) {
					if ((entity instanceof PrinceOfDarknessEntity _datEntL41 && _datEntL41.getEntityData().get(PrinceOfDarknessEntity.DATA_forcelook)) == true) {
						entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY() + 3), (entity.getZ())));
					}
				}
			}
		}
	}
}
