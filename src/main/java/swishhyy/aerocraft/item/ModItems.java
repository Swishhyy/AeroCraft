package swishhyy.aerocraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import swishhyy.aerocraft.AeroCraft;
import swishhyy.aerocraft.entity.CustomArrowEntity;

public class ModItems {
    // Custom arrow item class
    public static class CustomArrowItem extends ArrowItem {
        private final float damageModifier;

        public CustomArrowItem(Settings settings, float damageModifier) {
            super(settings);
            this.damageModifier = damageModifier;
        }

        @Override
        public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
            CustomArrowEntity arrow = new CustomArrowEntity(world, shooter, damageModifier);
            arrow.setArrowStack(stack);
            return arrow;
        }
    }

    // Arrow items
    public static final Item WOODEN_ARROW = new CustomArrowItem(new Item.Settings(), 0.8f);
    public static final Item STONE_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);
    public static final Item IRON_ARROW = new CustomArrowItem(new Item.Settings(), 1.2f);
    public static final Item GOLD_ARROW = new CustomArrowItem(new Item.Settings(), 1.5f);
    public static final Item DIAMOND_ARROW = new CustomArrowItem(new Item.Settings(), 2.0f);
    public static final Item NETHERITE_ARROW = new CustomArrowItem(new Item.Settings(), 2.5f);
    public static final Item FLINT_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);
    public static final Item QUARTZ_ARROW = new CustomArrowItem(new Item.Settings(), 1.0f);

    // Registration code
    public static void registerItems() {
        AeroCraft.LOGGER.info("Registering mod items for " + AeroCraft.MOD_ID);

        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "wooden_arrow"), WOODEN_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "stone_arrow"), STONE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "iron_arrow"), IRON_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "gold_arrow"), GOLD_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "diamond_arrow"), DIAMOND_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "netherite_arrow"), NETHERITE_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "flint_arrow"), FLINT_ARROW);
        Registry.register(Registries.ITEM, new Identifier(AeroCraft.MOD_ID, "quartz_arrow"), QUARTZ_ARROW);
    }
}