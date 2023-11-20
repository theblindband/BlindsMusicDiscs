package net.theblindbandit6.blindsmusicdiscs.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;

public class ModSound {

    //Mod sounds for each song added by the music disc
    public static final SoundEvent DOOR = registerSoundEvent("music_disc.music_door");
    public static final SoundEvent DEATH = registerSoundEvent("music_disc.music_death");
    public static final SoundEvent WET_HANDS = registerSoundEvent("music_disc.music_wet_hands");
    public static final SoundEvent CHIRS = registerSoundEvent("music_disc.music_chris");
    public static final SoundEvent SWEDEN = registerSoundEvent("music_disc.music_sweden");
    public static final SoundEvent DOG = registerSoundEvent("music_disc.music_dog");
    public static final SoundEvent DROOPY_LIKES_YOUR_FACE = registerSoundEvent("music_disc.music_droopy_likes_your_face");
    public static final SoundEvent FLAKE = registerSoundEvent("music_disc.music_flake");
    public static final SoundEvent KYOTO = registerSoundEvent("music_disc.music_kyoto");
    public static final SoundEvent INTRO =  registerSoundEvent("music_disc.music_intro");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BlindsMusicDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        //BlindsMusicDiscs.LOGGER.info("Registering Sounds for Blind's Music Discs");
    }
}
