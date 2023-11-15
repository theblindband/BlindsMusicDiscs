package net.theblindbandit6.blindsmusicdiscs.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SMALL_JUKEBOXES =
                createTag("small_jukeboxes");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BlindsMusicDiscs.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOD_CREEPER_DROP_MUSIC_DISCS =
                createTag("mod_creeper_drop_music_discs");
        public static final TagKey<Item> MOD_MUSIC_DISCS =
                createTag("mod_music_discs");
        public static final TagKey<Item> SMALL_JUKEBOXES =
                createTag("small_jukeboxes");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BlindsMusicDiscs.MOD_ID, name));
        }
    }
}
