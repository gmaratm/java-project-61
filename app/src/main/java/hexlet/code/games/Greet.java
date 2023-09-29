package hexlet.code.games;
import java.util.Scanner;

public class Greet {
    public static String userName;


    public static void printGreet() {
        System.out.println("");
        Greet obj = new Greet();
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        obj.userName  = scanner.next();

        System.out.println("Hello, " + obj.userName + "!");

    }
    public static void main(String[] args) {
        printGreet();
        System.out.println(userName);
    }
}
