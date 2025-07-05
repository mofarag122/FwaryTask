import java.time.LocalDate;

public class ExpiringShipProduct extends Product implements Shippable {
    private final LocalDate expiryDate;
    private final double weight;

    public ExpiringShipProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
