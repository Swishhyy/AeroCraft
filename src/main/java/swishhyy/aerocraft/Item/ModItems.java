package swishhyy.aerocraft.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import swishhyy.aerocraft.AeroCraft;

public class ModItems {

    // Arrows
    public static final Item WOODEN_ARROW = registerItem("wooden_arrow", new Item(new Item.Settings()));
    public static final Item STONE_ARROW = registerItem("stone_arrow", new Item(new Item.Settings()));
    public static final Item IRON_ARROW = registerItem("iron_arrow", new Item(new Item.Settings()));
    public static final Item GOLD_ARROW = registerItem("gold_arrow", new Item(new Item.Settings()));
    public static final Item DIAMOND_ARROW = registerItem("diamond_arrow", new Item(new Item.Settings()));
    public static final Item EMERALD_ARROW = registerItem("emerald_arrow", new Item(new Item.Settings()));
    public static final Item COPPER_ARROW = registerItem("copper_arrow", new Item(new Item.Settings()));
    public static final Item QUARTZ_ARROW = registerItem("quartz_arrow", new Item(new Item.Settings()));
    public static final Item REDSTONE_ARROW = registerItem("redstone_arrow", new Item(new Item.Settings()));
    public static final Item ANCIENT_DEBRIS_ARROW = registerItem("ancient_debris_arrow", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AeroCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AeroCraft.LOGGER.info("Registering Mod Items for " + AeroCraft.MOD_ID);

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
