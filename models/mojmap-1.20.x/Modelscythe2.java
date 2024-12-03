// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelscythe2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "scythe2"), "main");
	private final ModelPart BloxysScythe;

	public Modelscythe2(ModelPart root) {
		this.BloxysScythe = root.getChild("BloxysScythe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition BloxysScythe = partdefinition.addOrReplaceChild("BloxysScythe",
				CubeListBuilder.create().texOffs(10, 0)
						.addBox(-1.2561F, -13.6341F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 16)
						.addBox(2.7439F, -12.6341F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.2561F, -12.6341F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 10)
						.addBox(5.7439F, -11.6341F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.2561F, -11.6341F, -0.5F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(18, 29).addBox(7.7439F, -10.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(6, 0).addBox(-7.2561F, -10.6341F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(28, 27).addBox(8.7439F, -9.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(16, 7).addBox(-8.2561F, -9.6341F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(10, 7).addBox(-11.2561F, -9.6341F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(24, 28).addBox(9.7439F, -8.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(11, 30).addBox(6.7439F, -8.6341F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 20).addBox(-9.2561F, -8.6341F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(22, 20).addBox(-12.2561F, -8.6341F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(30, 9).addBox(-1.2561F, -7.6341F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(30, 3).addBox(-13.2561F, -7.6341F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 21).addBox(-4.2561F, -6.6341F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(29, 16).addBox(-4.2561F, -5.6341F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(7, 28).addBox(-12.2561F, -3.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 28).addBox(-4.2561F, -2.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(27, 12).addBox(-13.2561F, -2.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 17).addBox(-3.2561F, -1.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(30, 0).addBox(-14.2561F, -1.6341F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(18, 21).addBox(-2.2561F, -0.6341F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(15, 26).addBox(-8.2561F, -0.6341F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(20, 5).addBox(-1.2561F, 0.3659F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(29, 7).addBox(-6.2561F, 0.3659F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(29, 23).addBox(-9.2561F, 0.3659F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(14, 21).addBox(0.7439F, 1.3659F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(11, 26).addBox(1.7439F, 3.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 8).addBox(2.7439F, 4.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 4).addBox(3.7439F, 5.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 0).addBox(4.7439F, 6.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(25, 24).addBox(5.7439F, 7.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(21, 25).addBox(6.7439F, 8.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(4, 25).addBox(7.7439F, 9.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 14).addBox(8.7439F, 10.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(8, 23).addBox(9.7439F, 11.3659F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(4, 20).addBox(10.7439F, 12.3659F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(8, 17).addBox(11.7439F, 13.3659F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(20, 0).addBox(13.7439F, 14.3659F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2433F, 4.1964F, 2.6058F, -3.1416F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		BloxysScythe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}