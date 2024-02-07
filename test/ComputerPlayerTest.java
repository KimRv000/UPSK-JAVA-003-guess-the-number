import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class ComputerPlayerTest {

    @Test
    public void makeGuess() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 1 && guess <= 100);
    }

    @Test
    public void makeGuessMock(){
        ComputerPlayer computerPlayer = Mockito.mock(ComputerPlayer.class);
        Mockito.when(computerPlayer.makeGuess()).thenReturn(new Random().nextInt(100) + 1);
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 1 && guess <= 100);
    }
}