package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int RANDOM_NUMBER = 100;
    private static String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEven() {
        Engine.playGames(createGameData(), rule);
    }

    private static boolean calculateEven(int x) {
        return x % 2 == 0;
    }

    private static String[][] createGameData() {
        String[][] gameData = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(0, RANDOM_NUMBER);
            gameData[i][0] = Integer.toString(x);
            gameData[i][1] = (calculateEven(x)) ? "yes" : "no";
        }
        return gameData;
    }
}



