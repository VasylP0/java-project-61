package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = Utils.getRandomInt(0, 50); // Use Utils for random number
            int number2 = Utils.getRandomInt(0, 50); // Use Utils for random number
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
        return operators[Utils.getRandomInt(0, operators.length - 1)]; // Use Utils for random operator
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
