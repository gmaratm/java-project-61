package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static String rule = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_NUMBER = 100;

    public static void runGCD() {
        Engine.playGames(createGameData(), rule);
    }

    private static int findGCD(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    private static String[][] createGameData() {
        String[][] gameData = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(0, RANDOM_NUMBER);
            int y = Util.createRandom(0, RANDOM_NUMBER);
            gameData[i][0] = x + " " + y;
            gameData[i][1] = Integer.toString(findGCD(x, y));
        }
        return gameData;
    }
}



