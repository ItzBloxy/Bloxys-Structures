package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.bloxysstructures.init.BloxysstructuresModEntities;
import net.mcreator.bloxysstructures.entity.QuantumMageEntity;
import net.mcreator.bloxysstructures.entity.QuantamMagicOrbEntity;

public class QuantumMageOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof QuantumMageEntity _datEntSetI)
				_datEntSetI.getEntityData().set(QuantumMageEntity.DATA_delay, (int) ((entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_delay) : 0) + 1));
			if ((entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_delay) : 0) % 20 == 0) {
				if (entity instanceof QuantumMageEntity _datEntSetI)
					_datEntSetI.getEntityData().set(QuantumMageEntity.DATA_orbs, (int) ((entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_orbs) : 0) - 1));
				if ((entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_orbs) : 0) < 5) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1.75),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new QuantamMagicOrbEntity(BloxysstructuresModEntities.QUANTAM_MAGIC_ORB.get(), level) {
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
							}.getArrow(projectileLevel, entity, 3, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.85, (float) 0.25);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.blaze.shoot")), SoundSource.HOSTILE, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.blaze.shoot")), SoundSource.HOSTILE, (float) 0.5, 1, false);
						}
					}
				}
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if ((entity instanceof QuantumMageEntity _datEntI ? _datEntI.getEntityData().get(QuantumMageEntity.DATA_orbs) : 0) == 0) {
				if (entity instanceof QuantumMageEntity _datEntSetI)
					_datEntSetI.getEntityData().set(QuantumMageEntity.DATA_orbs, 8);
			}
		}
	}
}
