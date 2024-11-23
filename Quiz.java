import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0; // Counter for correct answers
        String answer;
        boolean quit = false;

        System.out.println("Welcome to the Cyberbullying Quiz!\n");
        System.out.println("Type  'quit'  anytime to exit the quiz.\n");

        for (int questionNumber = 1; questionNumber <= 15; questionNumber++) {
            if (quit) break;
            switch (questionNumber) {
                case 1:
                    // Question 1
                    System.out.println("1. What is cyberbullying?\n");
                    System.out.println("A: Posting positive messages online");
                    System.out.println("B: Using technology to harm others");
                    System.out.println("C: Avoiding social media");
                    System.out.println("D: Sharing photos responsibly");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;  
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
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
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 9:
                    // Question 9
                    System.out.println("9. What is one effective way to teach about the effects of cyberbullying?\n");
                    System.out.println("A: Ignore it unless it becomes a problem");
                    System.out.println("B: Make cyberbullying part of the curriculum");
                    System.out.println("C: Assume students already know the consequences");
                    System.out.println("D: Encourage students to ignore cyberbullying when they see it.");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("b")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: B\n");
                    }
                    break;

                case 10:
                    // Question 10
                    System.out.println("10. Why is it important to avoid sharing personal information online?\n");
                    System.out.println("A: It’s not important");
                    System.out.println("B: Sharing personal information helps make more friends");
                    System.out.println("C: It helps protect your privacy and prevents others from misusing your information");
                    System.out.println("D: Schools require students to share personal information on social media");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("c")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: C\n");
                    }
                    break;

                case 11:
                    // Question 11
                    System.out.println("11. What should you do if you witness or know someone being cyberbullied?\n");
                    System.out.println("A: Inform an adult or school administrator");
                    System.out.println("B: Ignore the situation and assume it will stop on its own");
                    System.out.println("C: Join in to avoid becoming the next target");
                    System.out.println("D: Fight the bully");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 12:
                    // Question 12
                    System.out.println("12. Why is it important to keep records of cyberbullying incidents?\n");
                    System.out.println("A: To have proof in case the situation needs to be reported");
                    System.out.println("B: It’s not important");
                    System.out.println("C: To use it against the bully later");
                    System.out.println("D: To share it with the public");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 13:
                    // Question 13
                    System.out.println("13. Can cyberbullying happen through social media?\n");
                    System.out.println("A: Yes");
                    System.out.println("B: No");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 14:
                    // Question 14
                    System.out.println("14. What should parents do to protect their children from cyberbullying?\n");
                    System.out.println("A: Monitor online activities and communicate openly about digital safety");
                    System.out.println("B: Ignore it and hope for the best");
                    System.out.println("C: Let children handle it themselves");
                    System.out.println("D: Teach children to retaliate if they’re bullied");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;

                case 15:
                    // Question 15
                    System.out.println("15. Can cyberbullying happen through video games?\n");
                    System.out.println("A: Yes, through online interactions in multiplayer games");
                    System.out.println("B: No, video games are always positive experiences");
                    System.out.println("C: Only if you share personal information");
                    System.out.println("D: None of the above");
                    System.out.print("\nYour answer: ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("quit")) {
                        quit = true;
                        System.out.println("You have exited the quiz.");
                        break;
                    }
                    if (answer.equals("a")) {
                        correctAnswers++;
                        System.out.println("That is correct!\n");
                    } else {
                        System.out.println("The correct answer is: A\n");
                    }
                    break;
            }
        }

        // Final score
        if (!quit) {
            System.out.println("Quiz complete! You got " + correctAnswers + " out of 15 correct.");
        }
        scanner.close();

        if (!quit) {
            return; 
        }
    }
}
