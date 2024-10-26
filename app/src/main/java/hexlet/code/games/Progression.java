package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_STEP = 5;
    private static final int MAX_START = 20;

    public static void printAp() {
        String[][] questionAnswer = new String[Engine.ROUNDS][2];
        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = random.nextInt(MAX_START);
            int step = random.nextInt(MAX_STEP) + 1;
            int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);
            int hiddenIndex = random.nextInt(length);
            String[] progression = createProgression(start, step, length);
            questionAnswer[i][1] = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            questionAnswer[i][0] = String.join(" ", progression);
        }
        Engine.playGame(questionAnswer, RULES);
    }

    private static String[] createProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
