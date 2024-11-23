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

// public class RiskFactors {
//     public static void displayRiskFactors() {
//         System.out.println("\n=== Risk Factors ===");
//         System.out.println("1. Anonymity: Bullies often hide behind anonymous profiles.");
//         System.out.println("2. Accessibility: Digital platforms allow 24/7 contact, increasing exposure to abuse.");
//         System.out.println("3. Peer Pressure: Teens may feel pressured to conform to harmful online behavior.");
//         System.out.println("4. Emotional Impact: Victims may experience anxiety, depression, or low self-esteem.");
//     }
// }
