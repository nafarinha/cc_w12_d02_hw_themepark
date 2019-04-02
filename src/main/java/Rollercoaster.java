public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean isAllowedTo(Visitor newVisitor) {
        return (newVisitor.getAge() > 12 && newVisitor.getHeight() > 145);
    }
}
