public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }
}
