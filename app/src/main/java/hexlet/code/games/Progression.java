package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
public class Progression {
    public static String rule = "What number is missing in the progression?";
    public static String[] array(int x, int y) {
        int[] progressIntarray =  new int[10];
        for (int i = 0; i < 10; i++) {
            progressIntarray[i] = x;
            x = x + y;
        }
        String[] progressStrArray =  new String[10];
        for (int i = 0; i < 10; i++) {
            progressStrArray[i] = Integer.toString(progressIntarray[i]);
        }
        return progressStrArray;
    } // Массив прогрессия
    public static String[][] quesAnsw() {
        String[][] emptyArray =  new String[3][2];
        for (int i = 0; i < 3; i++) {
            int min1 = 0;
            int max1 = 100;
            int min2 = 2;
            int max2 = 10;
            int min3 = 0;
            int max3 = 9;
            int x = (int) (Math.random() * (max1 + 1 - min2) + min1);
            int y = (int) (Math.random() * (max2 + 1 - min2) + min2);
            int z = (int) (Math.random() * (max3 + 1 - min3) + min3);
            String[] arrayString = array(x, y);
            String[] arrayStringW = new String[10];
            for (int j = 0; j < 10; j++) {
                arrayStringW[j] = arrayString[j];
            }
            arrayStringW[z] = ". .";
            emptyArray[i][0] =  Arrays.toString(arrayStringW).replace('[', ' ').replace(']', ' ');
            emptyArray[i][1] =  arrayString[z];
        }
        return emptyArray;
    }
    public static void runProgression() {
        quesAnsw();
        Engine.greet(rule);
        Engine.rounds(quesAnsw());
    }
    public static void main(String[] args) {
        runProgression();
    }
}

