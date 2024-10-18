package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;  // Import the Progression game class
import hexlet.code.games.Calc;         // Import the Calc game class
import hexlet.code.games.EvenGame;     // Import the Even game class
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");  // Add the Progression game option
        System.out.println("6 - Prime");  // Add the Prime game option
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> greet();
            case 2 -> EvenGame.startGame();  // Call the Even game
            case 3 -> Calc.startGame();      // Call the Calc game
            case 4 -> Gcd.startGame();       // Call the GCD game
            case 5 -> Progression.startGame(); // Call the Progression game
            case 6 -> Prime.startGame();  // Call the Prime game
            case 0 -> System.out.println("Exit");
            default -> System.out.println("Invalid choice");
        }
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
