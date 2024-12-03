package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bloxysstructures.init.BloxysstructuresModEntities;
import net.mcreator.bloxysstructures.entity.BloxysScytheThrowableEntity;
import net.mcreator.bloxysstructures.entity.BloxyEntity;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof BloxyEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BloxyEntity.DATA_cooldown, (int) ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_cooldown) : 0) + 1));
			if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_cooldown) : 0) % 60 == 0) {
				if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_phase) : 0) == 0) {
					if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.HOSTILE, (float) 0.66, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.HOSTILE, (float) 0.66, 1, false);
							}
						}
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new BloxysScytheThrowableEntity(BloxysstructuresModEntities.BLOXYS_SCYTHE_THROWABLE.get(), level) {
											@Override
											public byte getPierceLevel() {
												return piercing;
											}

											@Override
											protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
												if (knockback > 0) {
													double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
													Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
													if (vec3.lengthSqr() > 0.0) {
														livingEntity.push(vec3.x, 0.1, vec3.z);
													}
												}
											}
										};
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 1, 1, (byte) 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 1);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scytheback, false);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_glowing, false);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("/execute at " + ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()) + " run tp " + entity.getStringUUID() + " ^ ^ ^-0.5"));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null,
										BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(),
												(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()),
										BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1);
							} else {
								_level.playLocalSound(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
										((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1,
										false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 5, 0, 2, 0, 0);
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 2);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 2) {
						for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 3); index0++) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scytheback, true);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_glowing, true);
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 0);
					}
				} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_phase) : 0) == 1) {
					if (entity instanceof BloxyEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 0);
					if (entity instanceof BloxyEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BloxyEntity.DATA_cooldown, 0);
					if (entity instanceof BloxyEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BloxyEntity.DATA_phase, 2);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("tp " + entity.getStringUUID() + " " + (entity instanceof BloxyEntity _datEntS ? _datEntS.getEntityData().get(BloxyEntity.DATA_spawncoords) : "")));
					BloxysstructuresMod.queueServerWork(8, () -> {
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scythehand, false);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_glowing, true);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scytheback, true);
					});
					new Object() {
						void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							final int tick2 = ticks;
							BloxysstructuresMod.queueServerWork(tick2, () -> {
								if (timedlooptotal > timedloopiterator + 1) {
									timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
								}
							});
						}
					}.timedLoop(0, 6, 1);
				} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_phase) : 0) == 2) {
					if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.HOSTILE, (float) 0.66, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.HOSTILE, (float) 0.66, 1, false);
							}
						}
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new BloxysScytheThrowableEntity(BloxysstructuresModEntities.BLOXYS_SCYTHE_THROWABLE.get(), level) {
											@Override
											public byte getPierceLevel() {
												return piercing;
											}

											@Override
											protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
												if (knockback > 0) {
													double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
													Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
													if (vec3.lengthSqr() > 0.0) {
														livingEntity.push(vec3.x, 0.1, vec3.z);
													}
												}
											}
										};
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 1, 1, (byte) 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 1);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scytheback, false);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_glowing, false);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("/execute at " + ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()) + " run tp " + entity.getStringUUID() + " ^ ^ ^-0.5"));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null,
										BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(),
												(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()),
										BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1);
							} else {
								_level.playLocalSound(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
										((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.HOSTILE, (float) 0.5, 1,
										false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 5, 0, 2, 0, 0);
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 2);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 2) {
						for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 3); index1++) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bloxysstructures:shockwave")), SoundSource.HOSTILE, (float) 0.5, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bloxysstructures:shockwave")), SoundSource.HOSTILE, (float) 0.5, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 8, 2, 2, 2, 0);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BloxysstructuresModEntities.PURPLE_LIGHTNING_SHOCKWAVE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 3);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 3) {
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
										AbstractHurtingProjectile entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setDeltaMovement(new Vec3(ax, ay, az));
										entityToSpawn.hasImpulse = true;
										return entityToSpawn;
									}
								}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 4);
					} else if ((entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_attack) : 0) == 4) {
						for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 3); index2++) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() < 0.5) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = BloxysstructuresModEntities.QUANTUM_GUARDIAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						} else if (Math.random() < 0.5) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = BloxysstructuresModEntities.VOID_WALKERS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						}
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_scytheback, true);
						if (entity instanceof BloxyEntity _datEntSetL)
							_datEntSetL.getEntityData().set(BloxyEntity.DATA_glowing, true);
						if (entity instanceof BloxyEntity _datEntSetI)
							_datEntSetI.getEntityData().set(BloxyEntity.DATA_attack, 0);
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 200 && (entity instanceof BloxyEntity _datEntI ? _datEntI.getEntityData().get(BloxyEntity.DATA_phase) : 0) == 0) {
			if (entity instanceof BloxyEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BloxyEntity.DATA_phase, 1);
		}
	}
}
