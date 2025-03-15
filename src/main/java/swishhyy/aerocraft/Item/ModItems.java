package swishhyy.aerocraft.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import swishhyy.aerocraft.AeroCraft;

import java.util.function.Function;

public class ModItems {

    // 1) We’ll declare the items, but not initialize them here
    public static Item WOODEN_ARROW;
    public static Item STONE_ARROW;
    public static Item IRON_ARROW;
    public static Item GOLD_ARROW;
    public static Item DIAMOND_ARROW;
    public static Item EMERALD_ARROW;
    public static Item COPPER_ARROW;
    public static Item QUARTZ_ARROW;
    public static Item REDSTONE_ARROW;
    public static Item ANCIENT_DEBRIS_ARROW;

    // 2) A register method that matches the new docs style
    private static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create a RegistryKey<Item> for "aerocraft:name"
        RegistryKey<Item> itemKey = RegistryKey.of(
                RegistryKeys.ITEM,
                Identifier.of(AeroCraft.MOD_ID, name)
        );

        // Attach that key to the Item.Settings
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item with the game’s registry
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    // 3) The initialize method (called in your main mod class) sets up the items
    public static void initialize() {
        AeroCraft.LOGGER.info("Registering Mod Items for " + AeroCraft.MOD_ID);

        // Create & register each arrow item
        WOODEN_ARROW         = register("wooden_arrow",         Item::new, new Item.Settings());
        STONE_ARROW          = register("stone_arrow",          Item::new, new Item.Settings());
        IRON_ARROW           = register("iron_arrow",           Item::new, new Item.Settings());
        GOLD_ARROW           = register("gold_arrow",           Item::new, new Item.Settings());
        DIAMOND_ARROW        = register("diamond_arrow",        Item::new, new Item.Settings());
        EMERALD_ARROW        = register("emerald_arrow",        Item::new, new Item.Settings());
        COPPER_ARROW         = register("copper_arrow",         Item::new, new Item.Settings());
        QUARTZ_ARROW         = register("quartz_arrow",         Item::new, new Item.Settings());
        REDSTONE_ARROW       = register("redstone_arrow",       Item::new, new Item.Settings());
        ANCIENT_DEBRIS_ARROW = register("ancient_debris_arrow", Item::new, new Item.Settings());

        // Add them all to the COMBAT group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WOODEN_ARROW);
            entries.add(STONE_ARROW);
            entries.add(IRON_ARROW);
            entries.add(GOLD_ARROW);
            entries.add(DIAMOND_ARROW);
            entries.add(EMERALD_ARROW);
            entries.add(COPPER_ARROW);
            entries.add(QUARTZ_ARROW);
            entries.add(REDSTONE_ARROW);
            entries.add(ANCIENT_DEBRIS_ARROW);
        });
    }
}
