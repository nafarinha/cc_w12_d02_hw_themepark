import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    //Attractions
    Dodgems dodgems1;
    Park park1;
    Playground playground1;
    Rollercoaster rollercoaster1;

    //Stalls
    CandyFlossStall candyFlossStall1;
    IceCreamStall iceCreamStall1;
    TobaccoStall tobaccoStall1;

    ThemePark themePark1;

    @Before
    public void before() {
        dodgems1 = new Dodgems("Bumpy Drive");
        park1 = new Park("Green Meadows");
        playground1 = new Playground("Sugar Land");
        rollercoaster1 = new Rollercoaster("Crazy Loops");

        candyFlossStall1 = new CandyFlossStall("Pink Cloud", "Janet Jameson", 30);
        iceCreamStall1 = new IceCreamStall("Vanilla Twist", "Jack Deer", 10);
        tobaccoStall1 = new TobaccoStall("Cloudy Pipes", "Ewan Peterson", 86);


        themePark1 = new ThemePark(dodgems1, park1, playground1, rollercoaster1, candyFlossStall1, iceCreamStall1, tobaccoStall1);
    }


    @Test
    public void canGetAllReviewedFeatures() {
        assertEquals(7, themePark1.getAllReviewed().size());
    }

    @Test
    public void canAddFeature() {
        Playground playground = new Playground("Sugar Land");
        themePark1.addFeature(playground);

        assertEquals(8, themePark1.getAllReviewed().size());
    }

/*    @Test
    public void canVisitAttraction() {
        Visitor visitor = new Visitor(20, 190, 12.00);
        themePark1.visit(visitor, "Rollercoaster");
    }*/
}
