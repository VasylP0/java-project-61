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

        // Debugging: Indicate the program has started
        System.out.println("Brain Games application started.");

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        // Check if input is an integer
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            System.out.println("User selected: " + choice);  // Debug: Log user input

            switch (choice) {
                case 1 -> greet();
                case 2 -> EvenGame.startGame();
                case 3 -> Calc.startGame();
                case 4 -> Gcd.startGame();
                case 5 -> Progression.startGame();
                case 6 -> Prime.startGame();
                case 0 -> System.out.println("Exit");
                default -> System.out.println("Invalid choice");
            }
        } else {
            // Handle invalid input scenario
            System.out.println("Invalid input, please enter a valid game number.");
        }

        // Debugging: Indicate the program has finished
        System.out.println("Brain Games application finished.");
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
