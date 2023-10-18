package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    public static String rule = "Find the greatest common divisor of given numbers.";
    public static int nod(int x, int y) {
        int[] arrayX = div(x);
        int[] arrayY = div(y);
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
        int a = mt(array1(arrayXY));
        int  b = (a == 0) ?  1 : a;
        return b;
    } //НОД

    public static int[] array1(int[] array0) {
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

    public static int[] div(int val) {
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
        return array1(numArray);
    } // новый массив из простых множителей;

    public static int mt(int[] arrayME) {
        int mt = 1;
        for (int i = 0; i < arrayME.length; i++) {
            mt = arrayME[i] * mt;
        }
        return mt;
    } // перемножение всех элементов массива;

    public static String[][] quesAnsw() {
        String[][] emptyArray =  new String[3][2];

        for (int i = 0; i < 3; i++) {
            int min2 = 0;
            int max2 = 100;
            int x = (int) (Math.random() * (max2 + 1 - min2) + min2);
            int y = (int) (Math.random() * (max2 + 1 - min2) + min2);
            emptyArray[i][0] = x + " " + y;
            if (x == 0 && y != 0) {
                emptyArray[i][1] = y + "";
            } else if (x != 0 && y == 0) {
                emptyArray[i][1] = x + "";
            } else {
                emptyArray[i][1] = nod(x, y) + "";
            }
        }
        return emptyArray;
    }

    public static void runGCD() {
        quesAnsw();
        Engine.greet(rule);
        Engine.rounds(quesAnsw());
    }

    public static void main(String[] args) {
        runGCD();
    }
}

