package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int FACTOR_FOR_NUMBER = 100;

    public static void calculateExpression() {
        String[][] questionAnswer = new String[Engine.ROUNDS][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(FACTOR_FOR_NUMBER);
            int secondNumber = random.nextInt(FACTOR_FOR_NUMBER);
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = String.valueOf(calculate(firstNumber, secondNumber, operator));
        }
        Engine.playGame(questionAnswer, RULES);
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
