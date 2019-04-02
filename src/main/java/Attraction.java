public abstract class Attraction implements IReviewed {

    protected String name;
    protected int rating;

    public Attraction(String name) {
        this.name = name;
        this.rating = 0;
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


}
