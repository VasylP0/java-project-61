package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    public static void startGame() {
        Random random = new Random();
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = random.nextInt(6) + 5; // Length between 5 and 10
            int start = random.nextInt(10); // Start number
            int step = random.nextInt(5) + 1; // Step between 1 and 5

            // Generate the progression
            String[] progression = new String[length];
            for (int j = 0; j < length; j++) {
                progression[j] = String.valueOf(start + step * j);
            }

            // Randomly select an index to hide
            int hiddenIndex = random.nextInt(length);
            String hiddenNumber = progression[hiddenIndex];
            progression[hiddenIndex] = ".."; // Replace the number with two dots

            // Prepare the question and the correct answer
            String question = String.join(" ", progression);
            String correctAnswer = hiddenNumber;

            // Store the question and answer for this round
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        // Start the game using the Engine
        Engine.playGame(roundsData, DESCRIPTION);
    }
}
