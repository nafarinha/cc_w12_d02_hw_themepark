public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor newVisitor) {
        return (newVisitor.getAge() > 12 && newVisitor.getHeight() > 145);
    }
}
