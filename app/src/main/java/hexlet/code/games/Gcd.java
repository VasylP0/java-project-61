package hexlet.code.games;

import hexlet.code.Engine;  // Ensure this is correctly imported
import java.util.Random;

public class Gcd {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGCDGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];  // Data for rounds (questions and answers)
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = random.nextInt(100) + 1;  // Generate random number between 1 and 100
            int num2 = random.nextInt(100) + 1;  // Generate another random number between 1 and 100
            String question = num1 + " " + num2; // The question to be displayed
            String correctAnswer = String.valueOf(findGCD(num1, num2)); // The correct answer (GCD)

            roundsData[i][0] = question;         // Store question
            roundsData[i][1] = correctAnswer;    // Store correct answer
        }

        Engine.playGame(roundsData, DESCRIPTION);
    }

    private static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

