import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resources {
    public static void displayResources() {
        try {
            File file = new File("Resources.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file);
            System.out.println("\n=== Resources ===");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the Resources file: " + e.getMessage());
        }
    }
}
