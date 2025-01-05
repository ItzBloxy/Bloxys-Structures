package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.TreemooEntity;

public class SpruceTreemooDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof TreemooEntity _datEntI ? _datEntI.getEntityData().get(TreemooEntity.DATA_tree) : 0) == 2 && (entity instanceof TreemooEntity _datEntL1 && _datEntL1.getEntityData().get(TreemooEntity.DATA_sheared)) == false;
	}
}
