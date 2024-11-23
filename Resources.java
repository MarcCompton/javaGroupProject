import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resources {
    public static void displayResources() {
        try {
            File file = new File("Resources.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file); // Create a Scanner object to read the file
            System.out.println("\n=== Resources ===");
            while (sc.hasNextLine()) {      // Check if there is another line in the file
                System.out.println(sc.nextLine());  // Read and display each line from the file
            } 
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the Resources file: " + e.getMessage());
        }
    }
}
