package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bloxysstructures.network.BloxysstructuresModVariables;

public class BloxysScytheThrowablePlayerWhileProjectileFlyingTickProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).scythecooldown == false) {
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.scythecooldown = false;
				_vars.syncPlayerVariables(entity);
			}
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		immediatesourceentity.setNoGravity(true);
		if (immediatesourceentity instanceof LivingEntity _entity)
			_entity.setDiscardFriction(false);
		immediatesourceentity.getPersistentData().putDouble("counter3", (immediatesourceentity.getPersistentData().getDouble("counter3") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("counter3") % 6 == 0) {
			{
				Entity _ent = immediatesourceentity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "function bloxysstructures:bloxyparticlefunction");
				}
			}
		}
		immediatesourceentity.getPersistentData().putDouble("counter1", (immediatesourceentity.getPersistentData().getDouble("counter1") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("counter1") % 120 == 0) {
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.CalledBackScythe = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.scythecooldown = false;
				_vars.syncPlayerVariables(entity);
			}
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
