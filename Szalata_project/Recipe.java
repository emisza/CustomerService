/*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
* Class to represent a recipe
*/
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String type;
    private List<String> ingredients;
    private List<String> instructions;

    public Recipe(String name, String type, List<String> ingredients, List<String> instructions) {
        this.name = name;
        this.type = type;
        this.ingredients = new ArrayList<>(ingredients);
        this.instructions = new ArrayList<>(instructions);
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients); 
    }

    public List<String> getInstructions() {
        return new ArrayList<>(instructions); 
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = new ArrayList<>(ingredients);
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = new ArrayList<>(instructions); 
    }
    
    //toString() method for displaying recipe details
    @Override
    public String toString() {
        return "Recipe Name: " + name + "\n" +
               "Meal Type: " + type + "\n" +
               "Ingredients: " + String.join(", ", ingredients) + "\n" +
               "Instructions: " + String.join(" -> ", instructions);
    }
    
}