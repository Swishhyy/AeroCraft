package swishhyy.aerocraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import swishhyy.aerocraft.AeroCraft;
import swishhyy.aerocraft.entity.CustomArrowEntity;

public class ModItems {
    // Custom arrow item class
    public static class CustomArrowItem extends ArrowItem {
        private final float damageModifier;
        private final boolean lightweight;

        public CustomArrowItem(Settings settings, float damageModifier, boolean lightweight) {
            super(settings);
            this.damageModifier = damageModifier;
            this.lightweight = lightweight;
        }

        public CustomArrowItem(Settings settings, float damageModifier) {
            this(settings, damageModifier, false);
        }

        @Override
        public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
            CustomArrowEntity arrow = new CustomArrowEntity(world, shooter, damageModifier, lightweight);
            arrow.setArrowStack(stack);
            return arrow;
        }
    }
    // Arrow Heads
    public static final Item WOODEN_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item STONE_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item IRON_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item GOLD_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item DIAMOND_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item NETHERITE_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item FLINT_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item QUARTZ_ARROW_HEAD = new Item(new Item.Settings());

    // Regular arrow items
    public static final Item WOODEN_ARROW = new CustomArrowItem(new Item.Settings(), 0.8f);
    public static final Item STONE_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);
    public static final Item IRON_ARROW = new CustomArrowItem(new Item.Settings(), 1.2f);
    public static final Item GOLD_ARROW = new CustomArrowItem(new Item.Settings(), 1.5f);
    public static final Item DIAMOND_ARROW = new CustomArrowItem(new Item.Settings(), 2.0f);
    public static final Item NETHERITE_ARROW = new CustomArrowItem(new Item.Settings(), 2.5f);
    public static final Item FLINT_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);
    public static final Item QUARTZ_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);

    // Lightweight arrow items
    public static final Item LIGHTWEIGHT_WOODEN_ARROW = new CustomArrowItem(new Item.Settings(), 0.7f, true);
    public static final Item LIGHTWEIGHT_STONE_ARROW = new CustomArrowItem(new Item.Settings(), 0.9f, true);
    public static final Item LIGHTWEIGHT_IRON_ARROW = new CustomArrowItem(new Item.Settings(), 1.1f, true);
    public static final Item LIGHTWEIGHT_GOLD_ARROW = new CustomArrowItem(new Item.Settings(), 1.4f, true);
    public static final Item LIGHTWEIGHT_DIAMOND_ARROW = new CustomArrowItem(new Item.Settings(), 1.8f, true);
    public static final Item LIGHTWEIGHT_NETHERITE_ARROW = new CustomArrowItem(new Item.Settings(), 2.3f, true);
    public static final Item LIGHTWEIGHT_FLINT_ARROW = new CustomArrowItem(new Item.Settings(), 0.9f, true);
    public static final Item LIGHTWEIGHT_QUARTZ_ARROW = new CustomArrowItem(new Item.Settings(), 0.9f, true);

    // Registration code
    public static void registerItems() {
        AeroCraft.LOGGER.info("Registering mod items for " + AeroCraft.MOD_ID);
        // Register arrow heads
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "wooden_arrow_head"), WOODEN_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "stone_arrow_head"), STONE_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "iron_arrow_head"), IRON_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "gold_arrow_head"), GOLD_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "diamond_arrow_head"), DIAMOND_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "netherite_arrow_head"), NETHERITE_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "flint_arrow_head"), FLINT_ARROW_HEAD);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "quartz_arrow_head"), QUARTZ_ARROW_HEAD);

        // Register regular arrows
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "wooden_arrow"), WOODEN_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "stone_arrow"), STONE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "iron_arrow"), IRON_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "gold_arrow"), GOLD_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "diamond_arrow"), DIAMOND_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "netherite_arrow"), NETHERITE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "flint_arrow"), FLINT_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "quartz_arrow"), QUARTZ_ARROW);

        // Register lightweight arrows
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_wooden_arrow"), LIGHTWEIGHT_WOODEN_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_stone_arrow"), LIGHTWEIGHT_STONE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_iron_arrow"), LIGHTWEIGHT_IRON_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_gold_arrow"), LIGHTWEIGHT_GOLD_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_diamond_arrow"), LIGHTWEIGHT_DIAMOND_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_netherite_arrow"), LIGHTWEIGHT_NETHERITE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_flint_arrow"), LIGHTWEIGHT_FLINT_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "lightweight_quartz_arrow"), LIGHTWEIGHT_QUARTZ_ARROW);
    }

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP,
                new Identifier(AeroCraft.MOD_ID, "arrows"),
                ARROW_GROUP);
    }

    public static final ItemGroup ARROW_GROUP = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.aerocraft"))
            .icon(() -> new ItemStack(DIAMOND_ARROW))
            .entries((context, entries) -> {
                // Arrow Heads
                entries.add(WOODEN_ARROW_HEAD);
                entries.add(STONE_ARROW_HEAD);
                entries.add(IRON_ARROW_HEAD);
                entries.add(GOLD_ARROW_HEAD);
                entries.add(DIAMOND_ARROW_HEAD);
                entries.add(NETHERITE_ARROW_HEAD);
                entries.add(FLINT_ARROW_HEAD);
                entries.add(QUARTZ_ARROW_HEAD);

                // Regular arrows
                entries.add(WOODEN_ARROW);
                entries.add(STONE_ARROW);
                entries.add(IRON_ARROW);
                entries.add(GOLD_ARROW);
                entries.add(DIAMOND_ARROW);
                entries.add(NETHERITE_ARROW);
                entries.add(FLINT_ARROW);
                entries.add(QUARTZ_ARROW);

                // Lightweight arrows
                entries.add(LIGHTWEIGHT_WOODEN_ARROW);
                entries.add(LIGHTWEIGHT_STONE_ARROW);
                entries.add(LIGHTWEIGHT_IRON_ARROW);
                entries.add(LIGHTWEIGHT_GOLD_ARROW);
                entries.add(LIGHTWEIGHT_DIAMOND_ARROW);
                entries.add(LIGHTWEIGHT_NETHERITE_ARROW);
                entries.add(LIGHTWEIGHT_FLINT_ARROW);
                entries.add(LIGHTWEIGHT_QUARTZ_ARROW);
            })
            .build();
}