import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0; // Keep track of the number of correct answers
        String answer;

        System.out.println("Welcome to the Cyberbullying Quiz!\n\n"); 

        for (int questionNumber = 1; questionNumber <= 8; questionNumber++) {
            switch (questionNumber) {       // Switch statement to display questions
                case 1:
                    // Question 1
                    System.out.println("1. What is cyberbullying?\n");
                    System.out.println("A: Posting positive messages online");
                    System.out.println("B: Using technology to harm others");
                    System.out.println("C: Avoiding social media");
                    System.out.println("D: Sharing photos responsibly");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("b")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: B\n");
                    }
                    break;

                case 2:
                    // Question 2
                    System.out.println("2. What is the first action to take when being cyberbullied?\n");
                    System.out.println("A: Respond aggressively");
                    System.out.println("B: Block and report the bully");
                    System.out.println("C: Share the messages publicly");
                    System.out.println("D: Ignore it completely");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("b")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: B\n");
                    }
                    break;

                case 3:
                    // Question 3
                    System.out.println("3. Which platform setting can help prevent cyberbullying?\n");
                    System.out.println("A: Public profile");
                    System.out.println("B: Private profile");
                    System.out.println("C: Sharing personal information");
                    System.out.println("D: None of the above");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("b")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: B\n");
                    }
                    break;

                case 4:
                    // Question 4
                    System.out.println("4. Which is NOT a form of cyberbullying?\n");
                    System.out.println("A: Leaking images of someone");
                    System.out.println("B: Sending hateful messages");
                    System.out.println("C: Getting someone a gift");
                    System.out.println("D: Targeting someone in a video game");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("c")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: C\n");
                    }
                    break;

                case 5:
                    // Question 5
                    System.out.println("5. Is cyberbullying intentional or not?\n");
                    System.out.println("A: Yes");
                    System.out.println("B: No");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 6:
                    // Question 6
                    System.out.println("6. Can cyberbullying affect people in the real world?\n");
                    System.out.println("A: Yes");
                    System.out.println("B: No");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 7:
                    // Question 7
                    System.out.println("7. What should a person NOT do about cyberbullying?\n");
                    System.out.println("A: Tell someone");
                    System.out.println("B: Bully back");
                    System.out.println("C: Walk away");
                    System.out.println("D: Block the bully");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("b")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: B\n");
                    }
                    break;

                case 8:
                    // Question 8
                    System.out.println("8. Is cyberbullying intentional most of the time?\n");
                    System.out.println("A: Yes");
                    System.out.println("B: No");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                default:
                    System.out.println("Invalid question number.\n");
                    break;
            }

            System.out.println(); 
        }

        // Display final results
        System.out.println("Quiz finished! You answered " + correctAnswers + " out of 8 questions correctly.");
    }
}
