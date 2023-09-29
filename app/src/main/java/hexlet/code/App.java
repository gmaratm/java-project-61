package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Greet;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        System.out.print("Your choice: ");

        int choice = sc1.nextInt();

        if (choice == 2) {
            Even.answer();
        } else if (choice == 1) {
            Greet.printGreet();
        } else if (choice == 0) {
            System.exit(0);
        }
    }

}
