//Ralph
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RiskFactors {
    public static void displayRiskFactors() {
        try {
            File file1 = new File("RiskFactors.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file1);    // Create a Scanner object to read the file
            System.out.println("\n=== Risk Factors ===");
            while (sc.hasNextLine()) {          // Check if there is another line in the file
                System.out.println(sc.nextLine());    // Read and display each line from the file
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the RiskFactors file: " + e.getMessage());     
        }
    }
}

