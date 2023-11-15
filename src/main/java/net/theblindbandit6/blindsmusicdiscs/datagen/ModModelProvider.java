package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;
import net.theblindbandit6.blindsmusicdiscs.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Block models here

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //Item models here
        itemModelGenerator.register(ModItems.MUSIC_DISC_DOOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHIRS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DEATH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FLAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DROOPY_LIKES_YOUR_FACE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INTRO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KYOTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SWEDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WET_HANDS, Models.GENERATED);

    }
}
