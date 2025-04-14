package swishhyy.aerocraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import swishhyy.aerocraft.item.ModItems;

public class AeroCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(EnglishLangProvider::new);
	}

	private static class EnglishLangProvider extends FabricLanguageProvider {
		public EnglishLangProvider(FabricDataOutput dataOutput) {
			super(dataOutput, "en_us");
		}

		@Override
		public void generateTranslations(TranslationBuilder translationBuilder) {
			// Add translations for all arrows
			translationBuilder.add(ModItems.WOODEN_ARROW, "Wooden Arrow");
			translationBuilder.add(ModItems.STONE_ARROW, "Stone Arrow");
			translationBuilder.add(ModItems.IRON_ARROW, "Iron Arrow");
			translationBuilder.add(ModItems.GOLD_ARROW, "Gold Arrow");
			translationBuilder.add(ModItems.DIAMOND_ARROW, "Diamond Arrow");
			translationBuilder.add(ModItems.NETHERITE_ARROW, "Netherite Arrow");
			translationBuilder.add(ModItems.FLINT_ARROW, "Flint Arrow");
			translationBuilder.add(ModItems.QUARTZ_ARROW, "Quartz Arrow");

			// You can add more translations for other items, blocks, or entities here
		}
	}
}