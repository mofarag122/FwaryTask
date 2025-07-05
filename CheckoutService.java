import java.util.*;

public class CheckoutService{
    public static void checkout(Customer customer, Cart cart){
        if (cart.isEmpty()){
            System.out.println("Error: cart is empty");
            return;
        }

        List<Shippable> toShip= new ArrayList<>();
        double subtotal= 0;

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()){
            Product product= entry.getKey();
            int qty= entry.getValue();

            if (product.isExpired()){
                System.out.println("Error: " + product.getName() + " expired");
                return;
            }

            if (product.getQuantity() < 0) {
                System.out.println("Error: " + product.getName() + "  out of stock");
                return;
            }

            subtotal += product.getPrice() * qty;

            if (product instanceof Shippable){
                for (int i= 0; i < qty; i++){
                    toShip.add((Shippable) product);
                }
            }
        }

        double shipping = ShippingService.calculateShipping(toShip);
        double total = subtotal + shipping;

        if (customer.getBalance() < total){
            System.out.println("Error: insufficient balance.");
            return;
        }

        ShippingService.ship(toShip);

        System.out.println("**Checkout receipt**");

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();
            double itemTotal = product.getPrice() * qty;
            System.out.printf("%dx %-13s %.0f\n", qty, product.getName(), itemTotal);
        }

        System.out.println("---------------------");
        System.out.printf("subtotal         %.0f\n", subtotal);
        System.out.printf("shipping         %.0f\n", shipping);
        System.out.printf("amount           %.0f\n", total);

        customer.deduct(total);
        System.out.printf("remaining balance %.0f\n", customer.getBalance());
    }
}
