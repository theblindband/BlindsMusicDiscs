package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRequirements;
import net.minecraft.advancement.criterion.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.item.ModItems;
import net.theblindbandit6.blindsmusicdiscs.util.ModTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        RegistryEntryLookup<Item> registryEntryLookup = wrapperLookup.getOrThrow(RegistryKeys.ITEM);

        AdvancementEntry rootAdvancement = Advancement.Builder.create()
                .display(
                        Blocks.JUKEBOX, // The display icon
                        Text.translatable("advancements.musical_world.root.title"), // The title
                        Text.translatable("advancements.musical_world.root.description"), // The description
                        Identifier.of(BlindsMusicDiscs.MOD_ID, "textures/gui/advancements/backgrounds/musical_world.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        false, // Show toast top right
                        false, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criteriaMerger(AdvancementRequirements.CriterionMerger.OR)
                .criterion("jukeboxes", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().tag(registryEntryLookup, ModTags.Items.JUKEBOXES)))
                .criterion("music_discs", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().tag(registryEntryLookup, ModTags.Items.MUSIC_DISCS)))
                .criterion("discs_fragments", InventoryChangedCriterion.Conditions.items(Items.DISC_FRAGMENT_5))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/root");

        AdvancementEntry obtainAllCreeperDiscs = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        Items.CREEPER_HEAD, // The display icon
                        Text.translatable("advancements.musical_world.obtain_all_creeper_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_all_creeper_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_blocks", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_BLOCKS))
                .criterion("obtain_chirp", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CHIRP))
                .criterion("obtain_far", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_FAR))
                .criterion("obtain_mall", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_MALL))
                .criterion("obtain_stal", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_STAL))
                .criterion("obtain_strad", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_STRAD))
                .criterion("obtain_ward", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_WARD))
                .criterion("obtain_11", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_11))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_all_creeper_discs");
        AdvancementEntry obtainAllVanillaDiscs = Advancement.Builder.create().parent(obtainAllCreeperDiscs)
                .display(
                        Items.MUSIC_DISC_MELLOHI, // The display icon
                        Text.translatable("advancements.musical_world.obtain_all_vanilla_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_all_vanilla_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_blocks", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_BLOCKS))
                .criterion("obtain_chirp", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CHIRP))
                .criterion("obtain_far", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_FAR))
                .criterion("obtain_mall", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_MALL))
                .criterion("obtain_mellohi", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_MELLOHI))
                .criterion("obtain_stal", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_STAL))
                .criterion("obtain_strad", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_STRAD))
                .criterion("obtain_ward", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_WARD))
                .criterion("obtain_11", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_11))
                .criterion("obtain_wait", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_WAIT))
                .criterion("obtain_13", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_13))
                .criterion("obtain_cat", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CAT))
                .criterion("obtain_5", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_5))
                .criterion("obtain_otherside", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_OTHERSIDE))
                .criterion("obtain_creator", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR))
                .criterion("obtain_creator_music_box", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR_MUSIC_BOX))
                .criterion("obtain_precipice", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_PRECIPICE))
                .criterion("obtain_relic", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_RELIC))
                .criterion("obtain_pigstep", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_PIGSTEP))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_all_vanilla_discs");
        AdvancementEntry obtainAllModdedDiscs = Advancement.Builder.create().parent(obtainAllVanillaDiscs)
                .display(
                        ModItems.MUSIC_DISC_SWEDEN, // The display icon
                        Text.translatable("advancements.musical_world.obtain_all_mod_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_all_mod_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_chris", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_CHIRS))
                .criterion("obtain_death", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_DEATH))
                .criterion("obtain_dog", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_DOG))
                .criterion("obtain_sweden", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_SWEDEN))
                .criterion("obtain_kyoto", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_KYOTO))
                .criterion("obtain_door", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_DOOR))
                .criterion("obtain_droopy_likes_your_face", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_DROOPY_LIKES_YOUR_FACE))
                .criterion("obtain_flake", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_FLAKE))
                .criterion("obtain_intro", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_INTRO))
                .criterion("obtain_wet_hands", InventoryChangedCriterion.Conditions.items(ModItems.MUSIC_DISC_WET_HANDS))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_all_modded_discs");

        AdvancementEntry obtainCat = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        Items.MUSIC_DISC_CAT, // The display icon
                        Text.translatable("advancements.musical_world.obtain_cat.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_cat.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_cat", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CAT))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_cat");
        AdvancementEntry obtain13 = Advancement.Builder.create().parent(obtainCat)
                .display(
                        Items.MUSIC_DISC_13, // The display icon
                        Text.translatable("advancements.musical_world.obtain_13.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_13.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_13", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_13))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_13");
        AdvancementEntry obtainOGDiscs = Advancement.Builder.create().parent(obtain13)
                .display(
                        Items.CLOCK, // The display icon
                        Text.translatable("advancements.musical_world.obtain_og_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_og_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_cat", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CAT))
                .criterion("obtain_13", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_13))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_og_discs");

        AdvancementEntry obtainDiscFragment5 = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        Items.DISC_FRAGMENT_5, // The display icon
                        Text.translatable("advancements.musical_world.obtain_disc_fragment_5.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_disc_fragment_5.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_disc_fragment_5", InventoryChangedCriterion.Conditions.items(Items.DISC_FRAGMENT_5))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_disc_fragment_5");
        AdvancementEntry obtain5 = Advancement.Builder.create().parent(obtainDiscFragment5)
                .display(
                        Items.MUSIC_DISC_5, // The display icon
                        Text.translatable("advancements.musical_world.obtain_5.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_5.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_5", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_5))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_5");
        AdvancementEntry obtainNumberDiscs = Advancement.Builder.create().parent(obtain5)
                .display(
                        Items.MUSIC_DISC_11, // The display icon
                        Text.translatable("advancements.musical_world.obtain_number_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_number_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_5", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_5))
                .criterion("obtain_13", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_13))
                .criterion("obtain_11", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_11))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_number_discs");


        AdvancementEntry obtainPigstep = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        Items.MUSIC_DISC_PIGSTEP, // The display icon
                        Text.translatable("advancements.musical_world.obtain_pigstep.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_pigstep.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_pigstep", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_PIGSTEP))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_pigstep");

        AdvancementEntry obtainOtherside = Advancement.Builder.create().parent(obtainPigstep)
                .display(
                        Items.MUSIC_DISC_OTHERSIDE, // The display icon
                        Text.translatable("advancements.musical_world.obtain_otherside.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_otherside.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_otherside", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_OTHERSIDE))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_otherside");

        AdvancementEntry obtainRelic = Advancement.Builder.create().parent(obtainOtherside)
                .display(
                        Items.MUSIC_DISC_RELIC, // The display icon
                        Text.translatable("advancements.musical_world.obtain_relic.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_relic.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_relic", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_RELIC))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_relic");

        AdvancementEntry obtainATrialChamberDiscs = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        Items.MUSIC_DISC_CREATOR, // The display icon
                        Text.translatable("advancements.musical_world.obtain_a_trial_chamber_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_a_trial_chamber_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criteriaMerger(AdvancementRequirements.CriterionMerger.OR)
                .criterion("obtain_creator", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR))
                .criterion("obtain_creator_music_box", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR_MUSIC_BOX))
                .criterion("obtain_precipice", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_PRECIPICE))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_a_trial_chamber_discs");
        AdvancementEntry obtainAllTrialChamberDiscs = Advancement.Builder.create().parent(obtainATrialChamberDiscs)
                .display(
                        Items.MUSIC_DISC_PRECIPICE, // The display icon
                        Text.translatable("advancements.musical_world.obtain_all_trial_chamber_discs.title"), // The title
                        Text.translatable("advancements.musical_world.obtain_all_trial_chamber_discs.description"), // The description
                        null, //Only the root needs a background
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // Parent advancement
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("obtain_creator", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR))
                .criterion("obtain_creator_music_box", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_CREATOR_MUSIC_BOX))
                .criterion("obtain_precipice", InventoryChangedCriterion.Conditions.items(Items.MUSIC_DISC_PRECIPICE))
                .build(consumer, BlindsMusicDiscs.MOD_ID + "/obtain_all_trial_chamber_discs");
    }
}