import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor(12, 150, 5.00);
    }

    @Test
    public void hasAge() {
        assertEquals(12, visitor1.getAge());
    }

    @Test
    public void canChangeAge() {
        visitor1.setAge(11);
        assertEquals(11, visitor1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(150, visitor1.getHeight());
    }

    @Test
    public void canChangeHeight() {
        visitor1.setHeight(160);
        assertEquals(160, visitor1.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(5.00, visitor1.getMoney(), 0);
    }

    @Test
    public void canAddFunds() {
        visitor1.addFunds(2.50);
        assertEquals(7.50, visitor1.getMoney(), 0);
    }

    @Test
    public void canPay() {
        visitor1.pay(1.00);
        assertEquals(4.00, visitor1.getMoney(), 0);
    }



}
