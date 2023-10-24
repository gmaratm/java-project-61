package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import java.util.Arrays;

public class Progression {
    private static final int MIN_ELEMENT = 5;
    private static final int REC_ELEMENT = 10;
    private static final int RANDOM_NUMBER = 100;
    private static final int ADD_NUMBERS = 10;
    private static String rule = "What number is missing in the progression?";

    private static String[] calculateArrayProgress(int firstNumber, int stepNumber, int cellsNumber) {
        int[] progressIntArray =  new int[cellsNumber];
        for (int i = 0; i < cellsNumber; i++) {
            progressIntArray[i] = firstNumber;
            firstNumber = firstNumber + stepNumber;
        }
        String[] progressStrArray =  new String[cellsNumber];
        for (int i = 0; i < cellsNumber; i++) {
            progressStrArray[i] = Integer.toString(progressIntArray[i]);
        }
        return progressStrArray;
    } // Массив прогрессия

    private static String[][] createGameData() {
        int cellsNumber = Util.createRandom(MIN_ELEMENT, REC_ELEMENT);
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int firstNumber = Util.createRandom(0, RANDOM_NUMBER);
            int stepNumber = Util.createRandom(2, ADD_NUMBERS);
            int emptyCell = Util.createRandom(0, cellsNumber - 1);
            String[] arrayString = calculateArrayProgress(firstNumber, stepNumber, cellsNumber);
            emptyArray[i][1] =  arrayString[emptyCell];
            arrayString[emptyCell] = "..";
            String question = Arrays.toString(arrayString);
            emptyArray[i][0] =  question.substring(1, question.length() - 1).replaceAll(", ", " ");
        }
        return emptyArray;
    }

    public static void runProgression() {
        Engine.playGames(createGameData(), rule);
    }
}

