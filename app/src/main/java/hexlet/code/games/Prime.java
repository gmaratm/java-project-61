package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Prime {
    public static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean simpleNum(int x){
        int [] Number = new int [x];
        boolean t = true;
        for (int i = 2; i <= x/2; i++){
            if (x %i == 0){
                t = false;
                break;
            }
            else {
                t = true;
            }
        }
        return t;
    }

    public static String [][] quesAnsw(){
        String[][] emptyArray =  new String [3][2];
        for (int i = 0; i < 3; i++){
            int min2 = 0;
            int max2 = 100;
            int x = (int)(Math.random() * (max2 + 1 - min2) + min2);
            emptyArray [i][0] = x  + " ";
            if (simpleNum(x) == true){
                emptyArray [i][1] = "yes";
            } else {
                emptyArray [i][1] = "no";
            }
        }
        return   emptyArray;
    }

    public static void runPrime() {
        Engine.Greet(rule);
        Engine.rounds(quesAnsw());
}
    public static void main(String[] args) {
        runPrime();
    }
}
