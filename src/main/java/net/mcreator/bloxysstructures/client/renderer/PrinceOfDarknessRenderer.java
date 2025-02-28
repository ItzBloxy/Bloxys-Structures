
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

import net.mcreator.bloxysstructures.entity.PrinceOfDarknessEntity;
import net.mcreator.bloxysstructures.client.model.Modelprince_of_darkness;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrinceOfDarknessRenderer extends MobRenderer<PrinceOfDarknessEntity, Modelprince_of_darkness<PrinceOfDarknessEntity>> {
	public PrinceOfDarknessRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprince_of_darkness<PrinceOfDarknessEntity>(context.bakeLayer(Modelprince_of_darkness.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PrinceOfDarknessEntity, Modelprince_of_darkness<PrinceOfDarknessEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("bloxysstructures:textures/entities/prince_of_darkness_tx_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrinceOfDarknessEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelprince_of_darkness(Minecraft.getInstance().getEntityModels().bakeLayer(Modelprince_of_darkness.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrinceOfDarknessEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/prince_of_darkness_tx.png");
	}
}
