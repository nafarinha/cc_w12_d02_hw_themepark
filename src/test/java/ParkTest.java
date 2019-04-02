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

}
