public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, int parkingSlot) {
        super(name, ownerName, parkingSlot);
    }

    public boolean isAllowedTo(Visitor newVistor) {
        return newVistor.getAge() > 17;
    }
}
