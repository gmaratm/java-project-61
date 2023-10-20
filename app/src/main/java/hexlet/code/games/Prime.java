package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean calculatePrimeNumber(int x) {
        boolean logicalVar = true;
        if (x == 1) {
            logicalVar = false;
        } else {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    logicalVar = false;
                    break;
                } else {
                    logicalVar = true;
                }
            }
        }
        return logicalVar;
    }

    private static String[][] askAnswer() {
        int numberOfQues = 3;
        String[][] emptyArray =  new String[numberOfQues][2];
        for (int i = 0; i < numberOfQues; i++) {
            int randomNumbers = 100;
            int x = Util.util(0, randomNumbers);
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
