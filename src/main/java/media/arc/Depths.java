package media.arc;

import media.arc.world.biome.DepthsBiomes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Depths implements ModInitializer {
	public static final String MOD_ID = "depths";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DepthsBiomes.registerBiomes();

		LOGGER.info("Dredge the depths.");
	}
}