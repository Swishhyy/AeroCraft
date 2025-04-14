package swishhyy.aerocraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import swishhyy.aerocraft.AeroCraft;

public class ModEntityTypes {
    public static final EntityType<CustomArrowEntity> WOODEN_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 0.8f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> STONE_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.0f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> IRON_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.2f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> GOLD_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.5f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> DIAMOND_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 2.0f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> NETHERITE_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 2.5f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> FLINT_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.0f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> QUARTZ_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.0f))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_WOODEN_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 0.7f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_STONE_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 0.9f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_IRON_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.1f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_GOLD_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.4f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_DIAMOND_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 1.8f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_NETHERITE_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 2.3f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_FLINT_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 0.9f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();

    public static final EntityType<CustomArrowEntity> LIGHTWEIGHT_QUARTZ_ARROW = FabricEntityTypeBuilder.<CustomArrowEntity>create(SpawnGroup.MISC, (entityType, world) -> new CustomArrowEntity(entityType, world, 0.9f, true))
            .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
            .trackRangeChunks(4).trackedUpdateRate(20)
            .build();



    public static void registerEntities() { // Registering the entity types

        // Normal arrows
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "wooden_arrow"), WOODEN_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "stone_arrow"), STONE_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "iron_arrow"), IRON_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "gold_arrow"), GOLD_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "diamond_arrow"), DIAMOND_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "netherite_arrow"), NETHERITE_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "flint_arrow"), FLINT_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "quartz_arrow"), QUARTZ_ARROW);

        // Lightweight arrows
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_wooden_arrow"), LIGHTWEIGHT_WOODEN_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_stone_arrow"), LIGHTWEIGHT_STONE_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_iron_arrow"), LIGHTWEIGHT_IRON_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_gold_arrow"), LIGHTWEIGHT_GOLD_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_diamond_arrow"), LIGHTWEIGHT_DIAMOND_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_netherite_arrow"), LIGHTWEIGHT_NETHERITE_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_flint_arrow"), LIGHTWEIGHT_FLINT_ARROW);
        Registry.register(Registries.ENTITY_TYPE, new Identifier(AeroCraft.MOD_ID, "lightweight_quartz_arrow"), LIGHTWEIGHT_QUARTZ_ARROW);

    }
}