package swishhyy.aerocraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import swishhyy.aerocraft.entity.ModEntityTypes;
import swishhyy.aerocraft.item.ModItems;

public class AeroCraft implements ModInitializer {
	public static final String MOD_ID = "aerocraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading " + MOD_ID);

		ModItems.registerItems();
		ModEntityTypes.registerEntities();
		ModItems.registerItemGroup();
	}
}