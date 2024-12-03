package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class PurplePoisonEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 16) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
			BloxysstructuresMod.queueServerWork(1, () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
				BloxysstructuresMod.queueServerWork(1, () -> {
					entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
					BloxysstructuresMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
						BloxysstructuresMod.queueServerWork(1, () -> {
							entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
						});
					});
				});
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 12) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
			BloxysstructuresMod.queueServerWork(1, () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
				BloxysstructuresMod.queueServerWork(1, () -> {
					entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
					BloxysstructuresMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
					});
				});
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 4) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
			BloxysstructuresMod.queueServerWork(1, () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
				BloxysstructuresMod.queueServerWork(1, () -> {
					entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
				});
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 4) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
			BloxysstructuresMod.queueServerWork(1, () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:purple_poison_damage")))), 1);
			});
		}
	}
}
