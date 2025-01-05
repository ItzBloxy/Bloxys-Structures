package net.mcreator.bloxysstructures.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.entity.TreemooEntity;
import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OnEntitySpawnDoStuffProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Sniffer) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity5.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 2, 6)));
				if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
					_livingEntity6.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(1.6);
			}
		} else if (entity instanceof Warden) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity11.getAttribute(Attributes.SCALE).setBaseValue(2);
				if (entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
					_livingEntity12.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(16);
				if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
					_livingEntity13.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(16);
			}
		} else if (entity instanceof Frog) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity19.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 4, 6)));
				if (entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity20.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(1.75);
			}
		} else if (entity instanceof Cow) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity26.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 2, 2.5)));
			}
		} else if (entity instanceof Pig) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity32.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 2, 2.5)));
			}
		} else if (entity instanceof GiantWolfEntity) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity38.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 1, 1.125)));
			}
		} else if (entity.getType().is(EntityTypeTags.ILLAGER)) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity44.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 0.95, 1.1)));
			}
		} else if (entity.getType().is(EntityTypeTags.UNDEAD)) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity.getY() < 0) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.LEATHER_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.LEATHER_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.LEATHER_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.IRON_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.IRON_BOOTS));
						}
					}
				}
			}
		} else if (entity instanceof Chicken) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity58.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 2, 4)));
			}
		} else if (entity instanceof Goat) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity64.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 2, 4)));
			}
		} else if (entity instanceof Rabbit) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity70 && _livingEntity70.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity70.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 4, 6)));
			}
		} else if (entity instanceof TreemooEntity) {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
				if (entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity76.getAttribute(Attributes.SCALE).setBaseValue((Mth.nextDouble(RandomSource.create(), 1, 2)));
			}
		}
	}
}
