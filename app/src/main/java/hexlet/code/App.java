package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Brain Games application started.");

        while (running) {
            // Display the menu
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            String input = scanner.nextLine().trim();  // Read the entire line and trim whitespace

            if (input.isEmpty()) {
                System.out.println("No input provided, please enter a valid game number.");
                continue;
            }

            try {
                int choice = Integer.parseInt(input);  // Parse the input as an integer
                System.out.println("User selected: " + choice);

                switch (choice) {
                    case 1 -> Cli.greetUser();  // Call greetUser without parameters
                    case 2 -> EvenGame.startGame();
                    case 3 -> Calc.startGame();
                    case 4 -> Gcd.startGame();
                    case 5 -> Progression.startGame();
                    case 6 -> Prime.startGame();
                    case 0 -> {
                        running = false;
                        System.out.println("Exiting the program. Goodbye!");
                    }
                    default -> System.out.println("Invalid choice, please try again.");
                }
            } catch (NumberFormatException e) {
                // Handle the case where input is not a valid integer
                System.out.println("Invalid input, please enter a valid game number.");
            }
        }

        System.out.println("Brain Games application finished.");
        scanner.close();
    }
}
