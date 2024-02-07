import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random targetNumber = new Random();
        int min = 1;
        int max = 100;
        int randomNum = targetNumber.nextInt(max - min + 1) + min;
        System.out.println("Random number: " + randomNum);

        System.out.println("Guess the number between 1 and 100");

        HumanPlayer humanPlayer = new HumanPlayer();

        System.out.println("Write your name");
        String name = sc.nextLine();
        humanPlayer.setName(name);
        if (name.isEmpty()) {
            System.out.println("You haven't written your name");
        } else {
            System.out.println("Hello " + name);
        }

        ComputerPlayer computerPlayer = new ComputerPlayer();
        computerPlayer.setName("Computer");

        boolean humanTurn = true;
        Player currentPlayer;

        do {
            int guess;
            if (humanTurn) {
                guess = humanPlayer.makeGuess();
                humanPlayer.addGuess(guess);
            } else {
                guess = computerPlayer.makeGuess();
                computerPlayer.addGuess(guess);
                System.out.println("Computer's guess is : " + guess);
            }

            if (humanTurn) {
                currentPlayer = humanPlayer;
            } else {
                currentPlayer = computerPlayer;
            }

            boolean checkGuessCurrentPlayer = checkGuess(currentPlayer, guess, randomNum);

            if (checkGuessCurrentPlayer) {
                break;
            }

            humanTurn = !humanTurn;

        } while (true);

        System.out.println(currentPlayer.getName() + "'s Guesses:");
        Player.printGuesses(currentPlayer);

        sc.close();
    }
    static boolean checkGuess(Player player, int guess, int targetNumber) {
        if (guess > targetNumber) {
            System.out.println(player.getName() + "'s guess is too high");
        } else if (guess < targetNumber) {
            System.out.println(player.getName() + "'s guess is too low");
        } else {
            System.out.println("Congratulations, " + player.getName() + " !You win!");
            return true;
        }
        return false;
    }
}

