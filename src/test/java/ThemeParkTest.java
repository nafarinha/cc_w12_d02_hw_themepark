import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark1;

    @Before
    public void before() {
        themePark1 = new ThemePark();
    }

    @Test
    public void canGetAllReviewedFeatures() {
        assertEquals(0, themePark1.getAllReviewed().size());
    }
}
