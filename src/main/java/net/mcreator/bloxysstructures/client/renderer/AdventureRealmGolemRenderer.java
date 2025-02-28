
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bloxysstructures.procedures.AdventureRealmGolemModelVisualScaleProcedure;
import net.mcreator.bloxysstructures.entity.AdventureRealmGolemEntity;
import net.mcreator.bloxysstructures.client.model.Modeladventurerealmgolem;

import com.mojang.blaze3d.vertex.PoseStack;

public class AdventureRealmGolemRenderer extends MobRenderer<AdventureRealmGolemEntity, Modeladventurerealmgolem<AdventureRealmGolemEntity>> {
	public AdventureRealmGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeladventurerealmgolem<AdventureRealmGolemEntity>(context.bakeLayer(Modeladventurerealmgolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AdventureRealmGolemEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) AdventureRealmGolemModelVisualScaleProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(AdventureRealmGolemEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/adventurerealmgolem.png");
	}
}
