import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park1;

    @Before
    public void before() {
        park1 = new Park("Green Meadows", 0);
    }

    @Test
    public void hasName() {
        assertEquals("Green Meadows", park1.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, park1.getRating());
    }

}
