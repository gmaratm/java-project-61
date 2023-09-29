package hexlet.code.games;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    public static String rule0 = "rule0 - What is the result?";
    public static String rule1 = "rule1 - Correct!";
    public static String rule2 = "rule2 - try again";
    public static String rule3 = "rule3 - Congratulation!";

    public static char RS(){
        int min = 0;
        int max = 2;
        int rN = (int)(Math.random() * (max + 1 - min) + min);
        String signs = "+-*";
        char ch = signs.charAt(rN);
        return ch;
    }

    public static int MO(int x, int y){
        int result = 0;
        switch (RS()){
            case ('+'):
                result =  x + y;
                break;
            case ('-'):
                result =  x - y;
                break;
            case ('*'):
                result =  x * y;
                break;
        }
        return result;
    }

    public static String [][]emptyArray =  new String [3][2];
    public static void  quesAnsw() {

        for (int i = 0; i < 3; i++){
            int min2 = 0;
            int max2 = 100;
            int x = (int)(Math.random() * (max2 + 1 - min2) + min2);
            int y = (int)(Math.random() * (max2 + 1 - min2) + min2);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            emptyArray [i][0] = x + " " + RS()+ " " + y;
            emptyArray [i][1] = MO(x, y) +"";
        }
        System.out.println("[0][0] = " + emptyArray [0][0]); // это мне для понимания промежуточные результаты
        System.out.println("[0][1] = " + emptyArray [0][1]);
        System.out.println("[1][0] = " + emptyArray [1][0]);
        System.out.println("[1][1] = " + emptyArray [1][1]);
        System.out.println("[2][0] = " + emptyArray [2][0]);
        System.out.println("[2][1] = " + emptyArray [2][1]);
    }

    public static void main(String[] args) {
        quesAnsw();
        Engine.Greet();
        Engine.rounds();

    }

}
