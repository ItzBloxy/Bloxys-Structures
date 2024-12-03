
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.bloxysstructures.client.model.Modelwolf_sitting_armor;
import net.mcreator.bloxysstructures.client.model.Modelwolf_sitting;
import net.mcreator.bloxysstructures.client.model.Modelwolf_armor;
import net.mcreator.bloxysstructures.client.model.Modelwolf_40;
import net.mcreator.bloxysstructures.client.model.Modelwolf_30;
import net.mcreator.bloxysstructures.client.model.Modelwolf_20;
import net.mcreator.bloxysstructures.client.model.Modelwolf_10;
import net.mcreator.bloxysstructures.client.model.Modelwolf;
import net.mcreator.bloxysstructures.client.model.Modelthrowablescythe6;
import net.mcreator.bloxysstructures.client.model.Modelthrowablescythe5;
import net.mcreator.bloxysstructures.client.model.Modelslimbiped;
import net.mcreator.bloxysstructures.client.model.Modelscythe2;
import net.mcreator.bloxysstructures.client.model.Modelscythe1;
import net.mcreator.bloxysstructures.client.model.Modelruniccircle;
import net.mcreator.bloxysstructures.client.model.Modelred_mushroom;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb4;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb3;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb2;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb1;
import net.mcreator.bloxysstructures.client.model.Modelquantummagicorb;
import net.mcreator.bloxysstructures.client.model.Modelquantummage;
import net.mcreator.bloxysstructures.client.model.Modelprince_of_darkness;
import net.mcreator.bloxysstructures.client.model.Modelgiant_sniffer;
import net.mcreator.bloxysstructures.client.model.Modelexplosionradius;
import net.mcreator.bloxysstructures.client.model.Modelbloxy;
import net.mcreator.bloxysstructures.client.model.Modeladventurerealmgolem;
import net.mcreator.bloxysstructures.client.model.ModelKingMushroom;
import net.mcreator.bloxysstructures.client.model.ModelInfernoHydra;
import net.mcreator.bloxysstructures.client.model.ModelFireLeviathan3;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BloxysstructuresModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelscythe1.LAYER_LOCATION, Modelscythe1::createBodyLayer);
		event.registerLayerDefinition(ModelKingMushroom.LAYER_LOCATION, ModelKingMushroom::createBodyLayer);
		event.registerLayerDefinition(Modelthrowablescythe6.LAYER_LOCATION, Modelthrowablescythe6::createBodyLayer);
		event.registerLayerDefinition(Modelthrowablescythe5.LAYER_LOCATION, Modelthrowablescythe5::createBodyLayer);
		event.registerLayerDefinition(Modelquantumorb4.LAYER_LOCATION, Modelquantumorb4::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_sitting_armor.LAYER_LOCATION, Modelwolf_sitting_armor::createBodyLayer);
		event.registerLayerDefinition(Modelslimbiped.LAYER_LOCATION, Modelslimbiped::createBodyLayer);
		event.registerLayerDefinition(Modeladventurerealmgolem.LAYER_LOCATION, Modeladventurerealmgolem::createBodyLayer);
		event.registerLayerDefinition(Modelquantumorb1.LAYER_LOCATION, Modelquantumorb1::createBodyLayer);
		event.registerLayerDefinition(Modelscythe2.LAYER_LOCATION, Modelscythe2::createBodyLayer);
		event.registerLayerDefinition(Modelquantummagicorb.LAYER_LOCATION, Modelquantummagicorb::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_20.LAYER_LOCATION, Modelwolf_20::createBodyLayer);
		event.registerLayerDefinition(Modelwolf.LAYER_LOCATION, Modelwolf::createBodyLayer);
		event.registerLayerDefinition(Modelgiant_sniffer.LAYER_LOCATION, Modelgiant_sniffer::createBodyLayer);
		event.registerLayerDefinition(ModelFireLeviathan3.LAYER_LOCATION, ModelFireLeviathan3::createBodyLayer);
		event.registerLayerDefinition(Modelexplosionradius.LAYER_LOCATION, Modelexplosionradius::createBodyLayer);
		event.registerLayerDefinition(Modelquantumorb2.LAYER_LOCATION, Modelquantumorb2::createBodyLayer);
		event.registerLayerDefinition(ModelInfernoHydra.LAYER_LOCATION, ModelInfernoHydra::createBodyLayer);
		event.registerLayerDefinition(Modelruniccircle.LAYER_LOCATION, Modelruniccircle::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_sitting.LAYER_LOCATION, Modelwolf_sitting::createBodyLayer);
		event.registerLayerDefinition(Modelred_mushroom.LAYER_LOCATION, Modelred_mushroom::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_30.LAYER_LOCATION, Modelwolf_30::createBodyLayer);
		event.registerLayerDefinition(Modelbloxy.LAYER_LOCATION, Modelbloxy::createBodyLayer);
		event.registerLayerDefinition(Modelquantummage.LAYER_LOCATION, Modelquantummage::createBodyLayer);
		event.registerLayerDefinition(Modelprince_of_darkness.LAYER_LOCATION, Modelprince_of_darkness::createBodyLayer);
		event.registerLayerDefinition(Modelquantumorb3.LAYER_LOCATION, Modelquantumorb3::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_40.LAYER_LOCATION, Modelwolf_40::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_armor.LAYER_LOCATION, Modelwolf_armor::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_10.LAYER_LOCATION, Modelwolf_10::createBodyLayer);
	}
}
