package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
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
