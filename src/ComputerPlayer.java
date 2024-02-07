import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;
    private int min;
    private int max;
    public ComputerPlayer() {
        this.min = 1;
        this.max = 100;
        this.random = new Random();
    }
    public void setRandom(Random random) {
        this.random = random;
    }
    public int makeGuess() {
        return random.nextInt(max - min + 1) + min;
    }
}