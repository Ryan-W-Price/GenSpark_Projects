import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GuesstheNumberTest {
GuesstheNumber game;

    @BeforeEach
    void setUp() {
        game = new GuesstheNumber();
    }

    @org.junit.jupiter.api.Test
    void intro() {
        assertEquals("Hello! What is your name?" +
                "Hello! What is your name?" +
                "Well, Abaddon, I am thinking of a number between 1 and 20." +
                "Take a guess.", game.intro());
    }

    @org.junit.jupiter.api.Test
    void promptUser() {
        assertEquals("Please pick a number between 1 and 20", game.promptUser());
    }


}