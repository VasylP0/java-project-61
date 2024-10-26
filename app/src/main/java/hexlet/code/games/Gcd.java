// Gcd.java
package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int FACTOR = 100;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(FACTOR) + 1;
            int secondNumber = random.nextInt(FACTOR) + 1;
            String question = firstNumber + " " + secondNumber;
            String correctAnswer = Integer.toString(findGcd(firstNumber, secondNumber));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.playGame(questionsAndAnswers, RULES);
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
