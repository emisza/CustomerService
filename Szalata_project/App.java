/*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
*
* This is the main class.
*/
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //Print the application's purpose
        System.out.println("\nEmilia Delight - Find, save, and manage your cooking recipes.\n");

        //Create a few recipe instances
        Recipe pancakeRecipe = new Recipe(
                "Classic Pancakes",
                "Breakfast",
                Arrays.asList("Flour", "Eggs", "Milk", "Butter"),
                Arrays.asList("Mix ingredients", "Pour batter on skillet", "Cook until golden")
        );

        Recipe omeletteRecipe = new Recipe(
                "Cheese Omelette",
                "Breakfast",
                Arrays.asList("Eggs", "Cheese", "Butter", "Salt", "Pepper"),
                Arrays.asList("Beat eggs", "Pour into skillet", "Add cheese", "Fold and serve")
        );

        //Create a user instance
        User user = new User("ChefEmilia");

        //Add recipes to user's favorites
        user.addFavorite(pancakeRecipe);
        user.addFavorite(omeletteRecipe);

        //Print user's favorite recipes
        System.out.println(user.getUserName() + "'s Favorite Recipes:");
        for (Recipe favorite : user.getFavorites()) {
            System.out.println(favorite.toString());
            System.out.println(); // Add an empty line 
        }
    }
}