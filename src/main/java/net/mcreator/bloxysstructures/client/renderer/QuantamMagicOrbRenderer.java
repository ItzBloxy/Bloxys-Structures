package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bloxysstructures.entity.QuantamMagicOrbEntity;
import net.mcreator.bloxysstructures.client.model.Modelquantummagicorb;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class QuantamMagicOrbRenderer extends EntityRenderer<QuantamMagicOrbEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");
	private final Modelquantummagicorb model;

	public QuantamMagicOrbRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelquantummagicorb(context.bakeLayer(Modelquantummagicorb.LAYER_LOCATION));
	}

	@Override
	public void render(QuantamMagicOrbEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(QuantamMagicOrbEntity entity) {
		return texture;
	}
}
