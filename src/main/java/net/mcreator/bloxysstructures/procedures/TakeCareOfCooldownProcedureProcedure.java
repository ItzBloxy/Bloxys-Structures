package net.mcreator.bloxysstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.bloxysstructures.network.BloxysstructuresModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TakeCareOfCooldownProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythethrowcooldown > 0) {
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.scythethrowcooldown = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythethrowcooldown - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
