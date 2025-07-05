import java.time.LocalDate;

public class ExpiringProduct extends Product {
    private final LocalDate expiryDate;

    public ExpiringProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
