package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static String rule = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_NUMBER = 100;

    public static int findGCD(int x, int y) {
        int t = 0;
        if (x > y) {
            for (int i = 0; i < x; i++) {
                t = x % y;
                if (t == 0) {
                    t = y;
                } else {
                    x = y;
                    y = t;
                }
            }
        } else {
            for (int i = 0; i < y; i++) {
                t = y % x;
                if (t == 0) {
                    t = x;
                } else {
                    y = x;
                    x = t;
                }
            }
        }
        return t;
    }

    private static String[][] createGameData() {
        String[][] emptyArray = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(0, RANDOM_NUMBER);
            int y = Util.createRandom(0, RANDOM_NUMBER);
            emptyArray[i][0] = x + " " + y;
            if (x == 0 && y != 0) {
                emptyArray[i][1] = y + "";
            } else if (x != 0 && y == 0) {
                emptyArray[i][1] = x + "";
            } else {
                emptyArray[i][1] = findGCD(x, y) + "";
            }
        }
        return emptyArray;
    }

    public static void runGCD() {
        Engine.playGames(createGameData(), rule);
    }
}



