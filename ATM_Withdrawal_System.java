import java.util.*;

public class ATM_Withdrawal_System{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double acc_bal,with_am,avg_with,rem_bal;
		int num_trans;
		try{
			System.out.print("Enter your Account balance : ");
			acc_bal=sc.nextDouble();
			
			System.out.print("Enter withdrawal amount : ");
			with_am=sc.nextDouble();
			
			System.out.print("Enter the number of transactions : ");
			num_trans=sc.nextInt();
			
			if(num_trans==0){
				throw new ArithmeticException("\nNUMBER OF TRANSACTION CANNOT BE ZERO!");
			}
			
			rem_bal=(acc_bal-with_am);
			System.out.println("The remaining account balance is : "+rem_bal);
			
			
			avg_with=with_am/num_trans;
			System.out.println("The average withdrawal amount is : "+avg_with);
			
			
		}
		catch(InputMismatchException e){
			System.out.println("\nINVALID NUMERIC INPUT");		
		}
		
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("\nThank you for using our ATM service");
		}
	}
}
