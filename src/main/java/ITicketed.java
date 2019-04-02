public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor newVisitor);
}
