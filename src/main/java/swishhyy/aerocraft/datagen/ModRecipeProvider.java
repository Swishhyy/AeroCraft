package swishhyy.aerocraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import swishhyy.aerocraft.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * Helper method to generate criterion ID from tag
     */
    private static String getHasTagName(TagKey<Item> tagKey) {
        return "has_" + tagKey.id().getPath();
    }

    /**
     * Helper method to create criterion conditions from item tag
     */
    private static CriterionConditions conditionsFromItemTag(TagKey<Item> tagKey) {
        return conditionsFromItemPredicates(ItemPredicate.Builder.create().tag(tagKey).build());
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // ============================================================
        // ARROW HEAD RECIPES
        // ============================================================
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_ARROW_HEAD, 4)
                .input(ItemTags.LOGS)
                .criterion(getHasTagName(ItemTags.LOGS), conditionsFromItemTag(ItemTags.LOGS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_ARROW_HEAD, 4)
                .input(ItemTags.STONE_CRAFTING_MATERIALS)
                .criterion(getHasTagName(ItemTags.STONE_CRAFTING_MATERIALS), conditionsFromItemTag(ItemTags.STONE_CRAFTING_MATERIALS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_ARROW_HEAD, 4)
                .input(Items.IRON_INGOT)
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_ARROW_HEAD, 4)
                .input(Items.GOLD_INGOT)
                .criterion("has_gold_ingot", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_ARROW_HEAD, 4)
                .input(Items.DIAMOND)
                .criterion("has_diamond", conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_ARROW_HEAD, 4)
                .input(Items.NETHERITE_INGOT)
                .criterion("has_netherite_ingot", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.FLINT_ARROW_HEAD, 4)
                .input(Items.FLINT)
                .criterion("has_flint", conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.QUARTZ_ARROW_HEAD, 4)
                .input(Items.QUARTZ)
                .criterion("has_quartz", conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter);

        // ============================================================
        // REGULAR ARROW RECIPES
        // ============================================================
        // Using arrow heads as criteria to maintain consistency between inputs and criteria
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_ARROW)
                .input(ModItems.WOODEN_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_wooden_arrow_head", conditionsFromItem(ModItems.WOODEN_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_ARROW)
                .input(ModItems.STONE_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_stone_arrow_head", conditionsFromItem(ModItems.STONE_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_ARROW)
                .input(ModItems.IRON_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_iron_arrow_head", conditionsFromItem(ModItems.IRON_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_ARROW)
                .input(ModItems.GOLD_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_gold_arrow_head", conditionsFromItem(ModItems.GOLD_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_ARROW)
                .input(ModItems.DIAMOND_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_diamond_arrow_head", conditionsFromItem(ModItems.DIAMOND_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_ARROW)
                .input(ModItems.NETHERITE_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_netherite_arrow_head", conditionsFromItem(ModItems.NETHERITE_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.FLINT_ARROW)
                .input(ModItems.FLINT_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_flint_arrow_head", conditionsFromItem(ModItems.FLINT_ARROW_HEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.QUARTZ_ARROW)
                .input(ModItems.QUARTZ_ARROW_HEAD)
                .input(Items.STICK)
                .input(Items.FEATHER)
                .criterion("has_quartz_arrow_head", conditionsFromItem(ModItems.QUARTZ_ARROW_HEAD))
                .offerTo(exporter);

        // ============================================================
        // LIGHTWEIGHT ARROW RECIPES
        // ============================================================
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_WOODEN_ARROW)
                .input(ModItems.WOODEN_ARROW)
                .input(Items.FEATHER)
                .criterion("has_wooden_arrow", conditionsFromItem(ModItems.WOODEN_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_STONE_ARROW)
                .input(ModItems.STONE_ARROW)
                .input(Items.FEATHER)
                .criterion("has_stone_arrow", conditionsFromItem(ModItems.STONE_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_IRON_ARROW)
                .input(ModItems.IRON_ARROW)
                .input(Items.FEATHER)
                .criterion("has_iron_arrow", conditionsFromItem(ModItems.IRON_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_GOLD_ARROW)
                .input(ModItems.GOLD_ARROW)
                .input(Items.FEATHER)
                .criterion("has_gold_arrow", conditionsFromItem(ModItems.GOLD_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_DIAMOND_ARROW)
                .input(ModItems.DIAMOND_ARROW)
                .input(Items.FEATHER)
                .criterion("has_diamond_arrow", conditionsFromItem(ModItems.DIAMOND_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_NETHERITE_ARROW)
                .input(ModItems.NETHERITE_ARROW)
                .input(Items.FEATHER)
                .criterion("has_netherite_arrow", conditionsFromItem(ModItems.NETHERITE_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_FLINT_ARROW)
                .input(ModItems.FLINT_ARROW)
                .input(Items.FEATHER)
                .criterion("has_flint_arrow", conditionsFromItem(ModItems.FLINT_ARROW))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHTWEIGHT_QUARTZ_ARROW)
                .input(ModItems.QUARTZ_ARROW)
                .input(Items.FEATHER)
                .criterion("has_quartz_arrow", conditionsFromItem(ModItems.QUARTZ_ARROW))
                .offerTo(exporter);
    }
}