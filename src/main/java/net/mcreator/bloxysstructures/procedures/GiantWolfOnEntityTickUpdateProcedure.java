package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

public class GiantWolfOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof GiantWolfEntity _datEntL0 && _datEntL0.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9999, 1, false, false));
		}
	}
}
