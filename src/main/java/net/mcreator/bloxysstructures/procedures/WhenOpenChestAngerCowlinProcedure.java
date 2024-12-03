package net.mcreator.bloxysstructures.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.entity.CowlinEntity;
import net.mcreator.bloxysstructures.entity.CowlinBruteEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@EventBusSubscriber
public class WhenOpenChestAngerCowlinProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("bloxysstructures:adventure_realm"))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHEST || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BARREL) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof CowlinBruteEntity) {
								if (entityiterator instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1.1);
								if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
							}
							if (entityiterator instanceof CowlinEntity) {
								if (entityiterator instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1.1);
								if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
							}
						}
					}
				}
			}
		}
	}
}
