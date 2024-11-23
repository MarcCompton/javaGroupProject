import java.util.Scanner;

public class TesterGroup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        while (true) {  // Loop to display the menu until the user chooses to exit
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
                scanner.nextLine();  // Consume the newline character

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
                        Quiz.main(new String[]{});  // Call the Quiz main method
                        break;
                    case 5:
                        Resources.displayResources();  
                        break;
                    case 6:  // Exit the program
                        System.out.println("Thank you for using the Cyberbullying Prevention Program. Stay safe!");
                        scanner.close(); 
                        return;  
                    default: // For any other choice, display an error message
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
