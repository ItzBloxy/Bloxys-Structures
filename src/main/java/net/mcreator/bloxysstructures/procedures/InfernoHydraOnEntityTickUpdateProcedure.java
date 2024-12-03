package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bloxysstructures.entity.InfernoHydraEntity;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class InfernoHydraOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof InfernoHydraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(InfernoHydraEntity.DATA_attackcooldown, (int) ((entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackcooldown) : 0) + 1));
			entity.setOnGround(true);
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player && (entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackcooldown) : 0) > 20
				&& (entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackselected) : 0) < 5) {
			if (entity instanceof InfernoHydraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(InfernoHydraEntity.DATA_attackcooldown, 0);
			if (entity instanceof InfernoHydraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(InfernoHydraEntity.DATA_attackselected, (int) ((entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackselected) : 0) + 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute at @e[type=bloxysstructures:inferno_hydra] run fill ~-5 ~-5 ~-5 ~5 ~5 ~5 air replace chain");
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
					((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
							AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setDeltaMovement(new Vec3(ax, ay, az));
							entityToSpawn.hasImpulse = true;
							return entityToSpawn;
						}
					}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player && (entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackcooldown) : 0) > 20
				&& (entity instanceof InfernoHydraEntity _datEntI ? _datEntI.getEntityData().get(InfernoHydraEntity.DATA_attackselected) : 0) > 4) {
			if (entity instanceof InfernoHydraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(InfernoHydraEntity.DATA_attackcooldown, -26);
			if (entity instanceof InfernoHydraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(InfernoHydraEntity.DATA_attackselected, 0);
			BloxysstructuresMod.queueServerWork(2, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8, false);
					}
				}
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
						((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
								AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setDeltaMovement(new Vec3(ax, ay, az));
								entityToSpawn.hasImpulse = true;
								return entityToSpawn;
							}
						}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				BloxysstructuresMod.queueServerWork(2, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8, false);
						}
					}
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
									AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setDeltaMovement(new Vec3(ax, ay, az));
									entityToSpawn.hasImpulse = true;
									return entityToSpawn;
								}
							}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					BloxysstructuresMod.queueServerWork(2, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.ghast.shoot")), SoundSource.HOSTILE, (float) 0.5, (float) 0.8, false);
							}
						}
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
										AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setDeltaMovement(new Vec3(ax, ay, az));
										entityToSpawn.hasImpulse = true;
										return entityToSpawn;
									}
								}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					});
				});
			});
		}
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1, (entity.getLookAngle().z)));
		}
	}
}
