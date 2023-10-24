package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int NUMBER_ROUNDS = 3;
    public static void playGames(String[][] emptyArray, String rule) {
        String userName;
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName  = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Question: " + emptyArray[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner2.next();
            if (answer.equals(emptyArray[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + emptyArray[i][1] + "'.\n" + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
