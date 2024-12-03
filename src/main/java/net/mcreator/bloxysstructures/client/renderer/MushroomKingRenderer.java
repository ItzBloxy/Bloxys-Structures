
package net.mcreator.bloxysstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bloxysstructures.procedures.MushroomKingIsEntityModelShakingProcedure;
import net.mcreator.bloxysstructures.entity.MushroomKingEntity;
import net.mcreator.bloxysstructures.client.model.ModelKingMushroom;

public class MushroomKingRenderer extends MobRenderer<MushroomKingEntity, ModelKingMushroom<MushroomKingEntity>> {
	public MushroomKingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKingMushroom(context.bakeLayer(ModelKingMushroom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MushroomKingEntity entity) {
		return ResourceLocation.parse("bloxysstructures:textures/entities/mushroomkingtx.png");
	}

	@Override
	protected boolean isShaking(MushroomKingEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return MushroomKingIsEntityModelShakingProcedure.execute(entity);
	}
}
