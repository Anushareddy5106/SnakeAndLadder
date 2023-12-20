import java.util.Random;

public class App {

    // UC2
    public static int diceRoll() {
        Random random = new Random();
        int number = random.nextInt(6) + 1;

        return number;
    }

    // UC3
    public static int playOption() {
        Random random = new Random();
        int number = random.nextInt(3);

        return number;
    }

    // UC1
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Snake and Ladder game");

        int playerPos = 0;

    }
}
