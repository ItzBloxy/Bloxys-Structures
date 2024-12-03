
package net.mcreator.bloxysstructures.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.EventHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.bloxysstructures.procedures.IsGiantWolfSittingProcedure;
import net.mcreator.bloxysstructures.procedures.GiantWolfRightClickedOnEntityProcedure;
import net.mcreator.bloxysstructures.procedures.GiantWolfOnEntityTickUpdateProcedure;
import net.mcreator.bloxysstructures.init.BloxysstructuresModEntities;

public class GiantWolfEntity extends TamableAnimal {
	public static final EntityDataAccessor<Boolean> DATA_Sitting = SynchedEntityData.defineId(GiantWolfEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_Armor = SynchedEntityData.defineId(GiantWolfEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> DATA_color = SynchedEntityData.defineId(GiantWolfEntity.class, EntityDataSerializers.STRING);

	public GiantWolfEntity(EntityType<GiantWolfEntity> type, Level world) {
		super(type, world);
		xpReward = 3;
		setNoAi(false);
		refreshDimensions();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_Sitting, false);
		builder.define(DATA_Armor, false);
		builder.define(DATA_color, "white");
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		}.setAlertOthers());
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < 6.25 && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(3, new OwnerHurtTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new OwnerHurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 5));
		this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.1, (float) 4, (float) 16) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new LeapAtTargetGoal(this, (float) 0.5) {
			@Override
			public boolean canUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canUse() && IsGiantWolfSittingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GiantWolfEntity.this.getX();
				double y = GiantWolfEntity.this.getY();
				double z = GiantWolfEntity.this.getZ();
				Entity entity = GiantWolfEntity.this;
				Level world = GiantWolfEntity.this.level();
				return super.canContinueToUse() && IsGiantWolfSittingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.death"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("DataSitting", this.entityData.get(DATA_Sitting));
		compound.putBoolean("DataArmor", this.entityData.get(DATA_Armor));
		compound.putString("Datacolor", this.entityData.get(DATA_color));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataSitting"))
			this.entityData.set(DATA_Sitting, compound.getBoolean("DataSitting"));
		if (compound.contains("DataArmor"))
			this.entityData.set(DATA_Armor, compound.getBoolean("DataArmor"));
		if (compound.contains("Datacolor"))
			this.entityData.set(DATA_color, compound.getString("Datacolor"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level().isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						FoodProperties foodproperties = itemstack.getFoodProperties(this);
						float nutrition = foodproperties != null ? (float) foodproperties.nutrition() : 1;
						this.heal(nutrition);
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level().isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		GiantWolfRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		GiantWolfOnEntityTickUpdateProcedure.execute(this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		GiantWolfEntity retval = BloxysstructuresModEntities.GIANT_WOLF.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(Items.BONE), new ItemStack(Blocks.AIR), new ItemStack(Items.COOKED_COD), new ItemStack(Items.COOKED_SALMON), new ItemStack(Items.COOKED_PORKCHOP), new ItemStack(Items.COOKED_BEEF),
				new ItemStack(Items.COOKED_CHICKEN), new ItemStack(Items.COOKED_RABBIT), new ItemStack(Items.COOKED_MUTTON), new ItemStack(Items.BEEF), new ItemStack(Items.RABBIT), new ItemStack(Items.MUTTON), new ItemStack(Items.PORKCHOP),
				new ItemStack(Items.COD), new ItemStack(Items.SALMON), new ItemStack(Items.CHICKEN)).test(stack);
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		return super.getDefaultDimensions(pose).scale(2f);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(BloxysstructuresModEntities.GIANT_WOLF.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 60);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		return builder;
	}
}
