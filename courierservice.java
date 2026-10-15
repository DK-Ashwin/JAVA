
class CourierService {

    double weight;
    double distance;
    double express;
    double charge;

    void CalculateCharge(double weight) {
        charge = weight;
        System.out.println(charge);
    }

    void CalculateCharge(double weight, double distance) {
        charge = weight * distance;
        System.out.println(charge);
    }

    void CalculateCharge(double weight, double distance, double express) {
        charge = weight * distance * express;
        System.out.println(charge);
    }
}

public class courierservice {

    public static void main(String[] args) {
        CourierService s1 = new CourierService();
        s1.CalculateCharge(20);
        s1.CalculateCharge(20, 13);
        s1.CalculateCharge(20, 10, 2);
    }
}
