
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxysstructuresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BloxysstructuresMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOXYS_STRUCTURES = REGISTRY.register("bloxys_structures",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bloxysstructures.bloxys_structures")).icon(() -> new ItemStack(BloxysstructuresModItems.ADVENTURE_REALM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BloxysstructuresModItems.ADVENTURE_REALM.get());
				tabData.accept(BloxysstructuresModBlocks.MJIN_LOG.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_PLANKS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_STAIRS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_SLAB.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_BUTTON.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_FENCE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_FENCE_GATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_PRESSURE_PLATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_LEAVES.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_WOOD.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_LOG.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_PLANKS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_LEAVES.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_STAIRS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_SLAB.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_FENCE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_FENCE_GATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_PRESSURE_PLATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.LOREO_BUTTON.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.MJIN_WOOD.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_WOOD.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_LOG.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_PLANKS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_LEAVES.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_STAIRS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_SLAB.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_FENCE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_FENCE_GATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_PRESSURE_PLATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.XIZA_BUTTON.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_WOOD.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_LOG.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_PLANKS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_LEAVES.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_STAIRS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_SLAB.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_FENCE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_FENCE_GATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_PRESSURE_PLATE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.VERDANT_BUTTON.get().asItem());
				tabData.accept(BloxysstructuresModItems.GIANT_COW_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.GIANT_PIG_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.GIANT_WOLF_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.GIANT_WOLF_ARMOR.get());
				tabData.accept(BloxysstructuresModItems.ADVENTURE_REALM_GOLEM_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.COWLIN_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.COWLIN_BRUTE_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.INFERNO_HYDRA_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.SHIELD_OF_INFERNO.get());
				tabData.accept(BloxysstructuresModBlocks.ALTAR_BASE.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.ALTAR_INFERNO_HYDRA.get().asItem());
				tabData.accept(BloxysstructuresModItems.PRINCE_OF_DARKNESS_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.DARKNESS_ARM.get());
				tabData.accept(BloxysstructuresModBlocks.ALTAR_PRINCE_OF_DARKNESS.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.BLUE_MUSHROOM_BLOCK.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.GREEN_MUSHROOM_BLOCK.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.YELLOW_MUSHROOM_BLOCK.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.PURPLE_MUSHROOM_BLOCK.get().asItem());
				tabData.accept(BloxysstructuresModBlocks.ALTAR_MUSHROOM_KING.get().asItem());
				tabData.accept(BloxysstructuresModItems.MUSHROOM_KING_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.VOID_WALKERS_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.QUANTUM_GUARDIAN_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.QUANTUM_MAGE_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModItems.BLOXY_SPAWN_EGG.get());
				tabData.accept(BloxysstructuresModBlocks.ALTAR_BLOXY.get().asItem());
				tabData.accept(BloxysstructuresModItems.BLOXYS_SCYTHE.get());
			})

					.build());
}
