package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static String userName;

    public static void Greet(String rule) {
        Engine obj = new Engine();
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        obj.userName  = scanner.next();
        System.out.println("Hello, " + obj.userName + "!");
        System.out.println(rule);
    }

    public static void rounds(String[][] emptyArray){

        for (int i = 0; i < 3; i++){


            Scanner sc = new Scanner(System.in);
            System.out.println("Question: " + emptyArray [i][0]);
            System.out.print("Your answer: ");

            String t = sc.next();

            //int tA = Integer.parseInt(Calc.emptyArray[i][1]);

            if (t.equals(emptyArray [i][1])){
                System.out.println("Correct!");
            }
            else if (!t.equals(emptyArray [i][1])){
                System.out.println("'" + t + "'" + " is wrong answer ;(. Correct answer was " + "'" + emptyArray [i][1] + "'.\n" +
                        "Let's try again, " + userName + "!");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
