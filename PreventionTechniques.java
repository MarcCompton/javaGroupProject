import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PreventionTechniques {

    public static void displayPreventionTechniques() {
        // Ensure that the file "PreventionTechniques.txt" exists in the directory
        File file1 = new File("PreventionTechniques.txt");

        try {
            Scanner sc = new Scanner(file1);
            System.out.println("\n=== Prevention Techniques ===");

            // Read and display each line from the file
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            // Close the scanner
            sc.close();

        } catch (FileNotFoundException e) {
            // Improved error message
            System.out.println("Error: The file 'PreventionTechniques.txt' was not found.");
            System.out.println("Details: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        displayPreventionTechniques();  // Call the method to display prevention techniques
    }
}
