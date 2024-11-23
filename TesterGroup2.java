import java.util.Scanner;

public class TesterGroup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Cyberbullying Prevention Program ===");
            System.out.println("1. Introduction");
            System.out.println("2. Risk Factors");
            System.out.println("3. Prevention Techniques");
            System.out.println("4. Quiz");
            System.out.println("5. Resources");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();  // Read the integer choice
                scanner.nextLine();  // Clear the input buffer

                switch (choice) {
                    case 1:
                        Introduction.displayIntroduction();
                        break;
                    case 2:
                        RiskFactors.displayRiskFactors();
                        break;
                    case 3:
                        PreventionTechniques.displayPreventionTechniques();
                        break;
                    case 4:
                        System.out.println("\nStarting the quiz...");
                        Quiz.main(new String[]{}); // Calls the Quiz class's main method
                        break;
                    case 5:
                        Resources.displayResources();
                        break;
                    case 6:
                        System.out.println("Thank you for using the Cyberbullying Prevention Program. Stay safe!");
                        scanner.close(); // Close the scanner when done
                        return;  // Exit the program gracefully
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            } else {
                // If input is not an integer, print a message and clear the buffer
                System.out.println("Invalid input. Please enter a valid option (1-6).");
                scanner.nextLine();  // Clear the invalid input
            }
        }
    }
}
