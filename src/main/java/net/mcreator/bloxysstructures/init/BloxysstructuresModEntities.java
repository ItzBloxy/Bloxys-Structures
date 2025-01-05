
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxysstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.bloxysstructures.entity.VoidWalkersEntity;
import net.mcreator.bloxysstructures.entity.TreemooEntity;
import net.mcreator.bloxysstructures.entity.QuantumMageEntity;
import net.mcreator.bloxysstructures.entity.QuantumGuardianEntity;
import net.mcreator.bloxysstructures.entity.QuantamMagicOrbEntity;
import net.mcreator.bloxysstructures.entity.PurpleLightningShockwaveEntity;
import net.mcreator.bloxysstructures.entity.PrinceOfDarknessEntity;
import net.mcreator.bloxysstructures.entity.MushroomKingEntity;
import net.mcreator.bloxysstructures.entity.InfernoHydraEntity;
import net.mcreator.bloxysstructures.entity.GiantWolfEntity;
import net.mcreator.bloxysstructures.entity.CowlinEntity;
import net.mcreator.bloxysstructures.entity.CowlinBruteEntity;
import net.mcreator.bloxysstructures.entity.BloxysScytheThrowablePlayerEntity;
import net.mcreator.bloxysstructures.entity.BloxysScytheThrowableEntity;
import net.mcreator.bloxysstructures.entity.BloxyEntity;
import net.mcreator.bloxysstructures.entity.AdventureRealmGolemEntity;
import net.mcreator.bloxysstructures.BloxysstructuresMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BloxysstructuresModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, BloxysstructuresMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<GiantWolfEntity>> GIANT_WOLF = register("giant_wolf",
			EntityType.Builder.<GiantWolfEntity>of(GiantWolfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.85f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdventureRealmGolemEntity>> ADVENTURE_REALM_GOLEM = register("adventure_realm_golem",
			EntityType.Builder.<AdventureRealmGolemEntity>of(AdventureRealmGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CowlinEntity>> COWLIN = register("cowlin",
			EntityType.Builder.<CowlinEntity>of(CowlinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<CowlinBruteEntity>> COWLIN_BRUTE = register("cowlin_brute",
			EntityType.Builder.<CowlinBruteEntity>of(CowlinBruteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<InfernoHydraEntity>> INFERNO_HYDRA = register("inferno_hydra",
			EntityType.Builder.<InfernoHydraEntity>of(InfernoHydraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrinceOfDarknessEntity>> PRINCE_OF_DARKNESS = register("prince_of_darkness",
			EntityType.Builder.<PrinceOfDarknessEntity>of(PrinceOfDarknessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).fireImmune().sized(0.8f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MushroomKingEntity>> MUSHROOM_KING = register("mushroom_king",
			EntityType.Builder.<MushroomKingEntity>of(MushroomKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<VoidWalkersEntity>> VOID_WALKERS = register("void_walkers",
			EntityType.Builder.<VoidWalkersEntity>of(VoidWalkersEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuantumGuardianEntity>> QUANTUM_GUARDIAN = register("quantum_guardian",
			EntityType.Builder.<QuantumGuardianEntity>of(QuantumGuardianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuantumMageEntity>> QUANTUM_MAGE = register("quantum_mage",
			EntityType.Builder.<QuantumMageEntity>of(QuantumMageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuantamMagicOrbEntity>> QUANTAM_MAGIC_ORB = register("quantam_magic_orb",
			EntityType.Builder.<QuantamMagicOrbEntity>of(QuantamMagicOrbEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BloxyEntity>> BLOXY = register("bloxy",
			EntityType.Builder.<BloxyEntity>of(BloxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BloxysScytheThrowableEntity>> BLOXYS_SCYTHE_THROWABLE = register("bloxys_scythe_throwable",
			EntityType.Builder.<BloxysScytheThrowableEntity>of(BloxysScytheThrowableEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PurpleLightningShockwaveEntity>> PURPLE_LIGHTNING_SHOCKWAVE = register("purple_lightning_shockwave",
			EntityType.Builder.<PurpleLightningShockwaveEntity>of(PurpleLightningShockwaveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<BloxysScytheThrowablePlayerEntity>> BLOXYS_SCYTHE_THROWABLE_PLAYER = register("bloxys_scythe_throwable_player",
			EntityType.Builder.<BloxysScytheThrowablePlayerEntity>of(BloxysScytheThrowablePlayerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TreemooEntity>> TREEMOO = register("treemoo",
			EntityType.Builder.<TreemooEntity>of(TreemooEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		GiantWolfEntity.init(event);
		AdventureRealmGolemEntity.init(event);
		CowlinEntity.init(event);
		CowlinBruteEntity.init(event);
		InfernoHydraEntity.init(event);
		PrinceOfDarknessEntity.init(event);
		MushroomKingEntity.init(event);
		VoidWalkersEntity.init(event);
		QuantumGuardianEntity.init(event);
		QuantumMageEntity.init(event);
		BloxyEntity.init(event);
		PurpleLightningShockwaveEntity.init(event);
		TreemooEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GIANT_WOLF.get(), GiantWolfEntity.createAttributes().build());
		event.put(ADVENTURE_REALM_GOLEM.get(), AdventureRealmGolemEntity.createAttributes().build());
		event.put(COWLIN.get(), CowlinEntity.createAttributes().build());
		event.put(COWLIN_BRUTE.get(), CowlinBruteEntity.createAttributes().build());
		event.put(INFERNO_HYDRA.get(), InfernoHydraEntity.createAttributes().build());
		event.put(PRINCE_OF_DARKNESS.get(), PrinceOfDarknessEntity.createAttributes().build());
		event.put(MUSHROOM_KING.get(), MushroomKingEntity.createAttributes().build());
		event.put(VOID_WALKERS.get(), VoidWalkersEntity.createAttributes().build());
		event.put(QUANTUM_GUARDIAN.get(), QuantumGuardianEntity.createAttributes().build());
		event.put(QUANTUM_MAGE.get(), QuantumMageEntity.createAttributes().build());
		event.put(BLOXY.get(), BloxyEntity.createAttributes().build());
		event.put(PURPLE_LIGHTNING_SHOCKWAVE.get(), PurpleLightningShockwaveEntity.createAttributes().build());
		event.put(TREEMOO.get(), TreemooEntity.createAttributes().build());
	}
}
