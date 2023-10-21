package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static String rule = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_NUMBER = 100;
    private static int findGCD(int x, int y) {
        int[] arrayX = createArrayGCD(x);
        int[] arrayY = createArrayGCD(y);
        int index = 0;
        int[] arrayXY = new int[arrayX.length + arrayY.length];
        for (int j = 0; j < arrayX.length; j++) {
            for (int i = 0; i < arrayY.length; i++) {
                if (arrayX[j] == arrayY[i]) {
                    arrayXY[index] = arrayX[j];
                    arrayY[i] = arrayY[i] * 0;
                    break;
                }
            }
            index++;
        }
        int a =  multiplyArrayElements(createArrayWithoutZeros(arrayXY));
        int  b = (a == 0) ?  1 : a;
        return b;
    } //НОД

    private static int[] createArrayWithoutZeros(int[] array0) {
        int len = 0;
        for (int i = 0; i < array0.length; i++) {
            if (array0[i] != 0) {
                len++;
            }
        }
        int[] array1 = new int[len];
        for (int i = 0, j = 0; i < array0.length; i++) {
            if (array0[i] != 0) {
                array1[j] = array0[i];
                j++;
            }
        }
        return array1;
    } // новый массив без нулей;

    private static int[] createArrayGCD(int val) {
        int[] numArray = new int[val];
        int index = 0;
        for (int j = 0; j <= val * 2; j++) {
            for (int i = 2; i <= val; i++) {
                if (val % i == 0) {
                    numArray[index] = i;
                    val = val / i;
                    break;
                }
            }
            index = index + 1;
        }
        return createArrayWithoutZeros(numArray);
    } // новый массив из простых множителей;

    private static int multiplyArrayElements(int[] arrayME) {
        int composition = 1;
        for (int i = 0; i < arrayME.length; i++) {
            composition = arrayME[i] * composition;
        }
        return composition;
    } // перемножение всех элементов массива;

    private static String[][] askAnswer() {
        String[][] emptyArray =  new String[Engine.NUMBER_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int x = Util.util(0, RANDOM_NUMBER);
            int y = Util.util(0, RANDOM_NUMBER);
            emptyArray[i][0] = x + " " + y;
            if (x == 0 && y != 0) {
                emptyArray[i][1] = y + "";
            } else if (x != 0 && y == 0) {
                emptyArray[i][1] = x + "";
            } else {
                emptyArray[i][1] = findGCD(x, y) + "";
            }
        }
        return emptyArray;
    }

    public static void runGCD() {
        Engine.playGames(askAnswer(), rule);
    }

    public static void main(String[] args) {
        runGCD();
    }
}

