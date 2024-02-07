import org.junit.Test;
import org.mockito.Mockito;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class HumanPlayerTest {

    @Test
    public void makeGuess() {
        String input = "42";
        InputStream in = new StringBufferInputStream(input);
        System.setIn(in);

        HumanPlayer humanPlayer = new HumanPlayer();
        int guess = humanPlayer.makeGuess();
        assertEquals(42, guess);
    }

    @Test
    public void makeGuessMock(){
        HumanPlayer humanPlayer = Mockito.mock(HumanPlayer.class);
        String input = "42";
        InputStream in = new StringBufferInputStream(input);
        System.setIn(in);

        Mockito.when(humanPlayer.makeGuess()).thenReturn(Integer.valueOf(input));
        int guess = humanPlayer.makeGuess();
        assertEquals(42, guess);
    }
}