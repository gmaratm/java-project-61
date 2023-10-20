package hexlet.code;

import java.util.Scanner;
public class Engine {
    private static String userName;

    public static void playGames(String[][] emptyArray, String rule) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName  = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        int numberOfQues = 3;
        for (int i = 0; i < numberOfQues; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Question: " + emptyArray[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner2.next();
            if (answer.equals(emptyArray[i][1])) {
                System.out.println("Correct!");
            } else if (!answer.equals(emptyArray[i][1])) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + emptyArray[i][1] + "'.\n" + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
