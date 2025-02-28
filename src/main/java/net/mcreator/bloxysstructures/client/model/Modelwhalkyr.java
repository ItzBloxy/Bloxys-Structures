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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwhalkyr<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("bloxysstructures", "modelwhalkyr"), "main");
	public final ModelPart main;
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart fins;
	public final ModelPart torso2;
	public final ModelPart fins2;
	public final ModelPart torso3;
	public final ModelPart fins3;
	public final ModelPart tail;

	public Modelwhalkyr(ModelPart root) {
		this.main = root.getChild("main");
		this.head = this.main.getChild("head");
		this.torso = this.main.getChild("torso");
		this.fins = this.torso.getChild("fins");
		this.torso2 = this.torso.getChild("torso2");
		this.fins2 = this.torso2.getChild("fins2");
		this.torso3 = this.torso2.getChild("torso3");
		this.fins3 = this.torso3.getChild("fins3");
		this.tail = this.torso3.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 3.5F));
		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 17).addBox(-2.0F, -4.7F, -11.0F, 4.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
				.addBox(-2.0F, -4.7F, -11.0F, 4.0F, 6.0F, 11.0F, new CubeDeformation(0.25F)).texOffs(30, 51).addBox(-1.5F, 1.2F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.4F, -15.0F));
		PartDefinition torso = main.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 8.0F, 15.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.5F, -15.0F));
		PartDefinition fins = torso.addOrReplaceChild("fins", CubeListBuilder.create(), PartPose.offset(0.0052F, 3.1613F, 7.5F));
		PartDefinition cube_r1 = fins.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 63).addBox(-3.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2552F, -0.4113F, -4.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r2 = fins.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 68).addBox(-3.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2552F, -0.4113F, 4.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r3 = fins.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 46).addBox(0.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2448F, -0.4113F, -4.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r4 = fins.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 71).addBox(0.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2448F, -0.4113F, 4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition torso2 = torso.addOrReplaceChild("torso2",
				CubeListBuilder.create().texOffs(42, 0).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(42, 34).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 11.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 15.0F));
		PartDefinition fins2 = torso2.addOrReplaceChild("fins2", CubeListBuilder.create(), PartPose.offset(-1.25F, 2.0F, 5.0F));
		PartDefinition cube_r5 = fins2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 67).addBox(-3.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r6 = fins2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 0).addBox(0.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition torso3 = torso2.addOrReplaceChild("torso3",
				CubeListBuilder.create().texOffs(54, 57).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 61).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));
		PartDefinition fins3 = torso3.addOrReplaceChild("fins3", CubeListBuilder.create(), PartPose.offset(0.925F, 1.75F, 2.5F));
		PartDefinition tail = torso3.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 68)
				.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(54, 51).addBox(-4.0F, -0.5F, 3.5F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, 6.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
