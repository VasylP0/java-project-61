package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser(boolean isTestMode) {
        System.out.println("Welcome to the Brain Games!");

        if (isTestMode) {
            System.out.println("Hello, Test User!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("May I have your name? ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
            // Do not close the scanner here, as it will be reused by App.java
        }
    }
}
