package hexlet.code;

import hexlet.code.games.Gcd;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> greet();
            case 2 -> playEven();
            case 3 -> playCalc();
            case 4 -> Gcd.playGCDGame();  // Call the GCD game
            case 0 -> System.out.println("Exit");
            default -> System.out.println("Invalid choice");
        }
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void playEven() {
        // Even game logic
    }

    public static void playCalc() {
        // Calc game logic
    }
}
