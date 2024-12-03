
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.bloxysstructures.item.ShieldOfInfernoItem;
import net.mcreator.bloxysstructures.item.GiantWolfArmorItem;
import net.mcreator.bloxysstructures.item.DarknessArmItem;
import net.mcreator.bloxysstructures.item.BloxysScytheItem;
import net.mcreator.bloxysstructures.item.AdventureRealmItem;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxysstructuresModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BloxysstructuresMod.MODID);
	public static final DeferredItem<Item> ADVENTURE_REALM = REGISTRY.register("adventure_realm", AdventureRealmItem::new);
	public static final DeferredItem<Item> MJIN_LOG = block(BloxysstructuresModBlocks.MJIN_LOG);
	public static final DeferredItem<Item> MJIN_PLANKS = block(BloxysstructuresModBlocks.MJIN_PLANKS);
	public static final DeferredItem<Item> MJIN_STAIRS = block(BloxysstructuresModBlocks.MJIN_STAIRS);
	public static final DeferredItem<Item> MJIN_SLAB = block(BloxysstructuresModBlocks.MJIN_SLAB);
	public static final DeferredItem<Item> MJIN_BUTTON = block(BloxysstructuresModBlocks.MJIN_BUTTON);
	public static final DeferredItem<Item> MJIN_FENCE = block(BloxysstructuresModBlocks.MJIN_FENCE);
	public static final DeferredItem<Item> MJIN_FENCE_GATE = block(BloxysstructuresModBlocks.MJIN_FENCE_GATE);
	public static final DeferredItem<Item> MJIN_PRESSURE_PLATE = block(BloxysstructuresModBlocks.MJIN_PRESSURE_PLATE);
	public static final DeferredItem<Item> MJIN_LEAVES = block(BloxysstructuresModBlocks.MJIN_LEAVES);
	public static final DeferredItem<Item> LOREO_WOOD = block(BloxysstructuresModBlocks.LOREO_WOOD);
	public static final DeferredItem<Item> LOREO_LOG = block(BloxysstructuresModBlocks.LOREO_LOG);
	public static final DeferredItem<Item> LOREO_PLANKS = block(BloxysstructuresModBlocks.LOREO_PLANKS);
	public static final DeferredItem<Item> LOREO_LEAVES = block(BloxysstructuresModBlocks.LOREO_LEAVES);
	public static final DeferredItem<Item> LOREO_STAIRS = block(BloxysstructuresModBlocks.LOREO_STAIRS);
	public static final DeferredItem<Item> LOREO_SLAB = block(BloxysstructuresModBlocks.LOREO_SLAB);
	public static final DeferredItem<Item> LOREO_FENCE = block(BloxysstructuresModBlocks.LOREO_FENCE);
	public static final DeferredItem<Item> LOREO_FENCE_GATE = block(BloxysstructuresModBlocks.LOREO_FENCE_GATE);
	public static final DeferredItem<Item> LOREO_PRESSURE_PLATE = block(BloxysstructuresModBlocks.LOREO_PRESSURE_PLATE);
	public static final DeferredItem<Item> LOREO_BUTTON = block(BloxysstructuresModBlocks.LOREO_BUTTON);
	public static final DeferredItem<Item> MJIN_WOOD = block(BloxysstructuresModBlocks.MJIN_WOOD);
	public static final DeferredItem<Item> XIZA_WOOD = block(BloxysstructuresModBlocks.XIZA_WOOD);
	public static final DeferredItem<Item> XIZA_LOG = block(BloxysstructuresModBlocks.XIZA_LOG);
	public static final DeferredItem<Item> XIZA_PLANKS = block(BloxysstructuresModBlocks.XIZA_PLANKS);
	public static final DeferredItem<Item> XIZA_LEAVES = block(BloxysstructuresModBlocks.XIZA_LEAVES);
	public static final DeferredItem<Item> XIZA_STAIRS = block(BloxysstructuresModBlocks.XIZA_STAIRS);
	public static final DeferredItem<Item> XIZA_SLAB = block(BloxysstructuresModBlocks.XIZA_SLAB);
	public static final DeferredItem<Item> XIZA_FENCE = block(BloxysstructuresModBlocks.XIZA_FENCE);
	public static final DeferredItem<Item> XIZA_FENCE_GATE = block(BloxysstructuresModBlocks.XIZA_FENCE_GATE);
	public static final DeferredItem<Item> XIZA_PRESSURE_PLATE = block(BloxysstructuresModBlocks.XIZA_PRESSURE_PLATE);
	public static final DeferredItem<Item> XIZA_BUTTON = block(BloxysstructuresModBlocks.XIZA_BUTTON);
	public static final DeferredItem<Item> VERDANT_WOOD = block(BloxysstructuresModBlocks.VERDANT_WOOD);
	public static final DeferredItem<Item> VERDANT_LOG = block(BloxysstructuresModBlocks.VERDANT_LOG);
	public static final DeferredItem<Item> VERDANT_PLANKS = block(BloxysstructuresModBlocks.VERDANT_PLANKS);
	public static final DeferredItem<Item> VERDANT_LEAVES = block(BloxysstructuresModBlocks.VERDANT_LEAVES);
	public static final DeferredItem<Item> VERDANT_STAIRS = block(BloxysstructuresModBlocks.VERDANT_STAIRS);
	public static final DeferredItem<Item> VERDANT_SLAB = block(BloxysstructuresModBlocks.VERDANT_SLAB);
	public static final DeferredItem<Item> VERDANT_FENCE = block(BloxysstructuresModBlocks.VERDANT_FENCE);
	public static final DeferredItem<Item> VERDANT_FENCE_GATE = block(BloxysstructuresModBlocks.VERDANT_FENCE_GATE);
	public static final DeferredItem<Item> VERDANT_PRESSURE_PLATE = block(BloxysstructuresModBlocks.VERDANT_PRESSURE_PLATE);
	public static final DeferredItem<Item> VERDANT_BUTTON = block(BloxysstructuresModBlocks.VERDANT_BUTTON);
	public static final DeferredItem<Item> GIANT_COW_SPAWN_EGG = REGISTRY.register("giant_cow_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.GIANT_COW, -14279147, -11513776, new Item.Properties()));
	public static final DeferredItem<Item> GIANT_PIG_SPAWN_EGG = REGISTRY.register("giant_pig_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.GIANT_PIG, -3174516, -28788, new Item.Properties()));
	public static final DeferredItem<Item> GIANT_WOLF_SPAWN_EGG = REGISTRY.register("giant_wolf_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.GIANT_WOLF, -6711401, -10070198, new Item.Properties()));
	public static final DeferredItem<Item> GIANT_WOLF_ARMOR = REGISTRY.register("giant_wolf_armor", GiantWolfArmorItem::new);
	public static final DeferredItem<Item> ADVENTURE_REALM_GOLEM_SPAWN_EGG = REGISTRY.register("adventure_realm_golem_spawn_egg",
			() -> new DeferredSpawnEggItem(BloxysstructuresModEntities.ADVENTURE_REALM_GOLEM, -16731648, -11374592, new Item.Properties()));
	public static final DeferredItem<Item> COWLIN_SPAWN_EGG = REGISTRY.register("cowlin_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.COWLIN, -12635613, -3685757, new Item.Properties()));
	public static final DeferredItem<Item> COWLIN_BRUTE_SPAWN_EGG = REGISTRY.register("cowlin_brute_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.COWLIN_BRUTE, -13358819, -3685757, new Item.Properties()));
	public static final DeferredItem<Item> INFERNO_HYDRA_SPAWN_EGG = REGISTRY.register("inferno_hydra_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.INFERNO_HYDRA, -6750208, -3407872, new Item.Properties()));
	public static final DeferredItem<Item> SHIELD_OF_INFERNO = REGISTRY.register("shield_of_inferno", ShieldOfInfernoItem::new);
	public static final DeferredItem<Item> ALTAR_BASE = block(BloxysstructuresModBlocks.ALTAR_BASE);
	public static final DeferredItem<Item> ALTAR_INFERNO_HYDRA = block(BloxysstructuresModBlocks.ALTAR_INFERNO_HYDRA);
	public static final DeferredItem<Item> PRINCE_OF_DARKNESS_SPAWN_EGG = REGISTRY.register("prince_of_darkness_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.PRINCE_OF_DARKNESS, -16777216, -11468800, new Item.Properties()));
	public static final DeferredItem<Item> DARKNESS_ARM = REGISTRY.register("darkness_arm", DarknessArmItem::new);
	public static final DeferredItem<Item> ALTAR_PRINCE_OF_DARKNESS = block(BloxysstructuresModBlocks.ALTAR_PRINCE_OF_DARKNESS);
	public static final DeferredItem<Item> BLUE_MUSHROOM_BLOCK = block(BloxysstructuresModBlocks.BLUE_MUSHROOM_BLOCK);
	public static final DeferredItem<Item> GREEN_MUSHROOM_BLOCK = block(BloxysstructuresModBlocks.GREEN_MUSHROOM_BLOCK);
	public static final DeferredItem<Item> YELLOW_MUSHROOM_BLOCK = block(BloxysstructuresModBlocks.YELLOW_MUSHROOM_BLOCK);
	public static final DeferredItem<Item> PURPLE_MUSHROOM_BLOCK = block(BloxysstructuresModBlocks.PURPLE_MUSHROOM_BLOCK);
	public static final DeferredItem<Item> ALTAR_MUSHROOM_KING = block(BloxysstructuresModBlocks.ALTAR_MUSHROOM_KING);
	public static final DeferredItem<Item> MUSHROOM_KING_SPAWN_EGG = REGISTRY.register("mushroom_king_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.MUSHROOM_KING, -1317176, -9364314, new Item.Properties()));
	public static final DeferredItem<Item> VOID_WALKERS_SPAWN_EGG = REGISTRY.register("void_walkers_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.VOID_WALKERS, -16777216, -11534245, new Item.Properties()));
	public static final DeferredItem<Item> QUANTUM_GUARDIAN_SPAWN_EGG = REGISTRY.register("quantum_guardian_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.QUANTUM_GUARDIAN, -16777216, -10092442, new Item.Properties()));
	public static final DeferredItem<Item> QUANTUM_MAGE_SPAWN_EGG = REGISTRY.register("quantum_mage_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.QUANTUM_MAGE, -13434829, -6750055, new Item.Properties()));
	public static final DeferredItem<Item> BLOXY_SPAWN_EGG = REGISTRY.register("bloxy_spawn_egg", () -> new DeferredSpawnEggItem(BloxysstructuresModEntities.BLOXY, -10087537, -12186270, new Item.Properties()));
	public static final DeferredItem<Item> ALTAR_BLOXY = block(BloxysstructuresModBlocks.ALTAR_BLOXY);
	public static final DeferredItem<Item> BLOXYS_SCYTHE = REGISTRY.register("bloxys_scythe", BloxysScytheItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(SHIELD_OF_INFERNO.get(), ResourceLocation.parse("minecraft:blocking"), ItemProperties.getProperty(new ItemStack(Items.SHIELD), ResourceLocation.parse("minecraft:blocking")));
			});
		}
	}
}
