import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    Visitor visitor1;
    Visitor visitor2;
    Playground playground1;

    @Before
    public void before() {
        visitor1 = new Visitor(16, 165, 10.00);
        visitor2 = new Visitor(15, 147, 8.00);
        playground1 = new Playground("Sugar Land");
    }

    @Test
    public void hasName() {
        assertEquals("Sugar Land", playground1.getName());
    }

    @Test
    public void canCheckVisitorAge_NotAllowed() {
        assertFalse(playground1.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckVisitorAge_Allowed() {
        assertTrue(playground1.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating() {
        assertEquals(0, playground1.getRating());
    }
}
