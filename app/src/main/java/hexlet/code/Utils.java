package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random RANDOM = new Random();

    /**
     * Generates a random integer within the specified range [min, max].
     *
     * @param min The minimum value (inclusive).
     * @param max The maximum value (inclusive).
     * @return A random integer between min and max.
     */
    public static int getRandomInt(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}
