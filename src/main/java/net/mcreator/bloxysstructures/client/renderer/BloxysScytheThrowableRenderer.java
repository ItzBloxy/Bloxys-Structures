package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bloxysstructures.entity.BloxysScytheThrowableEntity;
import net.mcreator.bloxysstructures.client.model.Modelthrowablescythe6;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BloxysScytheThrowableRenderer extends EntityRenderer<BloxysScytheThrowableEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("bloxysstructures:textures/entities/bloxytx.png");
	private final Modelthrowablescythe6 model;

	public BloxysScytheThrowableRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelthrowablescythe6(context.bakeLayer(Modelthrowablescythe6.LAYER_LOCATION));
	}

	@Override
	public void render(BloxysScytheThrowableEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BloxysScytheThrowableEntity entity) {
		return texture;
	}
}
