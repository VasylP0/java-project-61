package hexlet.code.main;

import java.util.Scanner;

public class Greetings {

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String incomingName = scanner.nextLine();
        System.out.println("Hello, " + incomingName + "!");
    }
}
