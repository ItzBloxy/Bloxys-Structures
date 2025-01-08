package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.network.BloxysstructuresModVariables;
import net.mcreator.bloxysstructures.init.BloxysstructuresModEntities;
import net.mcreator.bloxysstructures.entity.BloxysScytheThrowablePlayerEntity;

public class BloxysScytheRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythecooldown == false) {
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.scythecooldown = true;
				_vars.syncPlayerVariables(entity);
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new BloxysScytheThrowablePlayerEntity(BloxysstructuresModEntities.BLOXYS_SCYTHE_THROWABLE_PLAYER.get(), level) {
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
					}.getArrow(projectileLevel, entity, 3, (int) 0.5, (byte) 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.throw")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 130);
		} else if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythecooldown == true) {
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.scythecooldown = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
