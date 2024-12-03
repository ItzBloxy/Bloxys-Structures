package net.mcreator.bloxysstructures.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelscythe1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "modelscythe_1"), "main");
	public final ModelPart BloxysScythe;

	public Modelscythe1(ModelPart root) {
		this.BloxysScythe = root.getChild("BloxysScythe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition BloxysScythe = partdefinition.addOrReplaceChild("BloxysScythe",
				CubeListBuilder.create().texOffs(10, 0).addBox(-3.3133F, -30.2552F, -1.2378F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 16).addBox(0.6867F, -29.2552F, -1.2378F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 13).addBox(-6.3133F, -29.2552F, -1.2378F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 10).addBox(3.6867F, -28.2552F, -1.2378F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.3133F, -28.2552F, -1.2378F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 29).addBox(5.6867F, -27.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-9.3133F, -27.2552F, -1.2378F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 27).addBox(6.6867F, -26.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-10.3133F, -26.2552F, -1.2378F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7).addBox(-13.3133F, -26.2552F, -1.2378F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(7.6867F, -25.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 30).addBox(4.6867F, -25.2552F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-11.3133F, -25.2552F, -1.2378F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 20).addBox(-14.3133F, -25.2552F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 9)
						.addBox(-3.3133F, -24.2552F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3).addBox(-15.3133F, -24.2552F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 21)
						.addBox(-6.3133F, -23.2552F, -1.2378F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 16).addBox(-6.3133F, -22.2552F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 28)
						.addBox(-14.3133F, -20.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-6.3133F, -19.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 12)
						.addBox(-15.3133F, -19.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 17).addBox(-5.3133F, -18.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-16.3133F, -18.2552F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).addBox(-4.3133F, -17.2552F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 26)
						.addBox(-10.3133F, -17.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 5).addBox(-3.3133F, -16.2552F, -1.2378F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 7)
						.addBox(-8.3133F, -16.2552F, -1.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 23).addBox(-11.3133F, -16.2552F, -1.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 21)
						.addBox(-1.3133F, -15.2552F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 26).addBox(-0.3133F, -13.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 8)
						.addBox(0.6867F, -12.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4).addBox(1.6867F, -11.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(2.6867F, -10.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 24).addBox(3.6867F, -9.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 25)
						.addBox(4.6867F, -8.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25).addBox(5.6867F, -7.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 14)
						.addBox(6.6867F, -6.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23).addBox(7.6867F, -5.2552F, -1.2378F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 20)
						.addBox(8.6867F, -4.2552F, -1.2378F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17).addBox(9.6867F, -3.2552F, -1.2378F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(11.6867F, -2.2552F, -1.2378F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0189F, 1.9841F, 0.0F, 1.5708F, -0.7418F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		BloxysScythe.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.BloxysScythe.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
