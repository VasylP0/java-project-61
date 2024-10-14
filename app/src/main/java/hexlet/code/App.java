package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

public class App {
    public static void main(String[] args) {
        // Display the menu
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // Process the user's choice
        switch (choice) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                break;
            case "2":
                EvenGame.play();
                break;
            case "3":
                Calc.play();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        // Close the scanner (optional, for better resource management)
        scanner.close();
    }
}
