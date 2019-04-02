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
}
