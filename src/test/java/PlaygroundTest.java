import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground1;

    @Before
    public void before() {
        playground1 = new Playground("Sugar Land");
    }

    @Test
    public void hasName() {
        assertEquals("Sugar Land", playground1.getName());
    }
}
