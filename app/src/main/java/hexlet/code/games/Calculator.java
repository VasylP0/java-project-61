// Calculator.java
package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final int FACTOR_FOR_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(FACTOR_FOR_NUMBER);
            int secondNumber = random.nextInt(FACTOR_FOR_NUMBER);
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;
            String correctAnswer = String.valueOf(calculate(firstNumber, secondNumber, operator));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.playGame(questionsAndAnswers, RULES);
    }

    private static int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}
