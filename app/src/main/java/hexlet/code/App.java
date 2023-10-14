package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Greet.runGreet();
                    break;
                case 2:
                    Even.runEven();
                    break;
                case 3:
                    Calc.runCalc();
                    break;
                case 4:
                    GCD.runGCD();
                    break;
                case 5:
                    Progression.runProgression();
                    break;
                case 6:
                    Prime.runPrime();
                    break;
                case 0:
                    System.exit(0);
            }
    }
}
