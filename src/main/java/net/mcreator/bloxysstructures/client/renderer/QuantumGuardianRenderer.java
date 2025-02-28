
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.bloxysstructures.procedures.QuantumGuardianDisplayConditionProcedure;
import net.mcreator.bloxysstructures.entity.QuantumGuardianEntity;
import net.mcreator.bloxysstructures.client.model.Modelruniccircle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class QuantumGuardianRenderer extends HumanoidMobRenderer<QuantumGuardianEntity, HumanoidModel<QuantumGuardianEntity>> {
	public QuantumGuardianRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<QuantumGuardianEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<QuantumGuardianEntity, HumanoidModel<QuantumGuardianEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/quantumguardianruniccircletx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, QuantumGuardianEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (QuantumGuardianDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					EntityModel model = new Modelruniccircle(Minecraft.getInstance().getEntityModels().bakeLayer(Modelruniccircle.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(QuantumGuardianEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/quantumguardianstx.png");
	}
}
