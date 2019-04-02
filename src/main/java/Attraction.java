import java.util.ArrayList;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;
    private ArrayList<Visitor> visitors;


    public Attraction(String name) {
        this.name = name;
        this.rating = 0;
        this.visitors = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int newRating) {
        this.rating = newRating;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void addVisitor(Visitor newVisitor) {
        this.visitors.add(newVisitor);
    }




}
