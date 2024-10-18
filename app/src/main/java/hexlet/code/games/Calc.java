package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void startGame() {
        Random random = new Random();
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(50); // Random number between 0 and 49
            int number2 = random.nextInt(50); // Random number between 0 and 49
            char operator = getRandomOperator(); // Get a random operator
            int correctAnswer = calculate(number1, number2, operator); // Calculate the correct answer

            String question = number1 + " " + operator + " " + number2;
            roundsData[i][0] = question; // Store the question
            roundsData[i][1] = String.valueOf(correctAnswer); // Store the correct answer
        }

        Engine.playGame(roundsData, DESCRIPTION); // Play the game using the Engine
    }

    // Utility methods
    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[(int) (Math.random() * operators.length)];
    }

    private static int calculate(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
    }
}
