package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.games.Calc;

public class Engine {
    public static String userName;

    public static void Greet() {
        Engine obj = new Engine();
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        obj.userName  = scanner.next();
        System.out.println("Hello, " + obj.userName + "!");
        System.out.println(Calc.rule0);
    }

    public static void rounds(){
        for (int i = 0; i < 3; i++){

            Scanner sc = new Scanner(System.in);
            System.out.println("Question: " + Calc.emptyArray[i][0]);
            System.out.print("Your answer: ");

            int t = sc.nextInt();

            //int tA = Integer.parseInt(Calc.emptyArray[i][1]);

            if (t == Integer.parseInt(Calc.emptyArray[i][1])){
                System.out.println("Correct!");
            }
            else if (t != Integer.parseInt(Calc.emptyArray[i][1])){
                System.out.println("'" + t + "'" + " is wrong answer ;(. Correct answer was " + "'" + Calc.emptyArray [i][1] + "'.\n" +
                        "Let's try again, " + userName + "!");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }


    public static void main(String[] args) {
        Greet();
        //rounds();
    }
}
