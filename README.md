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

## How to Run
1. Open the project in IntelliJ IDEA
2. Run the `Main.java` file
3. Check console output

## Output Sample
Shipment notice
2x Cheese 400g
1x Biscuits 700g
3x TV 30000g
Total package weight 31.1kg

Checkout receipt
2x Cheese 200
1x Biscuits 150
3x TV 15000
1x ScratchCard 50

Subtotal 15400
Shipping 30
Amount 15430
Remaining balance 4570

## Class Structure

1. `Product.java` – Base class for all products
2. `Shippable.java` – Interface for shippable products
3. `ExpiringProduct.java` – Products with expiry
4. `ExpiringShipProduct.java` – Expiring + Shippable
5. `ShippingProduct.java` – Shippable only
6. `Customer.java` – Customer details and balance
7. `Cart.java` – Shopping cart
8. `CheckoutService.java` – Main business logic
9. `ShippingService.java` – Handles logistics
10. `Main.java` – Entry point with test case


