import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster1;

    @Before
    public void before() {
        rollercoaster1 = new Rollercoaster("Crazy Loops");
    }

    @Test
    public void hasName() {
        assertEquals("Crazy Loops", rollercoaster1.getName());
    }
}
