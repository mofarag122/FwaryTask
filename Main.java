import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Product cheese= new ExpiringShipProduct("Cheese", 100, 5, LocalDate.of(2025, 8, 1), 0.2);
        Product biscuits= new ExpiringShipProduct("Biscuits", 150, 2, LocalDate.of(2025, 9, 1), 0.7);
        Product tv= new ShippingProduct("TV", 5000, 3, 10);
        Product scratchCard= new Product("ScratchCard", 50, 10){};
        //Product expirecheck = new ExpiringShipProduct("expirecheck", 150, 2, LocalDate.of(2024, 9, 1), 0.7);
        //Product quantitycheck = new ShippingProduct("quantitycheck", 450, 1, 0.3);
        //Product balancecheck = new ShippingProduct("balancecheck", 50000, 3, 10.0);

        Customer customer= new Customer("Mohamed", 20000);
        Cart cart= new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(tv, 3);
        cart.add(scratchCard, 1);
        //cart.add(expirecheck, 2);
        //cart.add(quantitycheck,2);
        //cart.add(balancecheck, 2);

        CheckoutService.checkout(customer, cart);
    }
}
