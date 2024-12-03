package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloxysstructures.init.BloxysstructuresModMobEffects;
import net.mcreator.bloxysstructures.entity.QuantumGuardianEntity;

import java.util.List;
import java.util.Comparator;

public class QuantumGuardianOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof QuantumGuardianEntity _datEntI ? _datEntI.getEntityData().get(QuantumGuardianEntity.DATA_runicactive) : 0) > 40) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) * 0.25), ((entity.getY() - entityiterator.getY()) * 0.5), ((entity.getZ() - entityiterator.getZ()) * 0.25)));
						if (!(entityiterator instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(BloxysstructuresModMobEffects.PURPLE_POISON))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(BloxysstructuresModMobEffects.PURPLE_POISON, 50, 0, false, false));
						}
					}
				}
			}
		}
		if ((entity instanceof QuantumGuardianEntity _datEntI ? _datEntI.getEntityData().get(QuantumGuardianEntity.DATA_runicactive) : 0) == 140) {
			if (entity instanceof QuantumGuardianEntity _datEntSetI)
				_datEntSetI.getEntityData().set(QuantumGuardianEntity.DATA_runicactive, 0);
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (entity instanceof QuantumGuardianEntity _datEntSetI)
				_datEntSetI.getEntityData().set(QuantumGuardianEntity.DATA_runicactive, (int) ((entity instanceof QuantumGuardianEntity _datEntI ? _datEntI.getEntityData().get(QuantumGuardianEntity.DATA_runicactive) : 0) + 1));
		}
	}
}
