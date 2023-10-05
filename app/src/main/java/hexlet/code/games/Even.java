package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String evenOdd(int x){
        if (x%2 == 0) {
            return "yes";
        }
        return "no";
    }

    public static String [][] quesAnsw() {
        String [][]emptyArray =  new String [3][2];
        for (int i = 0; i < 3; i++){
            int min2 = 0;
            int max2 = 100;
            int x = (int)(Math.random() * (max2 + 1 - min2) + min2);
            emptyArray [i][0] = x + "";
            emptyArray [i][1] = evenOdd(x);
        }
        return emptyArray;
    }
    public static void runEven(){
        quesAnsw();
        Engine.Greet(rule);
        Engine.rounds(quesAnsw());
    }
    public static void main(String[] args) {
        runEven();
    }
}


