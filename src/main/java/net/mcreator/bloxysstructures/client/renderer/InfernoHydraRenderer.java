
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.bloxysstructures.entity.InfernoHydraEntity;
import net.mcreator.bloxysstructures.client.model.ModelFireLeviathan3;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InfernoHydraRenderer extends MobRenderer<InfernoHydraEntity, ModelFireLeviathan3<InfernoHydraEntity>> {
	public InfernoHydraRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFireLeviathan3(context.bakeLayer(ModelFireLeviathan3.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<InfernoHydraEntity, ModelFireLeviathan3<InfernoHydraEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/fireleviathantx_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, InfernoHydraEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new ModelFireLeviathan3(Minecraft.getInstance().getEntityModels().bakeLayer(ModelFireLeviathan3.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(InfernoHydraEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/fireleviathantx.png");
	}
}