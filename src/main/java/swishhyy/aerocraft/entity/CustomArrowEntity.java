package swishhyy.aerocraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import swishhyy.aerocraft.item.ModItems;

public class CustomArrowEntity extends ArrowEntity {
    private final float damageModifier;
    private final boolean lightweight;
    private ItemStack arrowStack = ItemStack.EMPTY;

    // Constructor for ModEntityTypes factory methods
    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world, float damageModifier, boolean lightweight) {
        super(entityType, world);
        this.damageModifier = damageModifier;
        this.lightweight = lightweight;
    }

    // Constructor for ModEntityTypes factory methods (backward compatibility)
    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world, float damageModifier) {
        this(entityType, world, damageModifier, false);
    }

    // Constructor for when shot from a bow
    public CustomArrowEntity(World world, LivingEntity owner, float damageModifier, boolean lightweight) {
        super(world, owner);
        this.damageModifier = damageModifier;
        this.lightweight = lightweight;
    }

    // Constructor for when shot from a bow (backward compatibility)
    public CustomArrowEntity(World world, LivingEntity owner, float damageModifier) {
        this(world, owner, damageModifier, false);
    }

    // Override tick method to modify arrow physics for lightweight arrows
    @Override
    public void tick() {
        super.tick();

        // If lightweight, reduce gravity effect
        if (lightweight && !this.inGround) {
            // Counteract some gravity by adding upward velocity
            this.setVelocity(this.getVelocity().add(0, 0.005, 0));
        }
    }

    // Reduce damage drop-off for lightweight arrows in water
    protected float getWaterDrag() {
        return lightweight ? 0.95F : 0.6F;
    }

    @Override
    protected ItemStack asItemStack() {
        // Return the appropriate arrow item based on entity type
        if (this.arrowStack.isEmpty()) {
            EntityType<?> entityType = this.getType();

            if (entityType == ModEntityTypes.LIGHTWEIGHT_WOODEN_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_WOODEN_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_STONE_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_STONE_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_IRON_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_IRON_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_GOLD_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_GOLD_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_DIAMOND_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_DIAMOND_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_NETHERITE_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_NETHERITE_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_FLINT_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_FLINT_ARROW);
            else if (entityType == ModEntityTypes.LIGHTWEIGHT_QUARTZ_ARROW) return new ItemStack(ModItems.LIGHTWEIGHT_QUARTZ_ARROW);
            else if (entityType == ModEntityTypes.WOODEN_ARROW) return new ItemStack(ModItems.WOODEN_ARROW);
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

    public boolean isLightweight() {
        return lightweight;
    }
}