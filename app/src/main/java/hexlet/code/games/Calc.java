package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static String rule = "What is the result of the expression?";

    private static char chooseSymbol() {
        int randomNum = Util.util(0, 2);
        String signs = "+-*";
        char symbol = signs.charAt(randomNum);
        return symbol;
    }

    private static int calculate(int x, int y, char symbol) {
        int result = 0;
        switch (symbol) {
            case '+' -> {
                return  x + y;
            }
            case '-' -> {
                return  x - y;
            }
            case '*' -> {
                return  x * y;
            }
            default -> throw new UnsupportedOperationException("Current operator is not support:" + symbol);
        }
    }

    private static String[][] askAnswer() {
        int numberOfQues = 3;
        String[][] emptyArray =  new String[numberOfQues][2];
        for (int i = 0; i < numberOfQues; i++) {
            int randomNumbers = 100;
            int x = Util.util(0, randomNumbers);
            int y = Util.util(0, randomNumbers);
            char symbol = chooseSymbol();
            emptyArray[i][0] = x + " " + symbol + " " + y;
            emptyArray[i][1] = calculate(x, y, symbol) + "";
        }
        return   emptyArray;
    }

    public static void runCalc() {
        Engine.playGames(askAnswer(), rule);
    }

    public static void main(String[] args) {
        runCalc();
    }
}
