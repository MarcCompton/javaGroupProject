import java.util.Scanner;

public class Quiz {
    public static void startQuiz(Scanner scanner) {
        System.out.println("\n=== Cyberbullying Quiz ===");

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
        };

        String[] answers = {"b", "b", "b"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("You got " + score + "/" + questions.length + " questions correct.");
    }
}
