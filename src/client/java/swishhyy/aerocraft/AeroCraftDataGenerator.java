package swishhyy.aerocraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import swishhyy.aerocraft.datagen.EnglishLangProvider;
import swishhyy.aerocraft.datagen.ModRecipeProvider;

public class AeroCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(EnglishLangProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}