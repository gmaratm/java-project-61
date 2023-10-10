package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static String rule = "Find the greatest common divisor of given numbers.";

    public static int nod(int x, int y){
        int [] ArrayX = div (x);
        int [] ArrayY = div (y);
        int index = 0;
        int [] ArrayXY = new int[ArrayX.length + ArrayY.length];
        for(int j=0; j < ArrayX.length; j++){
            for(int i=0; i < ArrayY.length; i++)
                if (ArrayX[j] == ArrayY[i]){
                    ArrayXY [index] = ArrayX[j];
                    ArrayY [i] = ArrayY[i] * 0;
                    //ArrayY[i] = 0;
                    break;
                }
            index++;
        }
        int a = MT(Array1(ArrayXY));
        int  b = (a==0) ?  1 : a;
        return b;
    } //НОД

    public static int[] Array1 (int[] Array0){
        int len = 0;
        for (int i=0; i<Array0.length; i++){
            if (Array0[i] != 0)
                len++;
        }
        int [] Array1 = new int[len];
        for (int i=0, j=0; i<Array0.length; i++){
            if (Array0[i] != 0) {
                Array1[j] = Array0[i];
                j++;
            }
        }
        return Array1;
    } // новый массив без нулей;

    public static int[] div (int val){
        int []numArray = new int[val];
        int index = 0;
        for(int j=0; j <= val*2; j++){
            for(int i=2; i <= val; i++){
                if(val % i == 0){
                    numArray [index] = i;
                    val = val/i;
                    break;
                }
            }
            index = index + 1;
        }
        return Array1(numArray);
    } // новый массив из простых множителей;

    public static int MT (int[] ArrayME){
        int mt = 1;
        for (int i = 0; i < ArrayME.length; i++){
            mt = ArrayME[i] * mt;
        }
        return mt;
    } // перемножение всех элементов массива;

    public static String [][] quesAnsw(){
        String[][] emptyArray =  new String [3][2];

        for (int i = 0; i < 3; i++){
            int min2 = 0;
            int max2 = 100;
            int x = (int)(Math.random() * (max2 + 1 - min2) + min2);
            int y = (int)(Math.random() * (max2 + 1 - min2) + min2);
            emptyArray[i][0] = x + " " + y;
            if (x == 0 && y != 0) {
                emptyArray[i][1] = y + "";
            }
            else if (x != 0 && y == 0) {
                emptyArray[i][1] = x + "";
            }
            else {
                emptyArray[i][1] = nod(x, y) + "";
            }
        }
        return   emptyArray;
    }

    public static void runGCD(){
        quesAnsw();
        Engine.Greet(rule);
        Engine.rounds(quesAnsw());
    }

    public static void main(String[] args) {
        runGCD();

    }
}

