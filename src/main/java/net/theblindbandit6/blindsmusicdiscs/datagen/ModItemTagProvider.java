package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;
import net.theblindbandit6.blindsmusicdiscs.item.ModItems;
import net.theblindbandit6.blindsmusicdiscs.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //Item Tags here
        //Vanilla
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .addTag(ModTags.Items.MOD_MUSIC_DISCS);
        //Adds drops for creepers
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .addTag(ModTags.Items.MOD_CREEPER_DROP_MUSIC_DISCS);
        //Modded
        //These tags are used in advancements
        getOrCreateTagBuilder(ModTags.Items.JUKEBOXES)
                .add(Blocks.JUKEBOX.asItem())
                .addTag(ModTags.Items.SMALL_JUKEBOXES);
        getOrCreateTagBuilder(ModTags.Items.SMALL_JUKEBOXES)
                .add(ModBlocks.SMALL_OAK_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_BIRCH_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_SPRUCE_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_JUNGLE_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_ACACIA_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_DARK_OAK_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_MANGROVE_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_CHERRY_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_CRIMSON_JUKEBOX.asItem())
                .add(ModBlocks.SMALL_WARPED_JUKEBOX.asItem());
        getOrCreateTagBuilder(ModTags.Items.MOD_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_DOOR)
                .add(ModItems.MUSIC_DISC_CHIRS)
                .add(ModItems.MUSIC_DISC_DEATH)
                .add(ModItems.MUSIC_DISC_FLAKE)
                .add(ModItems.MUSIC_DISC_DROOPY_LIKES_YOUR_FACE)
                .add(ModItems.MUSIC_DISC_INTRO)
                .add(ModItems.MUSIC_DISC_KYOTO)
                .add(ModItems.MUSIC_DISC_SWEDEN)
                .add(ModItems.MUSIC_DISC_WET_HANDS)
                .addTag(ModTags.Items.MOD_CREEPER_DROP_MUSIC_DISCS);
        getOrCreateTagBuilder(ModTags.Items.MOD_CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_DOG);

    }
}

