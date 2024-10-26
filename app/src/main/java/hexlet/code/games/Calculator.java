// Calculator.java
package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int FACTOR = 100;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(FACTOR);
            int secondNumber = random.nextInt(FACTOR);
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;

            String correctAnswer = switch (operator) {
                case "+" -> Integer.toString(firstNumber + secondNumber);
                case "-" -> Integer.toString(firstNumber - secondNumber);
                case "*" -> Integer.toString(firstNumber * secondNumber);
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            };

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.playGame(questionsAndAnswers, RULES);
    }
}
