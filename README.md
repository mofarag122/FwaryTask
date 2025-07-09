# Fawry Internship E-Commerce System Challenge

## Description
Java-based e-commerce system supporting:
- Shippable, perishable, and digital products
- Expiry and stock checks
- Shipping weight and fee calculations
- Full checkout flow with detailed receipt

## Features
- Add to cart with quantity limit check
- Expired product validation
- Out-of-stock check
- Insufficient balance check
- ShippingService interface and implementation
- Clear console output matching test case format
## Sample Output Screenshot
![image](https://github.com/user-attachments/assets/ae5f068d-44cb-46e1-ae95-e98df2573539)
![image](https://github.com/user-attachments/assets/64d21e8c-fe66-4520-9074-a1f028fde2cc)



## How to Run
1. Open the project in IntelliJ IDEA
2. Run the `Main.java` file
3. Check console output

## Class Structure

| Class/File              | Responsibility                                       |
|------------------------|------------------------------------------------------|
| `Product.java`          | Base class with name, price, quantity               |
| `Shippable.java`        | Interface for products requiring shipping           |
| `ExpiringProduct.java`  | Products with an expiry date                        |
| `ExpiringShipProduct.java` | Perishable & shippable product class             |
| `ShippingProduct.java`  | Non-expiring shippable product                      |
| `Cart.java`             | Holds cart items with validation logic              |
| `Customer.java`         | Holds customer name and balance                     |
| `CheckoutService.java`  | Processes cart, validates rules, and prints receipt |
| `ShippingService.java`  | Calculates shipping and prints shipping notice      |
| `Main.java`             | Sample test case with valid and edge scenarios      |


