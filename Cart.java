import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new LinkedHashMap<>();

    public boolean add(Product product, int quantity) {
        if (quantity <= 0) return false;

        if (product.getQuantity() < quantity) {
            System.out.println("Error: " + product.getName() + " out of stock.");
            return false;
        }

        items.put(product, items.getOrDefault(product, 0) + quantity);
        product.decreaseQuantity(quantity);
        return true;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
