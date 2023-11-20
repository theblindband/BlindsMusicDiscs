package net.theblindbandit6.blindsmusicdiscs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.block.custom.SmallJukeboxBlock;

public class ModBlocks {

    //Small Jukeboxes
    public static final Block SMALL_OAK_JUKEBOX = registerBlock("small_oak_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_BIRCH_JUKEBOX = registerBlock("small_birch_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_SPRUCE_JUKEBOX = registerBlock("small_spruce_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_JUNGLE_JUKEBOX = registerBlock("small_jungle_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_ACACIA_JUKEBOX = registerBlock("small_acacia_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_DARK_OAK_JUKEBOX = registerBlock("small_dark_oak_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_MANGROVE_JUKEBOX = registerBlock("small_mangrove_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_CHERRY_JUKEBOX = registerBlock("small_cherry_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_CRIMSON_JUKEBOX = registerBlock("small_crimson_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_WARPED_JUKEBOX = registerBlock("small_warped_jukebox",
            new SmallJukeboxBlock(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));

    //Register Methods
    //Registers blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlindsMusicDiscs.MOD_ID, name), block);
    }
    //Registers block items
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlindsMusicDiscs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    //Initialize method
    public static void registerModBlocks() {
        //BlindsMusicDiscs.LOGGER.info("Registering Mod Blocks for Blind's Music Discs.");
    }
}
