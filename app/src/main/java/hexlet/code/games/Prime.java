package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        Random random = new Random();
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100

            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no"; // Determine if the number is prime

            roundsData[i][0] = question; // Question: the number
            roundsData[i][1] = correctAnswer; // Correct answer: "yes" or "no"
        }

        Engine.playGame(roundsData, DESCRIPTION);
    }

    // Utility method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;  // Numbers less than 2 are not prime
        }
        if (number == 2) {
            return true;   // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false;  // Other even numbers are not prime
        }

        // Check only odd divisors up to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;  // If divisible by any number, it's not prime
            }
        }

        return true;  // If no divisors were found, it's prime
    }
}
