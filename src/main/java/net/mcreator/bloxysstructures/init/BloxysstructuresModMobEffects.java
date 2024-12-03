
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.potion.PurplePoisonMobEffect;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxysstructuresModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, BloxysstructuresMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> PURPLE_POISON = REGISTRY.register("purple_poison", () -> new PurplePoisonMobEffect());
}
