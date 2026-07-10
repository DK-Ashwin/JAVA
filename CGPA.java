//Implement a java program to Read roll number, name, and CGPA of a student and display them.
import java.util.Scanner;
public class CGPA{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your name : ");
	String name=sc.next();
	System.out.print("Enter your roll number : ");
	int roll_no=sc.nextInt();
	System.out.print("Enter your CGPA : ");
	double cgpa=sc.nextDouble();
	System.out.println("Your name is : "+name);
	System.out.println("Your roll number is : "+roll_no);
	System.out.println("Your CGPA is : "+cgpa);
	}
}	
	
