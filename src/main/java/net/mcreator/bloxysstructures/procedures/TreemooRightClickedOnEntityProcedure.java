package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.entity.TreemooEntity;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class TreemooRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TreemooEntity _datEntL0 && _datEntL0.getEntityData().get(TreemooEntity.DATA_sheared)) == false) {
			if (itemstack.getItem() == Items.SHEARS) {
				if (!(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.mooshroom.shear")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 1.1));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.mooshroom.shear")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 1.1), false);
					}
				}
				if (entity instanceof TreemooEntity _datEntSetL)
					_datEntSetL.getEntityData().set(TreemooEntity.DATA_sheared, true);
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 2, 3); index0++) {
					if ((entity instanceof TreemooEntity _datEntI ? _datEntI.getEntityData().get(TreemooEntity.DATA_tree) : 0) == 0) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 2), z, new ItemStack(Blocks.BIRCH_SAPLING));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if ((entity instanceof TreemooEntity _datEntI ? _datEntI.getEntityData().get(TreemooEntity.DATA_tree) : 0) == 1) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 2), z, new ItemStack(Blocks.OAK_SAPLING));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if ((entity instanceof TreemooEntity _datEntI ? _datEntI.getEntityData().get(TreemooEntity.DATA_tree) : 0) == 2) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 2), z, new ItemStack(Blocks.SPRUCE_SAPLING));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if ((entity instanceof TreemooEntity _datEntI ? _datEntI.getEntityData().get(TreemooEntity.DATA_tree) : 0) == 3) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 2), z, new ItemStack(Blocks.CHERRY_SAPLING));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				BloxysstructuresMod.queueServerWork(2400, () -> {
					if (entity instanceof TreemooEntity _datEntSetL)
						_datEntSetL.getEntityData().set(TreemooEntity.DATA_sheared, false);
				});
			}
		} else if ((entity instanceof TreemooEntity _datEntL20 && _datEntL20.getEntityData().get(TreemooEntity.DATA_sheared)) == true) {
			if (itemstack.getItem() == Items.BONE_MEAL) {
				if (!(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					itemstack.shrink(1);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 1.1));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 1.1), false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 5, 2, 2, 2, 0.125);
				if (entity instanceof TreemooEntity _datEntSetL)
					_datEntSetL.getEntityData().set(TreemooEntity.DATA_sheared, false);
			}
		}
	}
}
