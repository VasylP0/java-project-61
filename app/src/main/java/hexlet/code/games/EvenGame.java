package hexlet.code.games;

import java.util.Scanner;

public class EvenGame {
    public static void play() {
        System.out.println("Welcome to the Even Game!");

        Scanner scanner = new Scanner(System.in);
        String playerName;

        System.out.print("May I have your name? ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        for (int i = 0; i < 3; i++) {
            // Example game logic to check even number
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong "
                        +
                        "answer ;" + "(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
