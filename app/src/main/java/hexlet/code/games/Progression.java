package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = Utils.getRandomInt(5, 10); // Use Utils for random length
            int start = Utils.getRandomInt(0, 10); // Use Utils for random start
            int step = Utils.getRandomInt(1, 5); // Use Utils for random step

            String[] progression = new String[length];
            for (int j = 0; j < length; j++) {
                progression[j] = String.valueOf(start + step * j);
            }

            int hiddenIndex = Utils.getRandomInt(0, length - 1); // Use Utils for hidden index
            String hiddenNumber = progression[hiddenIndex];
            progression[hiddenIndex] = ".."; // Replace the number with two dots

            String question = String.join(" ", progression);
            String correctAnswer = hiddenNumber;

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.playGame(roundsData, DESCRIPTION);
    }
}
