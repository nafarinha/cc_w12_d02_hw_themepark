import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems1;

    @Before
    public void before() {
        dodgems1 = new Dodgems("Bumpy Drive");
    }

    @Test
    public void hasName() {
        assertEquals("Bumpy Drive", dodgems1.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, dodgems1.getRating());
    }

    @Test
    public void canChangeRating() {
        dodgems1.setRating(4);
        assertEquals(4, dodgems1.getRating());
    }

    @Test
    public void canGetVisitors() {
        assertEquals(0, dodgems1.getVisitors().size());
    }

    @Test
    public void canAddVisitor() {
        Visitor visitor = new Visitor(20, 190, 12.00);
        dodgems1.addVisitor(visitor);
        assertEquals(1, dodgems1.getVisitors().size());

    }
}
