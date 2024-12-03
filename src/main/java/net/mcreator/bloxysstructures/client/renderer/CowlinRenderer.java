
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import net.mcreator.bloxysstructures.entity.CowlinEntity;

public class CowlinRenderer extends MobRenderer<CowlinEntity, PiglinModel<CowlinEntity>> {
	public CowlinRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CowlinEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/cowlin.png");
	}
}
