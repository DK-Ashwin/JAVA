import java.util.Scanner;
public class unit_conversion{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int unit;
        double total;
        System.out.print("Enter the units consumed : ");
        unit=sc.nextInt();
        double cost_per_unit=10.50;
        total=unit*cost_per_unit;
        System.out.println("Total bill : "+total);

        


    }
}
