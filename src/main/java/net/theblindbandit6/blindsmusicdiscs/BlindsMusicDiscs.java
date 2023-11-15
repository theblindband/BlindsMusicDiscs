package net.theblindbandit6.blindsmusicdiscs;

import net.fabricmc.api.ModInitializer;

import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;
import net.theblindbandit6.blindsmusicdiscs.item.ModItemGroups;
import net.theblindbandit6.blindsmusicdiscs.item.ModItems;
import net.theblindbandit6.blindsmusicdiscs.sounds.ModSound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlindsMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "blindsmusicdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Blind's Music Discs");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSound.registerSounds();
	}
}