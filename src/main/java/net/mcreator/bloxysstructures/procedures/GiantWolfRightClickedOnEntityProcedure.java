package net.mcreator.bloxysstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.init.BloxysstructuresModItems;
import net.mcreator.bloxysstructures.entity.GiantWolfEntity;

public class GiantWolfRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && !sourceentity.isShiftKeyDown()) {
			if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BloxysstructuresModItems.GIANT_WOLF_ARMOR.get())
					&& !((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("bloxysstructures:giant_wolf_food"))))
					&& (entity instanceof GiantWolfEntity _datEntL6 && _datEntL6.getEntityData().get(GiantWolfEntity.DATA_Sitting)) == false) {
				if (entity instanceof GiantWolfEntity _datEntSetL)
					_datEntSetL.getEntityData().set(GiantWolfEntity.DATA_Sitting, true);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Dog is now sitting"), true);
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			} else {
				if (entity instanceof GiantWolfEntity _datEntSetL)
					_datEntSetL.getEntityData().set(GiantWolfEntity.DATA_Sitting, false);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Dog stopped sitting"), true);
			}
		} else if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.isShiftKeyDown()
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, (y + 2), z, 1, 0.1, 0.1, 0.1, 1);
			if (Math.random() < 0.33) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.whine")), SoundSource.NEUTRAL, (float) 0.8, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.whine")), SoundSource.NEUTRAL, (float) 0.8, 1, false);
					}
				}
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BloxysstructuresModItems.GIANT_WOLF_ARMOR.get()
				&& (entity instanceof GiantWolfEntity _datEntL21 && _datEntL21.getEntityData().get(GiantWolfEntity.DATA_Armor)) == false) {
			if (entity instanceof GiantWolfEntity _datEntSetL)
				_datEntSetL.getEntityData().set(GiantWolfEntity.DATA_Armor, true);
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BloxysstructuresModItems.GIANT_WOLF_ARMOR.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Applied Dog Armor"), true);
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHITE_DYE
				&& (entity instanceof GiantWolfEntity _datEntL28 && _datEntL28.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "white");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.WHITE_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLACK_DYE
				&& (entity instanceof GiantWolfEntity _datEntL34 && _datEntL34.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "black");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BLACK_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLUE_DYE
				&& (entity instanceof GiantWolfEntity _datEntL40 && _datEntL40.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "blue");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BLUE_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BROWN_DYE
				&& (entity instanceof GiantWolfEntity _datEntL46 && _datEntL46.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "brown");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BROWN_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CYAN_DYE
				&& (entity instanceof GiantWolfEntity _datEntL52 && _datEntL52.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "cyan");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.CYAN_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIGHT_GRAY_DYE
				&& (entity instanceof GiantWolfEntity _datEntL58 && _datEntL58.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "light_gray");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.LIGHT_GRAY_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GREEN_DYE
				&& (entity instanceof GiantWolfEntity _datEntL64 && _datEntL64.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "green");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GREEN_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GRAY_DYE
				&& (entity instanceof GiantWolfEntity _datEntL70 && _datEntL70.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "gray");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GRAY_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ORANGE_DYE
				&& (entity instanceof GiantWolfEntity _datEntL76 && _datEntL76.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "orange");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.ORANGE_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MAGENTA_DYE
				&& (entity instanceof GiantWolfEntity _datEntL82 && _datEntL82.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "magenta");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.MAGENTA_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIME_DYE
				&& (entity instanceof GiantWolfEntity _datEntL88 && _datEntL88.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "lime");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.LIME_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RED_DYE
				&& (entity instanceof GiantWolfEntity _datEntL94 && _datEntL94.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "red");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.RED_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PINK_DYE
				&& (entity instanceof GiantWolfEntity _datEntL100 && _datEntL100.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "pink");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.PINK_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PURPLE_DYE
				&& (entity instanceof GiantWolfEntity _datEntL106 && _datEntL106.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "purple");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.PURPLE_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.YELLOW_DYE
				&& (entity instanceof GiantWolfEntity _datEntL112 && _datEntL112.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "yellow");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.YELLOW_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIGHT_BLUE_DYE
				&& (entity instanceof GiantWolfEntity _datEntL118 && _datEntL118.getEntityData().get(GiantWolfEntity.DATA_Armor)) == true) {
			if (entity instanceof GiantWolfEntity _datEntSetS)
				_datEntSetS.getEntityData().set(GiantWolfEntity.DATA_color, "light_blue");
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.LIGHT_BLUE_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
