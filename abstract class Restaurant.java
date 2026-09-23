abstract class Restaurant {
    abstract double calculateDeliveryCharge(double amount);
}

class VegRestaurant extends Restaurant {
    double calculateDeliveryCharge(double amount) {
        return amount * 0.05;
    }
}

class FastFoodRestaurant extends Restaurant {
    double calculateDeliveryCharge(double amount) {
        return amount * 0.10;
    }
}

public class Q1_FoodDelivery {
    public static void main(String[] args) {
        Restaurant r1 = new VegRestaurant();
        Restaurant r2 = new FastFoodRestaurant();

        System.out.println("Veg Restaurant Delivery Charge: " + r1.calculateDeliveryCharge(500));
        System.out.println("Fast Food Restaurant Delivery Charge: " + r2.calculateDeliveryCharge(500));
    }
}