import java.util.ArrayList;
import java.util.List;

public class ThemePark {

    ArrayList<IReviewed> features;

    public ThemePark(IReviewed... args) {
        features = new ArrayList<>();
        for(IReviewed arg : args) {
            this.features.add(arg);
        }
    }

    public ArrayList<IReviewed> getAllReviewed() {
       return this.features;
    }

    public void addFeature(IReviewed newFeature) {
        this.features.add(newFeature);
    }

}
