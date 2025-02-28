
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bloxysstructures.procedures.SpruceTreemooDisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.OakTreemooDisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.CherryTreemooDisplayConditionProcedure;
import net.mcreator.bloxysstructures.procedures.BirchTreemooDisplayConditionProcedure;
import net.mcreator.bloxysstructures.entity.TreemooEntity;
import net.mcreator.bloxysstructures.client.model.Modeltreemoo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TreemooRenderer extends MobRenderer<TreemooEntity, Modeltreemoo<TreemooEntity>> {
	public TreemooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltreemoo<TreemooEntity>(context.bakeLayer(Modeltreemoo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<TreemooEntity, Modeltreemoo<TreemooEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/treemoo_birch.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TreemooEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BirchTreemooDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
		this.addLayer(new RenderLayer<TreemooEntity, Modeltreemoo<TreemooEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/treemoo_oak.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TreemooEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (OakTreemooDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
		this.addLayer(new RenderLayer<TreemooEntity, Modeltreemoo<TreemooEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/treemoo_spruce.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TreemooEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SpruceTreemooDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
		this.addLayer(new RenderLayer<TreemooEntity, Modeltreemoo<TreemooEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/treemoo_cherry.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TreemooEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CherryTreemooDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TreemooEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/treemoo_nothing.png");
	}
}
