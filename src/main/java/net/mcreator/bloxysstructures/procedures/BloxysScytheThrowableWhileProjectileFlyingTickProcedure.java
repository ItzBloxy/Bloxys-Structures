package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BloxysScytheThrowableWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		immediatesourceentity.getPersistentData().putDouble("counter3", (immediatesourceentity.getPersistentData().getDouble("counter3") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("counter3") % 4 == 0) {
			{
				Entity _ent = immediatesourceentity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "function bloxysstructures:bloxyparticlefunction");
				}
			}
		}
		immediatesourceentity.getPersistentData().putDouble("counter1", (immediatesourceentity.getPersistentData().getDouble("counter1") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("counter1") % 60 == 0) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
