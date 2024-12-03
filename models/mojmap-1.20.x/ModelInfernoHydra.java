// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelInfernoHydra<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "infernohydra"), "main");
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart left_bottomwing;
	private final ModelPart right_bottomwing;
	private final ModelPart head;
	private final ModelPart head3;
	private final ModelPart head2;
	private final ModelPart bone;

	public ModelInfernoHydra(ModelPart root) {
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.left_bottomwing = root.getChild("left_bottomwing");
		this.right_bottomwing = root.getChild("right_bottomwing");
		this.head = root.getChild("head");
		this.head3 = root.getChild("head3");
		this.head2 = root.getChild("head2");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-12.0F, -7.0F, -40.0F, 24.0F, 24.0F, 64.0F, new CubeDeformation(1.0F)).texOffs(42, 42)
						.addBox(-12.0F, -8.0F, -40.0F, 24.0F, 24.0F, 22.0F, new CubeDeformation(3.0F)).texOffs(220, 53)
						.addBox(-1.0F, -14.0F, -34.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(1.0F)).texOffs(220, 53)
						.addBox(-1.0F, -12.0F, -12.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(1.0F)).texOffs(220, 53)
						.addBox(-1.0F, -12.0F, 8.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 4.0F, 8.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(16.0F, 5.0F, -3.0F, -0.0114F, 0.0865F, -0.1314F));

		PartDefinition left_wing_tip_r1 = left_wing.addOrReplaceChild("left_wing_tip_r1", CubeListBuilder.create()
				.texOffs(112, 136).mirror().addBox(48.0F, -5.5F, -62.5F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(-56, 144).mirror()
				.addBox(48.0F, -3.5F, -58.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(-56, 88).mirror().addBox(-8.0F, -3.5F, -58.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(112, 88).mirror()
				.addBox(-8.0F, -7.5F, -64.5F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-16.5F, 6.25F, 39.25F, -0.096F, -0.3927F, 0.0349F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-16.0F, 5.0F, -3.0F, -0.0114F, -0.0865F, 0.1314F));

		PartDefinition right_wing_tip_r1 = right_wing.addOrReplaceChild("right_wing_tip_r1",
				CubeListBuilder.create().texOffs(-56, 144)
						.addBox(-104.0F, -3.5F, -58.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 136)
						.addBox(-104.0F, -5.5F, -62.5F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 88)
						.addBox(-48.0F, -7.5F, -64.5F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-56, 88)
						.addBox(-48.0F, -3.5F, -58.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, 6.25F, 39.25F, -0.096F, 0.3927F, -0.0349F));

		PartDefinition left_bottomwing = partdefinition.addOrReplaceChild("left_bottomwing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 41.0F, -21.0F, -0.0873F, -0.0435F, 0.0038F));

		PartDefinition left_wing_r1 = left_bottomwing.addOrReplaceChild("left_wing_r1", CubeListBuilder.create()
				.texOffs(-56, 88).mirror().addBox(-9.5F, 6.75F, -41.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(112, 88).mirror()
				.addBox(-9.5F, 2.75F, -47.5F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 136).mirror().addBox(46.5F, 4.75F, -45.5F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(-56, 144).mirror()
				.addBox(46.5F, 6.75F, -41.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, -32.75F, 55.75F, -0.096F, -0.3927F, 0.0349F));

		PartDefinition right_bottomwing = partdefinition.addOrReplaceChild("right_bottomwing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 41.0F, -21.0F, -0.0873F, 0.0435F, -0.0038F));

		PartDefinition right_wing_r1 = right_bottomwing.addOrReplaceChild("right_wing_r1",
				CubeListBuilder.create().texOffs(-56, 88)
						.addBox(-46.5F, 6.75F, -41.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(-56, 144)
						.addBox(-102.5F, 6.75F, -41.5F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 136)
						.addBox(-102.5F, 4.75F, -45.5F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 88)
						.addBox(-46.5F, 2.75F, -47.5F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -32.75F, 55.75F, -0.096F, 0.3927F, -0.0349F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(176, 44)
				.addBox(-6.0F, 1.7331F, -60.5F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 30)
				.addBox(-8.0F, -5.2669F, -46.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(3.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 0)
				.addBox(3.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-5.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 0).mirror().addBox(-5.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(176, 65)
				.addBox(-6.0F, 6.7331F, -60.5F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-5.0F, -1.2669F, -10.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-1.0F, -5.2669F, -8.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-1.0F, -6.2669F, -18.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-5.0F, -2.2669F, -20.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-1.0F, -5.2669F, -28.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-5.0F, -1.2669F, -30.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.2669F, -33.5F));

		PartDefinition head3 = partdefinition.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(176, 44)
				.addBox(-6.0F, 1.7331F, -60.5F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 30)
				.addBox(-8.0F, -5.2669F, -46.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(3.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 0)
				.addBox(3.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-5.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 0).mirror().addBox(-5.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(176, 65)
				.addBox(-6.0F, 6.7331F, -60.5F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-9.0F, -1.2669F, -10.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-5.0F, -5.2669F, -8.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-3.0F, -4.2669F, -18.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-7.0F, -0.2669F, -20.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-1.0F, -5.2669F, -28.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-5.0F, -1.2669F, -30.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(17.0F, 4.2669F, -33.5F));

		PartDefinition head2 = partdefinition.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(176, 44)
				.addBox(-6.0F, 1.7331F, -60.5F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 30)
				.addBox(-8.0F, -5.2669F, -46.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(3.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 0)
				.addBox(3.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-5.0F, -9.2669F, -40.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 0).mirror().addBox(-5.0F, -0.2669F, -58.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(176, 65)
				.addBox(-6.0F, 6.7331F, -60.5F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-1.0F, -1.2669F, -10.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(3.0F, -5.2669F, -8.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(1.0F, -4.2669F, -18.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-3.0F, -0.2669F, -20.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(-1.0F, -5.2669F, -28.5F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
				.addBox(-5.0F, -1.2669F, -30.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-17.0F, 4.2669F, -33.5F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 11.75F, 28.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail13 = bone.addOrReplaceChild("tail13",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -3.0F, -0.0423F, 0.3055F, 0.004F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -7.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -11.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -11.0F, -31.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 38.0F));

		PartDefinition tail15 = tail14.addOrReplaceChild("tail15",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail16 = tail15.addOrReplaceChild("tail16",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -7.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -11.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail17 = tail16.addOrReplaceChild("tail17",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail18 = tail17.addOrReplaceChild("tail18",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -7.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -11.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail19 = tail18.addOrReplaceChild("tail19",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail20 = tail19.addOrReplaceChild("tail20",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -7.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -11.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail21 = tail20.addOrReplaceChild("tail21", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail22 = tail21.addOrReplaceChild("tail22", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail23 = tail22.addOrReplaceChild("tail23", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail24 = tail23.addOrReplaceChild("tail24", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail25 = bone.addOrReplaceChild("tail25",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, 4.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -13.0F, 6.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.131F, -0.0433F, -0.0057F));

		PartDefinition tail26 = tail25.addOrReplaceChild("tail26",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 38.0F));

		PartDefinition tail27 = tail26.addOrReplaceChild("tail27",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -4.5F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -8.5F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.5F, -9.0F));

		PartDefinition tail28 = tail27.addOrReplaceChild("tail28",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.5F, 29.0F));

		PartDefinition tail29 = tail28.addOrReplaceChild("tail29",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -11.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -15.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail30 = tail29.addOrReplaceChild("tail30",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail31 = tail30.addOrReplaceChild("tail31",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-1.0F, -15.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
						.addBox(-5.0F, -11.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail32 = tail31.addOrReplaceChild("tail32",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail33 = tail32.addOrReplaceChild("tail33",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -11.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -15.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail34 = tail33.addOrReplaceChild("tail34", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail35 = tail34.addOrReplaceChild("tail35", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail36 = tail35.addOrReplaceChild("tail36", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail1 = bone.addOrReplaceChild("tail1",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0423F, -0.3055F, -0.004F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 38.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -44.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail37 = bone.addOrReplaceChild("tail37",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1747F, 0.0433F, -0.0057F));

		PartDefinition tail38 = tail37.addOrReplaceChild("tail38",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 38.0F));

		PartDefinition tail39 = tail38.addOrReplaceChild("tail39",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail40 = tail39.addOrReplaceChild("tail40",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail41 = tail40.addOrReplaceChild("tail41",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail42 = tail41.addOrReplaceChild("tail42",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail43 = tail42.addOrReplaceChild("tail43",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail44 = tail43.addOrReplaceChild("tail44",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail45 = tail44.addOrReplaceChild("tail45",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -8.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -12.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail46 = tail45.addOrReplaceChild("tail46",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -10.0F, -24.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -14.0F, -22.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail47 = tail46.addOrReplaceChild("tail47", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail48 = tail47.addOrReplaceChild("tail48", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_bottomwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_bottomwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_bottomwing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.right_wing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.left_wing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.left_bottomwing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.head2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head2.xRot = headPitch / (180F / (float) Math.PI);
		this.head3.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head3.xRot = headPitch / (180F / (float) Math.PI);
	}
}