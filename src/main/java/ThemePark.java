import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> features;

    public ThemePark() {
        features = new ArrayList<>();

    }

    public ArrayList<IReviewed> getAllReviewed() {
       return this.features;
    }
}
