package hexlet.code;

import hexlet.code.main.Greetings;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        openMenu();
    }

    public static void openMenu() {
        System.out.println("""
                Please enter the game number and press Enter:
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
        String incomingText = scanner.next();
        switch (incomingText) {
            case "1" -> Greetings.greet();
            case "2" -> Even.checkEven();
            case "3" -> Calculator.calculateExpression();
            case "4" -> Gcd.findGreatest();
            case "5" -> Progression.printAp();
            case "6" -> Prime.findPrime();
            case "0" -> System.out.println("Exiting the application. Goodbye!");
            default -> System.out.println("Invalid choice. Please enter a valid game number.");
        }
    }
}
