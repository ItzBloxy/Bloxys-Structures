
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bloxysstructures.entity.PurpleLightningShockwaveEntity;
import net.mcreator.bloxysstructures.client.model.Modelexplosionradius;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PurpleLightningShockwaveRenderer extends MobRenderer<PurpleLightningShockwaveEntity, Modelexplosionradius<PurpleLightningShockwaveEntity>> {
	public PurpleLightningShockwaveRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelexplosionradius<PurpleLightningShockwaveEntity>(context.bakeLayer(Modelexplosionradius.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<PurpleLightningShockwaveEntity, Modelexplosionradius<PurpleLightningShockwaveEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/purplelightningshockwavetx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PurpleLightningShockwaveEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PurpleLightningShockwaveEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/purplelightningshockwavetx.png");
	}

	@Override
	protected boolean isBodyVisible(PurpleLightningShockwaveEntity entity) {
		return false;
	}
}
