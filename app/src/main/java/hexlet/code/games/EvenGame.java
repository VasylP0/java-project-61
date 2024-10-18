package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        Random random = new Random();
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(100); // Random number between 0 and 99
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no"; // Determine if the number is even

            roundsData[i][0] = question; // Store the question
            roundsData[i][1] = correctAnswer; // Store the correct answer
        }

        Engine.playGame(roundsData, DESCRIPTION); // Play the game using the Engine
    }
}
