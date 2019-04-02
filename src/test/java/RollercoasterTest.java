import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Rollercoaster rollercoaster1;

    @Before
    public void before() {
        visitor1 = new Visitor(11, 146, 3.00);
        visitor2 = new Visitor(13, 144, 5.00);
        visitor3 = new Visitor(13, 150, 10.00);

        rollercoaster1 = new Rollercoaster("Crazy Loops");
    }

    @Test
    public void hasName() {
        assertEquals("Crazy Loops", rollercoaster1.getName());
    }

    @Test
    public void canCheckVistorSecurity_IsNotAllowed() {
        assertFalse(rollercoaster1.isAllowedTo(visitor1));
        assertFalse(rollercoaster1.isAllowedTo(visitor2));
    }

    @Test
    public void canCheckVistorSecurity_IsAllowed() {
        assertTrue(rollercoaster1.isAllowedTo(visitor3));
    }

    @Test
    public void canGetRating() {
        assertEquals(0, rollercoaster1.getRating());
    }

    @Test
    public void canChangeRating() {
        rollercoaster1.setRating(4);
        assertEquals(4, rollercoaster1.getRating());
    }
}
