package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipe.RecipeGenerator.hasItem;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                //Icecutter
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_ACACIA_JUKEBOX)
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.ACACIA_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Blocks.BLUE_ICE), conditionsFromItem(Blocks.BLUE_ICE))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
