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

        // UC4 and UC5
        while (playerPos < 100) {
            int diceRoll = diceRoll();
            int playOption = playOption();

            switch (playOption) {
                case 0:
                    System.out.println("Snake");
                    playerPos = (playerPos - diceRoll) < 0 ? 0 : playerPos - diceRoll;
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerPos = (playerPos + diceRoll) > 100 ? playerPos : playerPos + diceRoll;
                    break;

                default:
                    System.out.println("No play");
                    break;
            }

            System.out.println("Position of the Player:" + playerPos);

            if (playerPos == 100)
                break;
        }

    }
}
