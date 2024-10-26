package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int FACTOR_FOR_NUMBER = 100;

    public static void checkEven() {
        String[][] questionAnswer = new String[Engine.ROUNDS][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(FACTOR_FOR_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";
            questionAnswer[i][0] = String.valueOf(number);
            questionAnswer[i][1] = correctAnswer;
        }
        Engine.playGame(questionAnswer, RULES);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
