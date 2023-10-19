package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean calculatePrimeNumber(int x) {
        boolean logicalVar = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                logicalVar = false;
                break;
            } else {
                logicalVar = true;
            }
        }
        return logicalVar;
    }

    private static String[][] askAnswer() {
        String[][] emptyArray =  new String[3][2];
        for (int i = 0; i < 3; i++) {
            int x = Util.util(0, 100);
            emptyArray[i][0] = x  + " ";
            if (calculatePrimeNumber(x)) {
                emptyArray[i][1] = "yes";
            } else {
                emptyArray[i][1] = "no";
            }
        }
        return emptyArray;
    }

    public static void runPrime() {
        Engine.playGames(askAnswer(), rule);
    }

    public static void main(String[] args) {
        runPrime();
    }
}
