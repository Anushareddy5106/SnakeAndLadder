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

    // UC4 and UC5
    public static int play(int playerPos) {

        if (playerPos == 100)
            return playerPos;

        int diceRoll = diceRoll();
        int playOption = playOption();

        System.out.println("diceroll: " + diceRoll + " ");

        switch (playOption) {
            case 0:
                System.out.println("PlayOption: Snake");
                playerPos = (playerPos - diceRoll) < 0 ? 0 : playerPos - diceRoll;
                break;
            case 1:
                System.out.println("PlayOption: Ladder");
                playerPos = (playerPos + diceRoll) > 100 ? playerPos : playerPos + diceRoll;
                // if ladder plays once again
                playerPos = play(playerPos);
                break;

            default:
                System.out.println("PlayOption: No play");
                break;
        }

        return playerPos;
    }

    // UC1
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Snake and Ladder game");

        int player1Pos = 0;
        int player2Pos = 0;

        // UC6
        int numDiceRoll = 1;

        // UC7
        while (player1Pos < 100 && player2Pos < 100) {
            System.out.println("---------- Move " + numDiceRoll + ": ---------  ");

            // player 1 turn
            System.out.println("----PLAYER1----");
            player1Pos = play(player1Pos);
            System.out.println("Position of the Player1: " + player1Pos);

            // player 2 turn
            System.out.println("----PLAYER2----");
            player2Pos = play(player2Pos);
            System.out.println("Position of the Player2: " + player2Pos);

            if (player1Pos == 100) {
                System.out.println("--------------------------");
                System.out.println("** Player1 won the game **");
                System.out.println("--------------------------");
                break;
            } else if (player2Pos == 100) {
                System.out.println("--------------------------");
                System.out.println("** Player2 won the game **");
                System.out.println("--------------------------");
                break;
            }

            numDiceRoll++;
        }

        System.out.println("Number of times the dice was played: " + numDiceRoll);

    }
}
