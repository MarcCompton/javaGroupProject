//Ralph

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class RiskFactors{
//     public static void main(String[] args) {
//         try {
//             File file1 = new File("RiskFactors.txt");
//             Scanner sc = new Scanner(file1);
//             while(sc.hasNextLine()){
//                     System.out.println(sc.nextLine());
//             }
        
//         } catch (FileNotFoundException e) {
//             System.out.println("An error occured while reading: " + e);
//         }
//     }

// }
public class RiskFactors {
    public static void displayRiskFactors() {
        System.out.println("\n=== Risk Factors ===");
        System.out.println("1. Anonymity: Bullies often hide behind anonymous profiles.");
        System.out.println("2. Accessibility: Digital platforms allow 24/7 contact, increasing exposure to abuse.");
        System.out.println("3. Peer Pressure: Teens may feel pressured to conform to harmful online behavior.");
        System.out.println("4. Emotional Impact: Victims may experience anxiety, depression, or low self-esteem.");
    }
}
