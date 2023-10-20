package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import java.util.Arrays;

public class Progression {
    private static String rule = "What number is missing in the progression?";
    private static int randomArrayLength = Util.util(5, 10);

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
        String[][] emptyArray =  new String[3][2];
        for (int i = 0; i < 3; i++) {
            int x = Util.util(0, 100);
            int y = Util.util(2, 10);
            int z = Util.util(0, randomArrayLength - 1);
            String[] arrayString = calculateArrayProgress(x, y);
            String[] arrayStringW = new String[randomArrayLength];
            for (int j = 0; j < randomArrayLength; j++) {
                arrayStringW[j] = arrayString[j];
            }
            arrayStringW[z] = "..";
            String question = Arrays.toString(arrayStringW);
            emptyArray[i][0] =  question.substring(1, question.length() - 1).replaceAll(", ", " ");
            emptyArray[i][0] =  Arrays.toString(arrayStringW).replace('[', ' ').replace(']', ' ').replace(',', ' ');
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

