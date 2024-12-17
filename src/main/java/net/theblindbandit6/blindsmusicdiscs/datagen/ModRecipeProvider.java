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
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_OAK_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.OAK_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_BIRCH_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.BIRCH_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_SPRUCE_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.SPRUCE_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_JUNGLE_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.JUNGLE_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_ACACIA_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.ACACIA_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_DARK_OAK_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.DARK_OAK_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_MANGROVE_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.MANGROVE_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_CHERRY_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.CHERRY_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_PALE_OAK_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.PALE_OAK_LOG)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_CRIMSON_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.CRIMSON_HYPHAE)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_WARPED_JUKEBOX).group("small_jukeboxes")
                        .pattern(" R ")
                        .pattern("RSR")
                        .pattern(" R ")
                        .input('R', Blocks.WARPED_HYPHAE)
                        .input('S', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
