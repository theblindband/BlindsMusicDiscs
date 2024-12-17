package net.theblindbandit6.blindsmusicdiscs.util;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.sounds.ModSoundEvents;

public interface ModJukeboxSongs {
    RegistryKey<JukeboxSong> DOOR = of("door");
    RegistryKey<JukeboxSong> DEATH = of("death");
    RegistryKey<JukeboxSong> WET_HANDS = of("wet_hands");
    RegistryKey<JukeboxSong> CHRIS = of("chris");
    RegistryKey<JukeboxSong> SWEDEN = of("sweden");
    RegistryKey<JukeboxSong> DOG = of("dog");
    RegistryKey<JukeboxSong> DROOPY_LIKES_YOUR_FACE = of("droopy_likes_your_face");
    RegistryKey<JukeboxSong> FLAKE = of("flake");
    RegistryKey<JukeboxSong> KYOTO = of("kyoto");
    RegistryKey<JukeboxSong> INTRO = of("intro");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(BlindsMusicDiscs.MOD_ID, id));
    }
}
