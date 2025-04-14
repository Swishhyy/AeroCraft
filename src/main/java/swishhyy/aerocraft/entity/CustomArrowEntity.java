package swishhyy.aerocraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import swishhyy.aerocraft.item.ModItems;

public class CustomArrowEntity extends ArrowEntity {
    private final float damageModifier;
    private ItemStack arrowStack = ItemStack.EMPTY;

    // Constructor for ModEntityTypes factory methods
    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world, float damageModifier) {
        super(entityType, world);
        this.damageModifier = damageModifier;
    }

    // Constructor for when shot from a bow
    public CustomArrowEntity(World world, LivingEntity owner, float damageModifier) {
        super(world, owner);
        this.damageModifier = damageModifier;
    }


    @Override
    protected ItemStack asItemStack() {
        // Return the appropriate arrow item based on entity type
        if (this.arrowStack.isEmpty()) {
            EntityType<?> entityType = this.getType();

            if (entityType == ModEntityTypes.WOODEN_ARROW) return new ItemStack(ModItems.WOODEN_ARROW);
            else if (entityType == ModEntityTypes.STONE_ARROW) return new ItemStack(ModItems.STONE_ARROW);
            else if (entityType == ModEntityTypes.IRON_ARROW) return new ItemStack(ModItems.IRON_ARROW);
            else if (entityType == ModEntityTypes.GOLD_ARROW) return new ItemStack(ModItems.GOLD_ARROW);
            else if (entityType == ModEntityTypes.DIAMOND_ARROW) return new ItemStack(ModItems.DIAMOND_ARROW);
            else if (entityType == ModEntityTypes.NETHERITE_ARROW) return new ItemStack(ModItems.NETHERITE_ARROW);
            else if (entityType == ModEntityTypes.FLINT_ARROW) return new ItemStack(ModItems.FLINT_ARROW);
            else if (entityType == ModEntityTypes.QUARTZ_ARROW) return new ItemStack(ModItems.QUARTZ_ARROW);
            else return new ItemStack(ModItems.WOODEN_ARROW);  // Fallback
        }

        return this.arrowStack;
    }

    // Method to set the source arrow item
    public void setArrowStack(ItemStack stack) {
        this.arrowStack = stack.copy();
    }

    @Override
    public double getDamage() {
        return super.getDamage() * damageModifier;
    }
}