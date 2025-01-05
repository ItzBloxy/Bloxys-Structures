// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltreemoo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "treemoo"), "main");
	private final ModelPart head;
	private final ModelPart mushroom1;
	private final ModelPart body;
	private final ModelPart mushrooms;
	private final ModelPart mushroom2;
	private final ModelPart mushroom3;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public Modeltreemoo(ModelPart root) {
		this.head = root.getChild("head");
		this.mushroom1 = this.head.getChild("mushroom1");
		this.body = root.getChild("body");
		this.mushrooms = this.body.getChild("mushrooms");
		this.mushroom2 = this.mushrooms.getChild("mushroom2");
		this.mushroom3 = this.mushrooms.getChild("mushroom3");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 0)
						.addBox(-5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.15F)).texOffs(20, 0)
						.addBox(4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, -8.0F));

		PartDefinition mushroom1 = head.addOrReplaceChild("mushroom1",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-8.0F, -12.0F, 0.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(0.0F, -11.0F, -8.0F, 0.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -3.2F, 0.0F, -0.576F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(18, 4)
						.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(18, 100)
						.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.15F)).texOffs(52, 0)
						.addBox(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mushrooms = body.addOrReplaceChild("mushrooms", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.0F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mushroom2 = mushrooms.addOrReplaceChild("mushroom2", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-7.3707F, -12.0F, -0.7771F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(0.6293F, -11.0F, -8.7771F, 0.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.025F, 0.0F, 2.8F, 0.0F, 0.6807F, 0.0F));

		PartDefinition mushroom3 = mushrooms.addOrReplaceChild("mushroom3",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(-8.0F, -11.0F, 0.0F, 16.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(0.0F, -12.0F, -8.0F, 0.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2F, 0.0F, 11.0F, 0.0F, -0.0524F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 16).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.0F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 16).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, 7.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, -6.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 16).addBox(
				-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, -6.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}