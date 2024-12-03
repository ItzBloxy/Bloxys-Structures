
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.bloxysstructures.entity.GiantPigEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class GiantPigRenderer extends MobRenderer<GiantPigEntity, PigModel<GiantPigEntity>> {
	public GiantPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 1f);
	}

	@Override
	protected void scale(GiantPigEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantPigEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/pig.png");
	}
}
