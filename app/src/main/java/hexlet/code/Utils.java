package hexlet.code;

import java.util.Random;

public class Utils {

    // Static Random instance to avoid creating multiple Random objects
    private static final Random RANDOM = new Random();

    // Method to generate a random number within a specified range
    public static int getRandomInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
