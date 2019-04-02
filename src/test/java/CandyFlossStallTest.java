import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall1;

    @Before
    public void before() {
        candyFlossStall1 = new CandyFlossStall("Pink Cloud", "Janet Jameson", 30);
    }

    @Test
    public void hasName() {
        assertEquals("Pink Cloud", candyFlossStall1.getName());
    }

    @Test
    public void canChangeName() {
        candyFlossStall1.setName("Sugar Nimbus");
        assertEquals("Sugar Nimbus", candyFlossStall1.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Janet Jameson", candyFlossStall1.getOwnerName());
    }

    @Test
    public void canChangeOwnerName() {
        candyFlossStall1.setOwnerName("Francis Gordon");
        assertEquals("Francis Gordon", candyFlossStall1.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(30, candyFlossStall1.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        candyFlossStall1.setParkingSpot(33);
        assertEquals(33, candyFlossStall1.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, candyFlossStall1.getRating());
    }
}
