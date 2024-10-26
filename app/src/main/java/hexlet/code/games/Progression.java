// Progression.java
package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int FACTOR = 100;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = random.nextInt(FACTOR);
            int step = random.nextInt(10) + 1;
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            String[] progression = new String[PROGRESSION_LENGTH];
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                progression[j] = Integer.toString(start + j * step);
            }

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progression);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.playGame(questionsAndAnswers, RULES);
    }
}
