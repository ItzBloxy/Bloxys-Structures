
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.bloxysstructures.network.UseItemSpecialMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BloxysstructuresModKeyMappings {
	public static final KeyMapping USE_ITEM_SPECIAL = new KeyMapping("key.bloxysstructures.use_item_special", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				USE_ITEM_SPECIAL_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - USE_ITEM_SPECIAL_LASTPRESS);
				PacketDistributor.sendToServer(new UseItemSpecialMessage(1, dt));
				UseItemSpecialMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long USE_ITEM_SPECIAL_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(USE_ITEM_SPECIAL);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				USE_ITEM_SPECIAL.consumeClick();
			}
		}
	}
}
