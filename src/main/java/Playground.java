public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor newVisitor) {
        return newVisitor.getAge() < 16;
    }
}
