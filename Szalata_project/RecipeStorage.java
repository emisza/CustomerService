/*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
*
* This class represents recipe storage.
*/
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RecipeStorage {
    private static final String FILE_PATH = "recipes.txt";

    public static void saveRecipe(Recipe recipe) throws IOException {
        String recipeInfo = recipe.getName() + ":" + recipe.getType() + "\n";
        Files.write(Paths.get(FILE_PATH), recipeInfo.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public static List<String> loadAllRecipes() throws IOException {
        return Files.readAllLines(Paths.get(FILE_PATH));
    }
}