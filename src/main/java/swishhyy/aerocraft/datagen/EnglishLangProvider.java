package swishhyy.aerocraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import swishhyy.aerocraft.item.ModItems;

public class EnglishLangProvider extends FabricLanguageProvider {

    public EnglishLangProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            // Registers the arrow heads
            translationBuilder.add(ModItems.WOODEN_ARROW_HEAD, "Wooden Arrow Head");
            translationBuilder.add(ModItems.STONE_ARROW_HEAD, "Stone Arrow Head");
            translationBuilder.add(ModItems.IRON_ARROW_HEAD, "Iron Arrow Head");
            translationBuilder.add(ModItems.GOLD_ARROW_HEAD, "Gold Arrow Head");
            translationBuilder.add(ModItems.DIAMOND_ARROW_HEAD, "Diamond Arrow Head");
            translationBuilder.add(ModItems.NETHERITE_ARROW_HEAD, "Netherite Arrow Head");
            translationBuilder.add(ModItems.FLINT_ARROW_HEAD, "Flint Arrow Head");
            translationBuilder.add(ModItems.QUARTZ_ARROW_HEAD, "Quartz Arrow Head");

            // Registers the normal arrows
            translationBuilder.add(ModItems.WOODEN_ARROW, "Wooden Arrow");
            translationBuilder.add(ModItems.STONE_ARROW, "Stone Arrow");
            translationBuilder.add(ModItems.IRON_ARROW, "Iron Arrow");
            translationBuilder.add(ModItems.GOLD_ARROW, "Gold Arrow");
            translationBuilder.add(ModItems.DIAMOND_ARROW, "Diamond Arrow");
            translationBuilder.add(ModItems.NETHERITE_ARROW, "Netherite Arrow");
            translationBuilder.add(ModItems.FLINT_ARROW, "Flint Arrow");
            translationBuilder.add(ModItems.QUARTZ_ARROW, "Quartz Arrow");

            // Registers the lightweight arrows
            translationBuilder.add(ModItems.LIGHTWEIGHT_WOODEN_ARROW, "Lightweight Wooden Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_STONE_ARROW, "Lightweight Stone Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_IRON_ARROW, "Lightweight Iron Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_GOLD_ARROW, "Lightweight Gold Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_DIAMOND_ARROW, "Lightweight Diamond Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_NETHERITE_ARROW, "Lightweight Netherite Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_FLINT_ARROW, "Lightweight Flint Arrow");
            translationBuilder.add(ModItems.LIGHTWEIGHT_QUARTZ_ARROW, "Lightweight Quartz Arrow");
            
            // Registers the Item Group
            translationBuilder.add("itemGroup.aerocraft", "AeroCraft");


        }
}

