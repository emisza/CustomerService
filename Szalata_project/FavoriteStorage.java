/*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
*
* This class represents favorites storage.
*/
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FavoriteStorage {
    private static final String FILE_PATH = "favorites.txt";

    public static void addFavorite(String userName, String recipeName) throws IOException {
        String favoriteInfo = userName + ":" + recipeName + "\n";
        Files.write(Paths.get(FILE_PATH), favoriteInfo.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public static void removeFavorite(String userName, String recipeName) throws IOException {
        List<String> favoritesList = Files.readAllLines(Paths.get(FILE_PATH));
        List<String> updatedFavorites = favoritesList.stream()
                .filter(line -> !line.equals(userName + ":" + recipeName))
                .collect(Collectors.toList());
        Files.write(Paths.get(FILE_PATH), updatedFavorites);
    }

    public static List<String> getUserFavorites(String userName) throws IOException {
        return Files.readAllLines(Paths.get(FILE_PATH)).stream()
                .filter(line -> line.startsWith(userName + ":"))
                .map(line -> line.split(":")[1])
                .collect(Collectors.toList());
    }
}