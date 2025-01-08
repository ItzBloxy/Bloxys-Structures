package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class DarknessArmLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double falldamage = 0;
		falldamage = Math.floor(sourceentity.fallDistance);
		entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("bloxysstructures:darkness")))), (float) falldamage);
		sourceentity.fallDistance = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.mace.smash_ground_heavy")), SoundSource.PLAYERS, (float) (falldamage * 0.1),
						(float) Mth.nextDouble(RandomSource.create(), 0.9, 1));
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.mace.smash_ground_heavy")), SoundSource.PLAYERS, (float) (falldamage * 0.1), (float) Mth.nextDouble(RandomSource.create(), 0.9, 1), false);
			}
		}
	}
}
