import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park1;

    @Before
    public void before() {
        park1 = new Park("Green Meadows");
    }

    @Test
    public void hasName() {
        assertEquals("Green Meadows", park1.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, park1.getRating());
    }

    @Test
    public void canChangeRating() {
        park1.setRating(4);
        assertEquals(4, park1.getRating());
    }

    @Test
    public void canGetVisitors() {
        assertEquals(0, park1.getVisitors().size());
    }

    @Test
    public void canAddVisitor() {
        Visitor visitor = new Visitor(20, 190, 12.00);
        park1.addVisitor(visitor);
        assertEquals(1, park1.getVisitors().size());

    }

}
