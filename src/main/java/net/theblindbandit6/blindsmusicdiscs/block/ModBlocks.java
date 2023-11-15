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
import net.theblindbandit6.blindsmusicdiscs.block.custom.SmallJukebox;

public class ModBlocks {

    //Blocks here
    public static final Block SMALL_OAK_JUKEBOX = registerBlock("small_oak_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_BIRCH_JUKEBOX = registerBlock("small_birch_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_SPRUCE_JUKEBOX = registerBlock("small_spruce_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_JUNGLE_JUKEBOX = registerBlock("small_jungle_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_ACACIA_JUKEBOX = registerBlock("small_acacia_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_DARK_OAK_JUKEBOX = registerBlock("small_dark_oak_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_MANGROVE_JUKEBOX = registerBlock("small_mangrove_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_CHERRY_JUKEBOX = registerBlock("small_cherry_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_CRIMSON_JUKEBOX = registerBlock("small_crimson_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));
    public static final Block SMALL_WARPED_JUKEBOX = registerBlock("small_warped_jukebox",
            new SmallJukebox(FabricBlockSettings.copyOf(Blocks.JUKEBOX)));

    //Register Methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlindsMusicDiscs.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlindsMusicDiscs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BlindsMusicDiscs.LOGGER.info("Registering Mod Blocks for Blind's Music Discs.");
    }
}
