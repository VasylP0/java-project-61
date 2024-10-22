package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomInt(1, 100); // Use Utils for random number

            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no"; // Determine if the number is prime

            roundsData[i][0] = question; // Question: the number
            roundsData[i][1] = correctAnswer; // Correct answer: "yes" or "no"
        }

        Engine.playGame(roundsData, DESCRIPTION);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
