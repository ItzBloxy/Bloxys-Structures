
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

import net.mcreator.bloxysstructures.procedures.QuantumMageDisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.QuantumMageDisplayCondition4Procedure;
import net.mcreator.bloxysstructures.procedures.QuantumMageDisplayCondition3Procedure;
import net.mcreator.bloxysstructures.procedures.QuantumMageDisplayCondition2Procedure;
import net.mcreator.bloxysstructures.entity.QuantumMageEntity;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb4;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb3;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb2;
import net.mcreator.bloxysstructures.client.model.Modelquantumorb1;
import net.mcreator.bloxysstructures.client.model.Modelquantummage;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class QuantumMageRenderer extends MobRenderer<QuantumMageEntity, Modelquantummage<QuantumMageEntity>> {
	public QuantumMageRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquantummage(context.bakeLayer(Modelquantummage.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<QuantumMageEntity, Modelquantummage<QuantumMageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, QuantumMageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (QuantumMageDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelquantumorb4(Minecraft.getInstance().getEntityModels().bakeLayer(Modelquantumorb4.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<QuantumMageEntity, Modelquantummage<QuantumMageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, QuantumMageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (QuantumMageDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelquantumorb3(Minecraft.getInstance().getEntityModels().bakeLayer(Modelquantumorb3.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<QuantumMageEntity, Modelquantummage<QuantumMageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, QuantumMageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (QuantumMageDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelquantumorb2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelquantumorb2.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<QuantumMageEntity, Modelquantummage<QuantumMageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, QuantumMageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (QuantumMageDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelquantumorb1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelquantumorb1.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(QuantumMageEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/quantum_mage.png");
	}
}
