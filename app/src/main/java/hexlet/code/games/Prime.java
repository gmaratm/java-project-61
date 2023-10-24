package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANDOM_NUMBER_MIN = -1000;
    private static final int RANDOM_NUMBER_MAX = 1000;

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

    private static String[][] createGameData() {
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(RANDOM_NUMBER_MIN, RANDOM_NUMBER_MAX);
            emptyArray[i][0] = x  + " ";
            emptyArray[i][1] = (calculatePrimeNumber(x)) ? "yes" : "no";
        }
        return emptyArray;
    }

    public static void runPrime() {
        Engine.playGames(createGameData(), rule);
    }
}
