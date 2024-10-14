package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    greet(name);
                    break;
                case "2":
                    EvenGame.startGame(name); // Call the method to start the Even game
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return; // Exit the application
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
