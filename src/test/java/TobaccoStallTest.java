import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    Visitor visitor1;
    Visitor visitor2;
    TobaccoStall tobaccoStall1;

    @Before
    public void before() {
        visitor1 = new Visitor(16, 165, 10.00);
        visitor2 = new Visitor(18, 147, 8.00);
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

    @Test
    public void canCheckVisitorAge_NotAllowed() {
        assertFalse(tobaccoStall1.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckVisitorAge_Allowed() {
        assertTrue(tobaccoStall1.isAllowedTo(visitor2));
    }


}
