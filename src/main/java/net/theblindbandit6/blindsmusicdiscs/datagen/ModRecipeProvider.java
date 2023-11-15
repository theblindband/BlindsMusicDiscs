package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //Recipes here
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_OAK_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.OAK_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.OAK_LOG), conditionsFromItem(Blocks.OAK_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_OAK_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_BIRCH_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.BIRCH_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.BIRCH_LOG), conditionsFromItem(Blocks.BIRCH_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_BIRCH_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_SPRUCE_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.SPRUCE_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.SPRUCE_LOG), conditionsFromItem(Blocks.SPRUCE_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_SPRUCE_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_JUNGLE_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.JUNGLE_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.JUNGLE_LOG), conditionsFromItem(Blocks.JUNGLE_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_JUNGLE_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_ACACIA_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.ACACIA_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.ACACIA_LOG), conditionsFromItem(Blocks.ACACIA_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_ACACIA_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_DARK_OAK_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.DARK_OAK_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.DARK_OAK_LOG), conditionsFromItem(Blocks.DARK_OAK_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_DARK_OAK_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_MANGROVE_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.MANGROVE_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.MANGROVE_LOG), conditionsFromItem(Blocks.MANGROVE_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_MANGROVE_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_CHERRY_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.CHERRY_LOG)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.CHERRY_LOG), conditionsFromItem(Blocks.CHERRY_LOG))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_CHERRY_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_CRIMSON_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.CRIMSON_STEM)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.CRIMSON_STEM), conditionsFromItem(Blocks.CRIMSON_STEM))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_CRIMSON_JUKEBOX)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_WARPED_JUKEBOX, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Blocks.WARPED_STEM)
                .input('R', Items.DIAMOND)
                .criterion(hasItem(Blocks.WARPED_STEM), conditionsFromItem(Blocks.WARPED_STEM))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMALL_WARPED_JUKEBOX)));

    }
}
