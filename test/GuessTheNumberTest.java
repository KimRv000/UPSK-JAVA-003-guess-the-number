import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GuessTheNumberTest {

    @Test
    public void checkGuessTest() {

        Player player = mock(Player.class);
        when(player.getName()).thenReturn("Aika");
        int guess = 50;
        int targetNumber = 50;

        boolean result = GuessTheNumber.checkGuess(player, guess, targetNumber);

        assertTrue(result);

    }

}