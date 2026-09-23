import java.util.*;

public class Student_Result_Processing{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name;
		int total_marks,sub;
		double avg_marks;
		try{
			System.out.print("Enter the student name: ");
			name = sc.nextLine();
			System.out.print("Enter the total marks of the student : ");
			total_marks=sc.nextInt();
			System.out.print("Enter the number of subjects : ");
			sub=sc.nextInt();
			avg_marks=total_marks/sub;
			System.out.print("Avg mark is : "+avg_marks);
		}
		catch(InputMismatchException e){
			System.out.println("\nINVALID INPUT");
		}
		catch(ArithmeticException e){
			System.out.println("\nNUMBER OF SUBJECTS CANNOT BE ZERO");
		}
		finally{
			System.out.println("\nResult processing completed");
		}
	}
}
