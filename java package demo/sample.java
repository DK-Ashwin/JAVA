abstract class Vehicle {
    String vehicleNumber;

    Vehicle(String number ) {
        vehicleNumber =number;
    }

    abstract double calculateToll();

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    double calculateToll() {
        return 100;
    }
}

class Truck extends Vehicle {
    Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    double calculateToll() {
        return 250;
    }
}

public class sample {
    public static void main(String[] args) {
        Vehicle v1 = new Car("KL07AA1111");
        Vehicle v2 = new Truck("KL17AA1234");

        v1.displayVehicleDetails();
        System.out.println("Toll: " + v1.calculateToll());

        v2.displayVehicleDetails();
        System.out.println("Toll: " + v2.calculateToll());
    }
}