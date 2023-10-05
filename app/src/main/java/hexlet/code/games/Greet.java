package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.App;

public class Greet {
    public static String userName;
    public static void runGreet() {
        System.out.println("");
        Greet obj = new Greet();
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        obj.userName  = sc.next();
        System.out.println("Hello, " + obj.userName + "!");

    }
    public static void main(String[] args) {
        runGreet();
    }
}
