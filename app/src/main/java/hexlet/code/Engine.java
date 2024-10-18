package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;  // For 3 rounds of questions

    public static void playGame(String[][] roundsData, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();

            if (playerAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        +
                        correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
