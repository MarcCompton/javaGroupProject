import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0; // Keep track of the number of correct answers
        String answer;

<<<<<<< HEAD
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
=======
        String[] questions = {
                "1. What is cyberbullying?\n" +
                        "   a) Posting positive messages online\n" +
                        "   b) Using technology to harm others\n" +
                        "   c) Avoiding social media\n" +
                        "   d) Sharing photos responsibly",
                "2. What is the first action to take when being cyberbullied?\n" +
                        "   a) Respond aggressively\n" +
                        "   b) Block and report the bully\n" +
                        "   c) Share the messages publicly\n" +
                        "   d) Ignore it completely",
                "3. Which platform setting can help prevent cyberbullying?\n" +
                        "   a) Public profile\n" +
                        "   b) Private profile\n" +
                        "   c) Sharing personal information\n" +
                        "   d) None of the above"
                "4. Which is NOT a form of cyberbullying?\n" +
                        "   a) leaking images of someone\n" +
                        "   b) sending hateful messages\n" +
                        "   c) getting someone a gift\n" +  // Answer
                        "   d) targeting someone in a video game",
                "5. Is cyberbullying intentional or not?\n" +
                        "   a) Yes\n" + // Answer
                        "   b) No,"
                "6. Can Cyberbullying effect people in the real world?\n" +
                        "   a) Yes\n" + // Answer
                        "   b) No,"
                "7. What should a person NOT do about Cyberbullying?\n" +
                        "   a) Tell someone\n" +
                        "   b) Bully back\n" +  // Answer
                        "   c) Walk away\n" +
                        "   d) Block the bully",
                "8. Is cyberbullying intentional most of the time?\n" +
                        "   a) Yes\n" + // Answer
                        "   b) No,"
                "9. What is one effective way to teach about the effects of cyberbullying?\n" +
                        "   a) Ignore it unless it becomes a problem\n" +
                        "   b) Make cyberbullying part of the curriculum\n" +   // Answer
                        "   c) Assume students already know the consequences\n" +
                        "   d) Encourage students to ignore cyberbullying when they see it.",
                "10. Why is it important to avoid sharing personal information online?\n" +
                        "   a) It’s not important\n" +
                        "   b) Sharing personal information helps make more friends\n" +
                        "   c) It helps protect your privacy and prevents others from misusing your information\n" +    // Answer
                        "   d) Schools require students to share personal information on social media",
                "11. What should you do if you witness or know someone being cyberbullied?\n" +
                        "   a) Inform an adult or school administrator\n" + // Answer
                        "   b) Ignore the situation and assume it will stop on its own\n" +
                        "   c) Join in to avoid becoming the next target\n" +
                        "   d) Fight the bully",
                "12. Why is it important to keep records of cyberbullying incidents?\n" +
                        "   a) To share them widely on social media for attention\n" +
                        "   b) To embarrass the bully later\n" +
                        "   c) To prove to friends that you’re being bulliedn" +
                        "   d) To have evidence, such as screenshots, that can help authorities",   // Answer
                "13. How can limiting technology or social media access help with cyberbullying?\n" +
                        "   a) It removes the temptation to see harmful posts or messages\n" +  // Answer
                        "   b) It prevents bullies from targeting you\n" +
                        "   c) It guarantees that no one will ever bully you again\n" +
                        "   d) It makes sure no one knows about bullying",
                "14. When should you seek help from professionals regarding bullying?\n" +
                        "   a) Only when your friends tell you to\n" +
                        "   b) When it starts affecting your mental health or persists\n" + // Answer
                        "   c) After trying to handle the situation\n" +
                        "   d) Never",
                "15. Why is it important to always be kind online?\n" +
                        "   a) Kindness makes you more popular\n" +
                        "   b) It guarantees no one will ever disagree with you\n" +
                        "   c) Being kind online sets a positive example and discourages bullying\n" +  // Answer
                        "   d) It keeps your post from being deleted online",      
        };

        String[] answers = {"b", "b", "b", "d", "a", "a", "b", "a", "b", "c", "a", "d", "a", "b", "c"};
        int score = 0;
>>>>>>> 39baa5bda2c3c69d876a0ae52089f5b99b54abeb

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
