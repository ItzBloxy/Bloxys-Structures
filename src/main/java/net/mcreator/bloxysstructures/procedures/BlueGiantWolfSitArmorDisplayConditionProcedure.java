package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

public class BlueGiantWolfSitArmorDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof GiantWolfEntity _datEntL0 && _datEntL0.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true && (entity instanceof GiantWolfEntity _datEntL1 && _datEntL1.getEntityData().get(GiantWolfEntity.DATA_Sitting)) == true
				&& (entity instanceof GiantWolfEntity _datEntS ? _datEntS.getEntityData().get(GiantWolfEntity.DATA_color) : "").equals("blue");
	}
}
