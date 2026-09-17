import java.util.Scanner;
public class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double balance,with_amt;
        System.out.print("Enter your account balance : Rs");
        balance=sc.nextDouble();
        System.out.print("Enter withdrawal amount : Rs");
        with_amt=sc.nextDouble();
        if(balance>with_amt && with_amt%100==0){
            System.out.print("ELIGIBLE");
        }
        else{
            System.out.print("NOT ELIGIBLE");
        }  
    }
}
