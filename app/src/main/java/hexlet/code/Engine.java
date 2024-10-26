package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void playGame(String[][] questionAnswer, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionAnswer[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(questionAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                        answer, questionAnswer[i][1], name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
