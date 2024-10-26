// App.java
package hexlet.code;

import hexlet.code.games.Even;
// Import other games here (Calc, Gcd, Progression, Prime)
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        chooseGame();
    }

    public static void chooseGame() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "1" -> greet();
            case "2" -> Even.play();
            // Add other cases here for Calc, GCD, etc.
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Please enter a valid game number.");
        }
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
