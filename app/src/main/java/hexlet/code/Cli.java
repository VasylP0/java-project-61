package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");

        // In all cases (testing or not), we'll handle the name input to avoid CI issues
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        if (name.isBlank()) {
            name = "Test User";  // Default name for CI environments or empty input
        }
        System.out.println("Hello, " + name + "!");
    }
}
