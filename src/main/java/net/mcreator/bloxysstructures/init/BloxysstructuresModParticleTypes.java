
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bloxysstructures.BloxysstructuresMod;

public class BloxysstructuresModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, BloxysstructuresMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ADVENTURE_REALM_AMBIENT_PARTICLE = REGISTRY.register("adventure_realm_ambient_particle", () -> new SimpleParticleType(false));
}
