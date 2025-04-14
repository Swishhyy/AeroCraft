package swishhyy.aerocraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomArrowEntity extends PersistentProjectileEntity {
    private final float damageModifier;

    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world, LivingEntity shooter, float damageModifier) {
        super(entityType, shooter, world);
        this.damageModifier = damageModifier;
    }


    @Override
    protected ItemStack asItemStack() {
        // Return the appropriate arrow item based on entity type or tags
        return ItemStack.EMPTY; // Replace with actual implementation
    }

    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, World world, float damageModifier) {
        super(entityType, world);
        this.damageModifier = damageModifier;
    }

    @Override
    public double getDamage() {
        return (float) (super.getDamage() * damageModifier);
    }
}