/*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
*
* This class represents a user.
*/
import java.util.List;
import java.util.ArrayList;
public class User {
    private String userName;
    private List<Recipe> favorites;

    public User(String userName) {
        this.userName = userName;
        this.favorites = new ArrayList<>();
    }

    public void addFavorite(Recipe recipe) {
        favorites.add(recipe);
    }

    public void removeFavorite(Recipe recipe) {
        favorites.remove(recipe);
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public List<Recipe> getFavorites() {
        return new ArrayList<>(favorites); 
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

}