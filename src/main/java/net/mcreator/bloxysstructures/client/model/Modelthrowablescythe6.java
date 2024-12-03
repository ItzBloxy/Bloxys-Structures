package net.mcreator.bloxysstructures.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelthrowablescythe6<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "modelthrowablescythe_6"), "main");
	public final ModelPart BloxysScythe;

	public Modelthrowablescythe6(ModelPart root) {
		this.BloxysScythe = root.getChild("BloxysScythe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition BloxysScythe = partdefinition.addOrReplaceChild("BloxysScythe",
				CubeListBuilder.create().texOffs(10, 0).addBox(-4.5441F, -18.2767F, -1.2378F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 16).addBox(-0.5441F, -17.2767F, -1.2378F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 13).addBox(-7.5441F, -17.2767F, -1.2378F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 10).addBox(2.4559F, -16.2767F, -1.2378F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.5441F, -16.2767F, -1.2378F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 29).addBox(4.4559F, -15.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-10.5441F, -15.2767F, -1.2378F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 27).addBox(5.4559F, -14.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-11.5441F, -14.2767F, -1.2378F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7).addBox(-14.5441F, -14.2767F, -1.2378F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(6.4559F, -13.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 30).addBox(3.4559F, -13.2767F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-12.5441F, -13.2767F, -1.2378F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 20).addBox(-15.5441F, -13.2767F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 9)
						.addBox(-4.5441F, -12.2767F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3).addBox(-16.5441F, -12.2767F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 21)
						.addBox(-7.5441F, -11.2767F, -1.2378F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 16).addBox(-7.5441F, -10.2767F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 28)
						.addBox(-15.5441F, -8.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-7.5441F, -7.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 12)
						.addBox(-16.5441F, -7.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 17).addBox(-6.5441F, -6.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-17.5441F, -6.2767F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).addBox(-5.5441F, -5.2767F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 26)
						.addBox(-11.5441F, -5.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 5).addBox(-4.5441F, -4.2767F, -1.2378F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 7)
						.addBox(-9.5441F, -4.2767F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 23).addBox(-12.5441F, -4.2767F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 21)
						.addBox(-2.5441F, -3.2767F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 26).addBox(-1.5441F, -1.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 8)
						.addBox(-0.5441F, -0.2767F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4).addBox(0.4559F, 0.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(1.4559F, 1.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 24).addBox(2.4559F, 2.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 25)
						.addBox(3.4559F, 3.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25).addBox(4.4559F, 4.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 14)
						.addBox(5.4559F, 5.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23).addBox(6.4559F, 6.7233F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 20)
						.addBox(7.4559F, 7.7233F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17).addBox(8.4559F, 8.7233F, -1.2378F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(10.4559F, 9.7233F, -1.2378F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9811F, 13.9841F, -0.75F, 3.1416F, 0.0F, 2.9671F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		BloxysScythe.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
