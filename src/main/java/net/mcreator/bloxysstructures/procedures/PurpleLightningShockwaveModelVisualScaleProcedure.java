package net.mcreator.bloxysstructures.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.entity.PurpleLightningShockwaveEntity;

public class PurpleLightningShockwaveModelVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(entity instanceof PurpleLightningShockwaveEntity _datEntS ? _datEntS.getEntityData().get(PurpleLightningShockwaveEntity.DATA_sizestring) : "");
	}
}
