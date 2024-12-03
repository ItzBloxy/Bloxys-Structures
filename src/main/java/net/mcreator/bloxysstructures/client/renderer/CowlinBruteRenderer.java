
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import net.mcreator.bloxysstructures.entity.CowlinBruteEntity;

public class CowlinBruteRenderer extends MobRenderer<CowlinBruteEntity, PiglinModel<CowlinBruteEntity>> {
	public CowlinBruteRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CowlinBruteEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/cowlin_brute.png");
	}
}
