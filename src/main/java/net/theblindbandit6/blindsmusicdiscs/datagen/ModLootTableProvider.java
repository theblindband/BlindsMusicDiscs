package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Loot tables here
        addDrop(ModBlocks.SMALL_OAK_JUKEBOX);
        addDrop(ModBlocks.SMALL_BIRCH_JUKEBOX);
        addDrop(ModBlocks.SMALL_SPRUCE_JUKEBOX);
        addDrop(ModBlocks.SMALL_JUNGLE_JUKEBOX);
        addDrop(ModBlocks.SMALL_ACACIA_JUKEBOX);
        addDrop(ModBlocks.SMALL_DARK_OAK_JUKEBOX);
        addDrop(ModBlocks.SMALL_MANGROVE_JUKEBOX);
        addDrop(ModBlocks.SMALL_CHERRY_JUKEBOX);
        addDrop(ModBlocks.SMALL_CRIMSON_JUKEBOX);
        addDrop(ModBlocks.SMALL_WARPED_JUKEBOX);
    }
}
