 /*******************************************************************
* Name: Emilia Szalata
* Date: 04/25/2024
* Assignment: SDC330 Week 3 Project
*
* This class represents the user storage
*/
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UserStorage {
    private static final String FILE_PATH = "users.txt";

    public static void saveUser(User user) throws IOException {
        String userInfo = user.getUserName() + "\n";
        Files.write(Paths.get(FILE_PATH), userInfo.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public static List<String> loadAllUserNames() throws IOException {
        return Files.readAllLines(Paths.get(FILE_PATH));
    }
}