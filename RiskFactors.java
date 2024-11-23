//Ralph
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RiskFactors {
    public static void displayRiskFactors() {
        try {
            File file1 = new File("RiskFactors.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file1);
            System.out.println("\n=== Risk Factors ===");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the RiskFactors file: " + e.getMessage());
        }
    }
}

