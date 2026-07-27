import java.util.Scanner;

public class FoodDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double orderAmount, discount, finalAmount;

        System.out.print("Enter Order Amount: ");
        orderAmount = sc.nextDouble();

        // Using ternary operator
        discount = (orderAmount >= 1000) ? orderAmount * 0.15 : orderAmount * 0.05;

        finalAmount = orderAmount - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Payable Amount = " + finalAmount);

        sc.close();
    }
}