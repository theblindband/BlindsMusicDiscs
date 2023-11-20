package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;
import net.theblindbandit6.blindsmusicdiscs.item.ModItems;
import net.theblindbandit6.blindsmusicdiscs.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //Block Tags here
        //Vanilla
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(ModTags.Blocks.SMALL_JUKEBOXES);
        //Modded
        //Jukeboxes tag is used when music discs check what block they are being used on
        getOrCreateTagBuilder(ModTags.Blocks.JUKEBOXES)
                .add(Blocks.JUKEBOX)
                .addTag(ModTags.Blocks.SMALL_JUKEBOXES);
        getOrCreateTagBuilder(ModTags.Blocks.SMALL_JUKEBOXES)
                .add(ModBlocks.SMALL_OAK_JUKEBOX)
                .add(ModBlocks.SMALL_BIRCH_JUKEBOX)
                .add(ModBlocks.SMALL_SPRUCE_JUKEBOX)
                .add(ModBlocks.SMALL_JUNGLE_JUKEBOX)
                .add(ModBlocks.SMALL_ACACIA_JUKEBOX)
                .add(ModBlocks.SMALL_DARK_OAK_JUKEBOX)
                .add(ModBlocks.SMALL_MANGROVE_JUKEBOX)
                .add(ModBlocks.SMALL_CHERRY_JUKEBOX)
                .add(ModBlocks.SMALL_CRIMSON_JUKEBOX)
                .add(ModBlocks.SMALL_WARPED_JUKEBOX);
    }
}
