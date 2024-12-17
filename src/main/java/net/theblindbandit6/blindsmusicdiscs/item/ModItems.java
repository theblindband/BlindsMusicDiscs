package net.theblindbandit6.blindsmusicdiscs.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.util.ModJukeboxSongs;

public class ModItems {

    //Music Discs
    public static final Item MUSIC_DISC_DOOR = registerItem("music_disc_door",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.DOOR).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_door")))));
    public static final Item MUSIC_DISC_DEATH = registerItem("music_disc_death",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.DEATH).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_death")))));
    public static final Item MUSIC_DISC_WET_HANDS = registerItem("music_disc_wet_hands",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.WET_HANDS).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_wet_hands")))));
    public static final Item MUSIC_DISC_CHIRS = registerItem("music_disc_chris",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.CHRIS).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_chris")))));
    public static final Item MUSIC_DISC_SWEDEN = registerItem("music_disc_sweden",new Item(new Item.Settings().rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SWEDEN).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_sweden")))));
    public static final Item MUSIC_DISC_DOG = registerItem("music_disc_dog",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.DOG).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_dog")))));
    public static final Item MUSIC_DISC_DROOPY_LIKES_YOUR_FACE = registerItem("music_disc_droopy_likes_your_face",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.DROOPY_LIKES_YOUR_FACE).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_droopy_likes_your_face")))));
    public static final Item MUSIC_DISC_FLAKE = registerItem("music_disc_flake",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.FLAKE).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_flake")))));
    public static final Item MUSIC_DISC_KYOTO = registerItem("music_disc_kyoto",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.KYOTO).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_kyoto")))));
    public static final Item MUSIC_DISC_INTRO = registerItem("music_disc_intro",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.INTRO).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID,"music_disc_intro")))));
    //Register Item Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlindsMusicDiscs.MOD_ID, name), item);
    }
    public static void registerModItems() {
        //BlindsMusicDiscs.LOGGER.info("Registering Mod Items for Blind's Music Discs.");
    }

}
