package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.network.BloxysstructuresModVariables;

public class BloxysScytheCallBackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES).CalledBackScythe > 1) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.return")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.trident.return")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			{
				BloxysstructuresModVariables.PlayerVariables _vars = entity.getData(BloxysstructuresModVariables.PLAYER_VARIABLES);
				_vars.CalledBackScythe = 130;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
