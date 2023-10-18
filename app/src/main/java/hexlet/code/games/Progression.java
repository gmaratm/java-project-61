package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    public static String rule = "What number is missing in the progression?";

    public static String[] Array(int x, int y){
        int[] progresIntArray =  new int [10];
        for (int i = 0; i < 10; i++){
            progresIntArray[i] = x;
            x = x + y;
        }
        String[] progresStrArray =  new String [10];
        for (int i = 0; i < 10; i++){
            progresStrArray[i] = Integer.toString(progresIntArray[i]);
        }
        return progresStrArray;
    } // Массив прогрессия

    public static String [][] quesAnsw(){
        String[][] emptyArray =  new String [3][2];
        for (int i = 0; i < 3; i++){
            int min1 = 0;
            int max1 = 100;
            int min2 = 2;
            int max2 = 10;
            int min3 = 0;
            int max3 = 9;
            int x = (int)(Math.random() * (max1 + 1 - min2) + min1);
            int y = (int)(Math.random() * (max2 + 1 - min2) + min2);
            int z = (int)(Math.random() * (max3 + 1 - min3) + min3);
            String [] ArrayString = Array(x, y);
            String [] ArrayStringW = new String[10];
            for (int j = 0; j < 10; j++){
                ArrayStringW[j] = ArrayString[j];
            }
            ArrayStringW[z] = ". .";

            emptyArray [i][0] =  Arrays.toString(ArrayStringW).replace('[', ' ').replace(']', ' ');
            emptyArray [i][1] =  ArrayString [z];
        }
        return emptyArray;
    }
    public static void runProgression(){
        quesAnsw();
        Engine.Greet(rule);
        Engine.rounds(quesAnsw());
    }

    public static void main(String[] args) {
        runProgression();
    }
}

