
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.bloxysstructures.client.renderer.WhalkyrRenderer;
import net.mcreator.bloxysstructures.client.renderer.VoidWalkersRenderer;
import net.mcreator.bloxysstructures.client.renderer.TreemooRenderer;
import net.mcreator.bloxysstructures.client.renderer.QuantumMageRenderer;
import net.mcreator.bloxysstructures.client.renderer.QuantumGuardianRenderer;
import net.mcreator.bloxysstructures.client.renderer.QuantamMagicOrbRenderer;
import net.mcreator.bloxysstructures.client.renderer.PurpleLightningShockwaveRenderer;
import net.mcreator.bloxysstructures.client.renderer.PrinceOfDarknessRenderer;
import net.mcreator.bloxysstructures.client.renderer.MushroomKingRenderer;
import net.mcreator.bloxysstructures.client.renderer.InfernoHydraRenderer;
import net.mcreator.bloxysstructures.client.renderer.GiantWolfRenderer;
import net.mcreator.bloxysstructures.client.renderer.CowlinRenderer;
import net.mcreator.bloxysstructures.client.renderer.CowlinBruteRenderer;
import net.mcreator.bloxysstructures.client.renderer.BloxysScytheThrowableRenderer;
import net.mcreator.bloxysstructures.client.renderer.BloxysScytheThrowablePlayerRenderer;
import net.mcreator.bloxysstructures.client.renderer.BloxyRenderer;
import net.mcreator.bloxysstructures.client.renderer.AdventureRealmGolemRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BloxysstructuresModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BloxysstructuresModEntities.GIANT_WOLF.get(), GiantWolfRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.ADVENTURE_REALM_GOLEM.get(), AdventureRealmGolemRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.COWLIN.get(), CowlinRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.COWLIN_BRUTE.get(), CowlinBruteRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.INFERNO_HYDRA.get(), InfernoHydraRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.PRINCE_OF_DARKNESS.get(), PrinceOfDarknessRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.MUSHROOM_KING.get(), MushroomKingRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.VOID_WALKERS.get(), VoidWalkersRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.QUANTUM_GUARDIAN.get(), QuantumGuardianRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.QUANTUM_MAGE.get(), QuantumMageRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.QUANTAM_MAGIC_ORB.get(), QuantamMagicOrbRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.BLOXY.get(), BloxyRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.BLOXYS_SCYTHE_THROWABLE.get(), BloxysScytheThrowableRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.PURPLE_LIGHTNING_SHOCKWAVE.get(), PurpleLightningShockwaveRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.BLOXYS_SCYTHE_THROWABLE_PLAYER.get(), BloxysScytheThrowablePlayerRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.TREEMOO.get(), TreemooRenderer::new);
		event.registerEntityRenderer(BloxysstructuresModEntities.WHALKYR.get(), WhalkyrRenderer::new);
	}
}
