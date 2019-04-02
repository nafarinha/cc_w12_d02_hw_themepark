public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor newVisitor) {
        return newVisitor.getAge() < 16;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }
}
