package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final Random RANDOM_GENERATOR = new Random(); // Rename the variable here
    private static final int ROUNDS = 3;

    public static void startGame(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < ROUNDS; i++) {
            int number = RANDOM_GENERATOR.nextInt(100); // Use the renamed variable
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.printf("Question: %d%n", number);
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", name);
                return; // Exit the game on wrong answer
            }

            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!%n", name);
    }
}
