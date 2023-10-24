package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int RANDOM_NUMBER = 100;
    private static String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean calculateEven(int x) {
        boolean logicVar;
        if (x % 2 == 0) {
            logicVar = true;
        } else {
            logicVar = false;
        }
        return logicVar;
    }

    private static String[][] createGameData() {
        String[][] emptyArray = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(0, RANDOM_NUMBER);
            emptyArray[i][0] = x + "";
            if (calculateEven(x)) {
                emptyArray[i][1] = "yes";
            } else {
                emptyArray[i][1] = "no";
            }
        }
        return emptyArray;
    }

    public static void runEven() {
        Engine.playGames(createGameData(), rule);
    }
}



