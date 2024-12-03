
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxysstructuresModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, BloxysstructuresMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SHOCKWAVE = REGISTRY.register("shockwave", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "shockwave")));
	public static final DeferredHolder<SoundEvent, SoundEvent> COWLINLASER = REGISTRY.register("cowlinlaser", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "cowlinlaser")));
}
