import java.util.*;

class LeaveLimitExceededException extends Exception{
	LeaveLimitExceededException(String a){
		super(a);
	}
} 

public class Employee_leave_management_system{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num_leave;
		String emp_name;
		try{
			System.out.print("Enter employee name : ");
			emp_name=sc.nextLine();
			
			System.out.print("Enter number of leave : ");
			num_leave=sc.nextInt();
			
			if(num_leave>15){
				throw new LeaveLimitExceededException("\nCannot take leave more than 15");
			}
			else{
				System.out.print("Leave approved successfully");
			}
		}
		
		catch(LeaveLimitExceededException e){
			System.out.println(e.getMessage());
		}
		
	}
}
