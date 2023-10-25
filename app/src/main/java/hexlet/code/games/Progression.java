package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int MIN_ELEMENT = 5;
    private static final int REC_ELEMENT = 10;
    private static final int RANDOM_NUMBER = 100;
    private static final int ADD_NUMBERS = 10;
    private static String rule = "What number is missing in the progression?";

    public static void runProgression() {
        Engine.playGames(createGameData(), rule);
    }

    private static String[] calculateArrayProgress(int firstNumber, int stepNumber, int cellsNumber) {
        String[] progressStrArray =  new String[cellsNumber];
        for (int i = 0; i < cellsNumber; i++) {
            progressStrArray[i] = Integer.toString(firstNumber + stepNumber * i);
        }
        return progressStrArray;
    } // Массив прогрессия

    private static String[][] createGameData() {
        int cellsNumber = Util.createRandom(MIN_ELEMENT, REC_ELEMENT);
        String[][] gameData =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int firstNumber = Util.createRandom(0, RANDOM_NUMBER);
            int stepNumber = Util.createRandom(2, ADD_NUMBERS);
            int emptyCell = Util.createRandom(0, cellsNumber - 1);
            String[] arrayString = calculateArrayProgress(firstNumber, stepNumber, cellsNumber);
            String answer = arrayString[emptyCell];
            arrayString[emptyCell] = "..";
            gameData[i][0] =  String.join(" ", arrayString);
            gameData[i][1] = answer;
        }
        return gameData;
    }
}

