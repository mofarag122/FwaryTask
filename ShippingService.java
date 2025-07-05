import java.util.*;

public class ShippingService{
    public static double calculateShipping(List<Shippable> items){
        return items.stream().mapToDouble(Shippable::getWeight).sum() > 0 ? 30 : 0;
    }

    public static void ship(List<Shippable> items){
        if (items.isEmpty()) return;

        System.out.println("**Shipment notice**");

        Map<String, Integer> itemCount= new LinkedHashMap<>();
        Map<String, Double> itemWeight= new LinkedHashMap<>();

        for (Shippable item : items){
            itemCount.put(item.getName(), itemCount.getOrDefault(item.getName(), 0) + 1);
            itemWeight.putIfAbsent(item.getName(), item.getWeight());
        }

        for (String name : itemCount.keySet()) {
            int count = itemCount.get(name);
            double weightKg = itemWeight.get(name);
            System.out.printf("%dx %-12s %.0fg\n", count, name, weightKg * count * 1000);
        }

        double totalWeight = items.stream().mapToDouble(Shippable::getWeight).sum();
        System.out.printf("total package weight %.1fkg\n\n", totalWeight);
    }
}
