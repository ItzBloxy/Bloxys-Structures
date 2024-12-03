package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.network.BloxysstructuresModVariables;

public class BloxysScytheToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythecooldown == false) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 0);
		}
	}
}
