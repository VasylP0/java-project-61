package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2]; // Prepare for multiple rounds

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomInt(0, 100); // Use Utils for random number
            String question = String.valueOf(number);
            String correctAnswer = Utils.isEven(number) ? "yes" : "no"; // Use Utils for even check

            roundsData[i][0] = question; // Store the question
            roundsData[i][1] = correctAnswer; // Store the correct answer
        }

        Engine.playGame(roundsData, DESCRIPTION); // Play the game using the Engine
    }
}
