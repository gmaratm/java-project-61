package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static String rule = "What is the result of the expression?";

    public static char RS(){
        int min = 0;
        int max = 2;
        int rN = (int)(Math.random() * (max + 1 - min) + min);
        String signs = "+-*";
        char ch = signs.charAt(rN);
        return ch;
    }

    public static int MO(int x, int y, char ch){

        int result = 0;
        switch (ch){
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

    public static String [][] quesAnsw(){
        String[][] emptyArray =  new String [3][2];

        for (int i = 0; i < 3; i++){
            int min2 = 0;
            int max2 = 100;
            int x = (int)(Math.random() * (max2 + 1 - min2) + min2);
            int y = (int)(Math.random() * (max2 + 1 - min2) + min2);
            char ch = RS();
            emptyArray [i][0] = x + " " + ch + " " + y;
            emptyArray [i][1] = MO(x, y, ch) +"";
        }
        return   emptyArray;
    }
    public static void runCalc(){
        quesAnsw();
        Engine.Greet(rule);
        Engine.rounds(quesAnsw());
    }
    public static void main(String[] args) {
        runCalc();
    }
}







