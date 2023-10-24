package hexlet.code;

public class Util {
    public static int createRandom(int min, int max) {
        int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
        return randomNumber;
    }
}
