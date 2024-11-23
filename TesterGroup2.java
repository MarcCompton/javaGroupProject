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

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1 -> Introduction.displayIntroduction();
                case 2 -> RiskFactors.displayRiskFactors(); // Call the updated method
                case 3 -> PreventionTechniques.displayPreventionTechniques();
                case 4 -> Quiz.startQuiz(scanner);
                case 5 -> Resources.displayResources();
                case 6 -> {
                    System.out.println("Thank you for using the Cyberbullying Prevention Program. Stay safe!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
