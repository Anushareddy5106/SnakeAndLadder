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

        // UC6
        int numDiceRoll = 0;

        // UC4 and UC5
        while (playerPos < 100) {
            int diceRoll = diceRoll();
            int playOption = playOption();

            System.out.println("----->Move " + numDiceRoll + ":  ");
            System.out.println("diceroll: " + diceRoll + " ");

            switch (playOption) {
                case 0:
                    System.out.println("PlayOption: Snake");
                    playerPos = (playerPos - diceRoll) < 0 ? 0 : playerPos - diceRoll;
                    break;
                case 1:
                    System.out.println("PlayOption: Ladder");
                    playerPos = (playerPos + diceRoll) > 100 ? playerPos : playerPos + diceRoll;
                    break;

                default:
                    System.out.println("PlayOption: No play");
                    break;
            }

            System.out.println("Position of the Player:" + playerPos);
            numDiceRoll++;

            if (playerPos == 100)
                break;
        }

        System.out.println("Number of times the dice was played: " + numDiceRoll);

    }
}
