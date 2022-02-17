import static org.junit.jupiter.api.Assertions.*;

class Dragon_CaveTest {
    Dragon_Cave dragon;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dragon = new Dragon_Cave();
    }


    @org.junit.jupiter.api.Test
    void intro() {
        assertEquals("Welcome to Dragon Cave", dragon.intro());
    }

    @org.junit.jupiter.api.Test
    void promptUser() {
        assertEquals("Please pick 1 or 2", dragon.promptUser());
    }

    @org.junit.jupiter.api.Test
    void outcome1() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!", dragon.outcome1());
    }

    @org.junit.jupiter.api.Test
    void outcome2() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "You see flickering light in the distance and hear wood clunking on damp stone.\n" +
                "There is a hunched over round figure approaching you.\n" +
                "Someone shouts, 'Who goes there?'", dragon.outcome2());

    }
}