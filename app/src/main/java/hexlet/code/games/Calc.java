package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static void play() {
        System.out.println("Welcome to the Calculator Game!");

        Scanner scanner = new Scanner(System.in);
        String playerName;

        System.out.print("May I have your name? ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        for (int i = 0; i < 3; i++) {
            // Example game logic for random calculations
            int number1 = (int) (Math.random() * 50);
            int number2 = (int) (Math.random() * 50);
            char operator = getRandomOperator();
            int correctAnswer = calculate(number1, number2, operator);

            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong "
                        +
                        "answer ;" + "(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
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
