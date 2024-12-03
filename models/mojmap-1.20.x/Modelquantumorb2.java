// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelquantumorb2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "quantumorb2"), "main");
	private final ModelPart orbs;

	public Modelquantumorb2(ModelPart root) {
		this.orbs = root.getChild("orbs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition orbs = partdefinition.addOrReplaceChild("orbs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition cube_r1 = orbs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(112, 14).mirror()
						.addBox(-2.0F, -3.0F, -15.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.125F)).mirror(false)
						.texOffs(112, 0).mirror()
						.addBox(-2.0F, -3.0F, -15.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r2 = orbs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(112, 14).mirror()
						.addBox(-2.0F, -3.0F, -15.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.125F)).mirror(false)
						.texOffs(112, 0).mirror()
						.addBox(-2.0F, -3.0F, -15.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		orbs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.orbs.yRot = ageInTicks / 20.f;
	}
}