package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int FACTOR_FOR_NUMBER = 100;

    public static void findGreatest() {
        String[][] questionAnswer = new String[Engine.ROUNDS][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(FACTOR_FOR_NUMBER);
            int secondNumber = random.nextInt(FACTOR_FOR_NUMBER);
            String question = firstNumber + " " + secondNumber;
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = String.valueOf(gcdFind(firstNumber, secondNumber));
        }
        Engine.playGame(questionAnswer, RULES);
    }

    private static int gcdFind(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
