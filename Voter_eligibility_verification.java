import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String a){
		super(a);
	}
}

public class Voter_eligibility_verification{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		try{
			System.out.print("Enter your name : ");
			name=sc.nextLine();
			
			System.out.print("Enter your age : ");
			age=sc.nextInt();
			
			if(age<18){
				throw new InvalidAgeException("\nNOT ELIGIBLE TO VOTE");
			}
			else{
				System.out.println("\nELIGIBLE TO VOTE");
			}
		}
		
		catch(InvalidAgeException e){
			System.out.print(e.getMessage());
		}
		finally{
			System.out.println("\nTHANKYOU!");
		}
	}
}
