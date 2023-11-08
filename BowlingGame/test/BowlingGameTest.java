import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    public void testValidRoll() {
        BowlingGame game = new BowlingGame();
        assertTrue(game.isValidRoll(5, 0));
        assertTrue(game.isValidRoll(5, 1));
        assertFalse(game.isValidRoll(11, 0));
        assertFalse(game.isValidRoll(7, 0));
    }

    @Test
    public void testIsStrike() {
        BowlingGame game = new BowlingGame();
        game.roll(10);
        assertTrue(game.isStrike(0));
        game.roll(4);
        assertFalse(game.isStrike(1));
    }

    @Test
    public void testIsSpare() {
        BowlingGame game = new BowlingGame();
        game.roll(6);
        game.roll(4);
        assertTrue(game.isSpare(0));
        game.roll(3);
        assertFalse(game.isSpare(1));
    }

    @Test
    public void testGetScore() {
        BowlingGame game = new BowlingGame();
        game.roll(4);
        game.roll(5);
        assertEquals(9, game.getScore());
        game.roll(10);
        game.roll(7);
        game.roll(2);
        assertEquals(9, game.getScore()); // Score should not be updated until the frame is complete
        game.roll(3);
        game.roll(6);
        assertEquals(37, game.getScore());
    }

    @Test
    public void testIsFinished() {
        BowlingGame game = new BowlingGame();
        assertFalse(game.isFinished());
        for (int i = 0; i < 10; i++) {
            game.roll(3);
            game.roll(5);
            assertFalse(game.isFinished());
        }
        game.roll(10);
        assertTrue(game.isFinished());
    }

    @Test
    public void testCompleteGame() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        assertTrue(game.isFinished());
        assertEquals(300, game.getScore());
    }
}
