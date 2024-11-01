package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    /**
     * Runs the game engine with the specified rules and question-answer generator.
     *
     * @param gameName      The name of the game.
     * @param rules         The rules of the game to display at the start.
     * @param questionAndAnswerGenerator A lambda function or method reference that returns a
     *                                   question-answer pair in a String array (index 0 is question, 1 is answer).
     */
    public static void runGame(String gameName, String rules,
                               QuestionAnswerGenerator questionAndAnswerGenerator) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (int i = 0; i < ROUNDS; i++) {
            String[] questionAndAnswer = questionAndAnswerGenerator.generate();
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    /**
     * A convenient method to run any game with predefined questions and rules.
     *
     * @param questionAnswer A 2D array containing questions and their respective answers.
     * @param rules          The rules for the specific game.
     */
    public static void playGame(String[][] questionAnswer, String rules) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] qa : questionAnswer) {
            String question = qa[0];
            String correctAnswer = qa[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    @FunctionalInterface
    public interface QuestionAnswerGenerator {
        String[] generate();
    }
}
