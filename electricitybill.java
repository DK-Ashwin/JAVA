
class ElectricityBill {

    int consumerID;
    int units;
    double tariff;

    ElectricityBill(int consumerID) {
        this.consumerID = consumerID;
        this.units = 0;
        this.tariff = 0;
    }

    ElectricityBill(int consumerID, int units) {
        this.consumerID = consumerID;
        this.units = units;
        this.tariff = 0;
    }

    ElectricityBill(int consumerID, int units, double tariff) {
        this.consumerID = consumerID;
        this.units = units;
        this.tariff = tariff;
    }
}

public class electricitybill {

    public static void main(String args[]) {
        ElectricityBill b1 = new ElectricityBill(1);
        ElectricityBill b2 = new ElectricityBill(2, 32);
        ElectricityBill b3 = new ElectricityBill(3, 41, 1.23);

        System.out.println("Electricity Bill for Consumer Number " + b1.consumerID + " is " + (b1.units * 10) + b1.tariff);
        System.out.println("Electricity Bill for Consumer Number " + b2.consumerID + " is " + (b2.units * 10) + b2.tariff);
        System.out.println("Electricity Bill for Consumer Number " + b3.consumerID + " is " + (b3.units * 10) + b3.tariff);
    }
}
