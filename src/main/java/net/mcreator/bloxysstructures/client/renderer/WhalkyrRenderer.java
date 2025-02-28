
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.bloxysstructures.procedures.WhalkyrDisplayCondition5Procedure;
import net.mcreator.bloxysstructures.procedures.WhalkyrDisplayCondition4Procedure;
import net.mcreator.bloxysstructures.procedures.WhalkyrDisplayCondition3Procedure;
import net.mcreator.bloxysstructures.procedures.WhalkyrDisplayCondition2Procedure;
import net.mcreator.bloxysstructures.procedures.WhalkyrDisplayCondition1Procedure;
import net.mcreator.bloxysstructures.entity.WhalkyrEntity;
import net.mcreator.bloxysstructures.client.model.animations.whalkyrwalkingAnimation;
import net.mcreator.bloxysstructures.client.model.Modelwhalkyr;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WhalkyrRenderer extends MobRenderer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>> {
	public WhalkyrRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelwhalkyr.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/whalkyrtx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WhalkyrDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/whalkyr2tx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WhalkyrDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/whalkyr3tx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WhalkyrDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/whalkyr4tx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WhalkyrDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<WhalkyrEntity, Modelwhalkyr<WhalkyrEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/whalkyr5tx.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WhalkyrDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	protected void scale(WhalkyrEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(6f, 6f, 6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhalkyrEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/wolf_blank.png");
	}

	private static final class AnimatedModel extends Modelwhalkyr<WhalkyrEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<WhalkyrEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, whalkyrwalkingAnimation.animwhalkyrwalk, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(WhalkyrEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
