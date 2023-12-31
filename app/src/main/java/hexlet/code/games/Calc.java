package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final int RANDOM_NUMBER = 100;
    private static String rule = "What is the result of the expression?";

    private static char chooseSymbol() {
        int randomNum = Util.createRandom(0, 2);
        String signs = "+-*";
        char symbol = signs.charAt(randomNum);
        return symbol;
    }

    public static void runCalc() {
        Engine.playGames(createGameData(), rule);
    }

    private static int calculate(int x, int y, char symbol) {
        int result = 0;
        switch (symbol) {
            case '+' -> {
                return x + y;
            }
            case '-' -> {
                return x - y;
            }
            case '*' -> {
                return x * y;
            }
            default -> throw new UnsupportedOperationException("Current operator is not support:" + symbol);
        }
    }

    private static String[][] createGameData() {
        String[][] gameData = new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.createRandom(0, RANDOM_NUMBER);
            int y = Util.createRandom(0, RANDOM_NUMBER);
            char symbol = chooseSymbol();
            gameData[i][0] = x + " " + symbol + " " + y;
            gameData[i][1] = Integer.toString(calculate(x, y, symbol));
        }
        return gameData;
    }
}

