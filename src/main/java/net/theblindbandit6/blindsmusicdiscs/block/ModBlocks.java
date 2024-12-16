package net.theblindbandit6.blindsmusicdiscs.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.block.custom.SmallJukeboxBlock;

public class ModBlocks {

    //Small Jukeboxes

    public static final Block SMALL_OAK_JUKEBOX = registerBlock("small_oak_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_oak_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SMALL_BIRCH_JUKEBOX = registerBlock("small_birch_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_birch_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_SPRUCE_JUKEBOX = registerBlock("small_spruce_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_spruce_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_JUNGLE_JUKEBOX = registerBlock("small_jungle_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_jungle_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_ACACIA_JUKEBOX = registerBlock("small_acacia_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_acacia_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_DARK_OAK_JUKEBOX = registerBlock("small_dark_oak_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_dark_oak_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_MANGROVE_JUKEBOX = registerBlock("small_mangrove_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_mangrove_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_CHERRY_JUKEBOX = registerBlock("small_cherry_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_cherry_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_CRIMSON_JUKEBOX = registerBlock("small_crimson_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_crimson_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SMALL_WARPED_JUKEBOX = registerBlock("small_warped_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_warped_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SMALL_PALE_OAK_JUKEBOX = registerBlock("small_pale_oak_jukebox", new SmallJukeboxBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
            Identifier.of(BlindsMusicDiscs.MOD_ID, "small_pale_oak_jukebox"))).mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.WOOD).burnable()));


    //Register Methods
    //Registers blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlindsMusicDiscs.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }
    //Initialize method
    public static void registerModBlocks() {
        //BlindsMusicDiscs.LOGGER.info("Registering Mod Blocks for Blind's Music Discs.");
    }
}
