package swishhyy.aerocraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import swishhyy.aerocraft.Item.ModItems;

public class AeroCraft implements ModInitializer {
	public static final String MOD_ID = "aerocraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}