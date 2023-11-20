package net.theblindbandit6.blindsmusicdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BLINDS_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlindsMusicDiscs.MOD_ID, "blindsmusicdiscs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blindsmusicdiscs"))
                    .icon(() -> new ItemStack(ModItems.MUSIC_DISC_DOOR)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SMALL_OAK_JUKEBOX);
                        entries.add(ModBlocks.SMALL_BIRCH_JUKEBOX);
                        entries.add(ModBlocks.SMALL_SPRUCE_JUKEBOX);
                        entries.add(ModBlocks.SMALL_JUNGLE_JUKEBOX);
                        entries.add(ModBlocks.SMALL_ACACIA_JUKEBOX);
                        entries.add(ModBlocks.SMALL_DARK_OAK_JUKEBOX);
                        entries.add(ModBlocks.SMALL_MANGROVE_JUKEBOX);
                        entries.add(ModBlocks.SMALL_CHERRY_JUKEBOX);
                        entries.add(ModBlocks.SMALL_CRIMSON_JUKEBOX);
                        entries.add(ModBlocks.SMALL_WARPED_JUKEBOX);

                        entries.add(ModItems.MUSIC_DISC_DOOR);
                        entries.add(ModItems.MUSIC_DISC_CHIRS);
                        entries.add(ModItems.MUSIC_DISC_DEATH);
                        entries.add(ModItems.MUSIC_DISC_DOG);
                        entries.add(ModItems.MUSIC_DISC_FLAKE);
                        entries.add(ModItems.MUSIC_DISC_DROOPY_LIKES_YOUR_FACE);
                        entries.add(ModItems.MUSIC_DISC_INTRO);
                        entries.add(ModItems.MUSIC_DISC_KYOTO);
                        entries.add(ModItems.MUSIC_DISC_SWEDEN);
                        entries.add(ModItems.MUSIC_DISC_WET_HANDS);

                    }).build());

    public static void registerModItemGroups() {
        //BlindsMusicDiscs.LOGGER.info("Registering Item Groups for Blind's Music Discs.");
    }

}
