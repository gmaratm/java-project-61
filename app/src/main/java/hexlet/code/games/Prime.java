package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public final static int RANDOM_NUMBER_MIN = -100;
    public final static int RANDOM_NUMBER_MAX = 100;
    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean calculatePrimeNumber(int x) {
        boolean logicalVar = false;
        if (x <= 1) {
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
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.util(RANDOM_NUMBER_MIN, RANDOM_NUMBER_MAX);
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
