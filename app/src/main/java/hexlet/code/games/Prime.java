package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String RULES = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
    private static final int FACTOR_FOR_NUMBER = 100;

    public static void findPrime() {
        String[][] questionAnswer = new String[Engine.ROUNDS][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(FACTOR_FOR_NUMBER);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            questionAnswer[i][0] = String.valueOf(number);
            questionAnswer[i][1] = correctAnswer;
        }
        Engine.playGame(questionAnswer, RULES);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
