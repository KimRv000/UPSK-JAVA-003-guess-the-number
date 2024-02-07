import java.util.Scanner;

public class HumanPlayer extends Player {
    public int makeGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println(name + " choose a number:");

        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number:");
            sc.next();
        }

        return sc.nextInt();
    }
}