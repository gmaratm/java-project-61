package hexlet.code.games;

import java.util.Scanner;
public class Even {
    public static void evenOdd() {
        int min = 0;
        int max = 1000;
        int rN = (int) (Math.random() * (max + 1 - min) + min);

        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + rN);
        System.out.print("Your answer: ");
        String t = sc.next();
        if (t.equals("yes") && rN % 2 == 0) {
            System.out.println("Correct!");
        } else if (t.equals("no") && rN % 2 != 0) {
            System.out.println("Correct!");
        } else if (!t.equals("no") && rN % 2 == 1) {
            System.out.println("'" + t + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                    + "Let's try again, " + Greet.userName + "!");
            System.exit(0);
        } else if (!t.equals("yes") && rN % 2 == 0) {
            System.out.println("'" + t + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                    + "Let's try again, " + Greet.userName + "!");
            System.exit(0);
        }
    }

    public static void answer() {
        System.out.println();
        Greet.printGreet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            evenOdd();
        }
        System.out.println("Congratulations, " + Greet.userName + "!");
    }

    public static void main(String[] args) {

        answer();

    }

}
