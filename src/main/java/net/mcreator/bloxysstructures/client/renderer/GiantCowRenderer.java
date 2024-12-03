
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.bloxysstructures.entity.GiantCowEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class GiantCowRenderer extends MobRenderer<GiantCowEntity, CowModel<GiantCowEntity>> {
	public GiantCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 1f);
	}

	@Override
	protected void scale(GiantCowEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantCowEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/cow.png");
	}
}
