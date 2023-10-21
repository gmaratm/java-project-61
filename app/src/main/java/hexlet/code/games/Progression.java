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
    private static int randomArrayLength = Util.util(MIN_ELEMENT, REC_ELEMENT);

    private static String[] calculateArrayProgress(int x, int y) {
        int[] progressIntArray =  new int[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            progressIntArray[i] = x;
            x = x + y;
        }
        String[] progressStrArray =  new String[randomArrayLength];
        for (int i = 0; i < randomArrayLength; i++) {
            progressStrArray[i] = Integer.toString(progressIntArray[i]);
        }
        return progressStrArray;
    } // Массив прогрессия

    private static String[][] askAnswer() {
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.util(0, RANDOM_NUMBER);
            int y = Util.util(2, ADD_NUMBERS);
            int z = Util.util(0, randomArrayLength - 1);
            String[] arrayString = calculateArrayProgress(x, y);
            String[] arrayStringW = new String[randomArrayLength];
            for (int j = 0; j < randomArrayLength; j++) {
                arrayStringW[j] = arrayString[j];
            }
            arrayStringW[z] = "..";
            String question = Arrays.toString(arrayStringW);
            emptyArray[i][0] =  question.substring(1, question.length() - 1).replaceAll(", ", " ");
            emptyArray[i][1] =  arrayString[z];
        }
        return emptyArray;
    }

    public static void runProgression() {
        Engine.playGames(askAnswer(), rule);
    }

    public static void main(String[] args) {
        runProgression();
    }
}

