package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int RANDOM_NUMBER = 100;
    private static String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String calculateEven(int x) {
        if (x % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    private static String[][] askAnswer() {
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.util(0, RANDOM_NUMBER);
            emptyArray[i][0] = x + "";
            emptyArray[i][1] = calculateEven(x);
        }
        return emptyArray;
    }

    public static void runEven() {
        Engine.playGames(askAnswer(), rule);
    }

    public static void main(String[] args) {
        runEven();
    }
}


