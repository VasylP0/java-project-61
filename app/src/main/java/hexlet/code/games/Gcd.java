package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = Utils.getRandomInt(1, 100); // Use Utils for random number
            int number2 = Utils.getRandomInt(1, 100); // Use Utils for random number

            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(gcd(number1, number2));

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.playGame(roundsData, DESCRIPTION);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
