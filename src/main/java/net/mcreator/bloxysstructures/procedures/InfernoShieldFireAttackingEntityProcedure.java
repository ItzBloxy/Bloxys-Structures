package net.mcreator.bloxysstructures.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;
import net.mcreator.bloxysstructures.init.BloxysstructuresModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class InfernoShieldFireAttackingEntityProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.isBlocking() && ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BloxysstructuresModItems.SHIELD_OF_INFERNO.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == BloxysstructuresModItems.SHIELD_OF_INFERNO.get())) {
				sourceentity.igniteForSeconds(5);
				entity.clearFire();
			}
		}
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity _livEnt9 && _livEnt9.isBlocking()
					&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("bloxysstructures:purple_poison_enchantment")))) != 0
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(
									world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("bloxysstructures:purple_poison_enchantment")))) != 0)) {
				if (!(sourceentity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(BloxysstructuresModMobEffects.PURPLE_POISON, 100, 0));
				}
			}
		}
	}
}
