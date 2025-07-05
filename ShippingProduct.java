public class ShippingProduct extends Product implements Shippable {
    private final double weight;

    public ShippingProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
