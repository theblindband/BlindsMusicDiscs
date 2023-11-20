package net.theblindbandit6.blindsmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
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
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_OAK_JUKEBOX, Blocks.OAK_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_BIRCH_JUKEBOX, Blocks.BIRCH_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_SPRUCE_JUKEBOX, Blocks.SPRUCE_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_JUNGLE_JUKEBOX, Blocks.JUNGLE_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_ACACIA_JUKEBOX, Blocks.ACACIA_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_DARK_OAK_JUKEBOX, Blocks.DARK_OAK_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_MANGROVE_JUKEBOX, Blocks.MANGROVE_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_CHERRY_JUKEBOX, Blocks.CHERRY_LOG);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_CRIMSON_JUKEBOX, Blocks.CRIMSON_STEM);
        offerSmallJukeboxRecipe(exporter, ModBlocks.SMALL_WARPED_JUKEBOX, Blocks.WARPED_STEM);

    }

    //This is the recipe provider for the small jukeboxes
    public static void offerSmallJukeboxRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ModRecipeProvider.getSmallJukeboxRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder getSmallJukeboxRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 1)
                .input(Character.valueOf('L'), input)
                .input(Character.valueOf('D'), Items.DIAMOND)
                .pattern(" L ")
                .pattern("LDL")
                .pattern(" L ");
    }
}
