import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Introduction {
    public static void displayIntroduction() {
        try {
            File file = new File("Introduction.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file);
            System.out.println("\n=== Introduction ===");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the Introduction file: " + e.getMessage());
        }
    }
}
