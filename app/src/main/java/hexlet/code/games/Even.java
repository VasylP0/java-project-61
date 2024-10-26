// Even.java
package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int FACTOR = 100;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(FACTOR);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.playGame(questionsAndAnswers, RULES);
    }
}
