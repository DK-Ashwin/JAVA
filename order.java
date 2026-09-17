import java.util.Scanner;
public class order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double amt,discount,final_amt;
        System.out.print("Enter the order amount : Rs");
        amt=sc.nextDouble();
        discount=(amt>=0)?amt*0.15:amt*0.05;
        final_amt=amt-discount;
        System.out.print(final_amt);
    }
    
}

