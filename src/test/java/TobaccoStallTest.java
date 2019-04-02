import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall1;

    @Before
    public void before() {
        tobaccoStall1 = new TobaccoStall("Cloudy Pipes", "Ewan Peterson", 86);
    }

    @Test
    public void hasName() {
        assertEquals("Cloudy Pipes", tobaccoStall1.getName());
    }

    @Test
    public void canChangeName() {
        tobaccoStall1.setName("Pipin");
        assertEquals("Pipin", tobaccoStall1.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Ewan Peterson", tobaccoStall1.getOwnerName());
    }

    @Test
    public void canChangeOwnerName() {
        tobaccoStall1.setOwnerName("Richard Kennedy");
        assertEquals("Richard Kennedy", tobaccoStall1.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(86, tobaccoStall1.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        tobaccoStall1.setParkingSpot(79);
        assertEquals(79, tobaccoStall1.getParkingSpot());
    }
}
