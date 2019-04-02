import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall1;

    @Before
    public void before() {
        iceCreamStall1 = new IceCreamStall("Vanilla Twist", "Jack Deer", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Vanilla Twist", iceCreamStall1.getName());
    }

    @Test
    public void canChangeName() {
        iceCreamStall1.setName("Strawberry Swirl");
        assertEquals("Strawberry Swirl", iceCreamStall1.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jack Deer", iceCreamStall1.getOwnerName());
    }

    @Test
    public void canChangeOwnerName() {
        iceCreamStall1.setOwnerName("John Smith");
        assertEquals("John Smith", iceCreamStall1.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(10, iceCreamStall1.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        iceCreamStall1.setParkingSpot(25);
        assertEquals(25, iceCreamStall1.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, iceCreamStall1.getRating());
    }

    @Test
    public void canChangeRating() {
        iceCreamStall1.setRating(4);
        assertEquals(4, iceCreamStall1.getRating());
    }
}
