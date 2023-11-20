package net.theblindbandit6.blindsmusicdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.sounds.ModSound;

public class ModItems {

    //Music Disc Item Settings
    private static final FabricItemSettings MUSIC_DISC = new FabricItemSettings().maxCount(1).rarity(Rarity.RARE);
    //Music Discs
    public static final Item MUSIC_DISC_DOOR = registerItem("music_disc_door",
            new MusicDiscItem(1, ModSound.DOOR, MUSIC_DISC, 111));
    public static final Item MUSIC_DISC_DEATH = registerItem("music_disc_death",
            new MusicDiscItem(2, ModSound.DEATH, MUSIC_DISC, 41));
    public static final Item MUSIC_DISC_WET_HANDS = registerItem("music_disc_wet_hands",
            new MusicDiscItem(3, ModSound.WET_HANDS, MUSIC_DISC, 90));
    public static final Item MUSIC_DISC_CHIRS = registerItem("music_disc_chris",
            new MusicDiscItem(4, ModSound.CHIRS, MUSIC_DISC, 87));
    public static final Item MUSIC_DISC_SWEDEN = registerItem("music_disc_sweden",
            new MusicDiscItem(5, ModSound.SWEDEN, MUSIC_DISC, 215));
    public static final Item MUSIC_DISC_DOG = registerItem("music_disc_dog",
            new MusicDiscItem(6, ModSound.DOG, MUSIC_DISC, 146));
    public static final Item MUSIC_DISC_DROOPY_LIKES_YOUR_FACE = registerItem("music_disc_droopy_likes_your_face",
            new MusicDiscItem(7, ModSound.DROOPY_LIKES_YOUR_FACE, MUSIC_DISC, 116));
    public static final Item MUSIC_DISC_FLAKE = registerItem("music_disc_flake",
            new MusicDiscItem(8, ModSound.FLAKE, MUSIC_DISC, 170));
    public static final Item MUSIC_DISC_KYOTO = registerItem("music_disc_kyoto",
            new MusicDiscItem(9, ModSound.KYOTO, MUSIC_DISC, 249));
    public static final Item MUSIC_DISC_INTRO = registerItem("music_disc_intro",
            new MusicDiscItem(10, ModSound.INTRO, MUSIC_DISC, 276));
    //Register Item Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BlindsMusicDiscs.MOD_ID, name), item);
    }
    public static void registerModItems() {
        //BlindsMusicDiscs.LOGGER.info("Registering Mod Items for Blind's Music Discs.");
    }

}
