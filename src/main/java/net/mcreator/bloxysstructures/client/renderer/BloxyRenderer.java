
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.bloxysstructures.procedures.BloxyScythe2DisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.BloxyScythe1DisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.BloxyGlowDisplayConditionProcedure;
import net.mcreator.bloxysstructures.entity.BloxyEntity;
import net.mcreator.bloxysstructures.client.model.Modelscythe2;
import net.mcreator.bloxysstructures.client.model.Modelscythe1;
import net.mcreator.bloxysstructures.client.model.Modelbloxy;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BloxyRenderer extends MobRenderer<BloxyEntity, Modelbloxy<BloxyEntity>> {
	public BloxyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbloxy(context.bakeLayer(Modelbloxy.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BloxyEntity, Modelbloxy<BloxyEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/bloxytx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BloxyEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BloxyScythe1DisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelscythe1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelscythe1.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<BloxyEntity, Modelbloxy<BloxyEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/bloxytx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BloxyEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BloxyScythe2DisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelscythe2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelscythe2.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<BloxyEntity, Modelbloxy<BloxyEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/bloxytx_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BloxyEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BloxyGlowDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BloxyEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/bloxytx.png");
	}
}
