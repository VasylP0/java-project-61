// App.java
package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            openMenu();
            String choice = scanner.next();

            switch (choice) {
                case "1" -> Greetings.greet();
                case "2" -> Even.play();
                case "3" -> Calculator.play();
                case "4" -> Gcd.play();
                case "5" -> Progression.play();
                case "6" -> Prime.play();
                case "0" -> {
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please enter a valid game number.");
            }

            // If a game or greeting runs, return to menu afterward
            if (!choice.equals("0")) {
                System.out.println(); // For spacing before reopening the menu
            }
        }
    }

    public static void openMenu() {
        System.out.println("Please enter the game number and press Enter:");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
