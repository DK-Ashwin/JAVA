//Implement a java program to read two integers and perform arithmetic operations. (operations : +,-,*,/)
import java.util.Scanner;
public class operations{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number : ");
	int a=sc.nextInt();
	System.out.print("Enter the second number : ");
	int b=sc.nextInt();
	int add=a+b;
	int sub=a-b;
	int mul=a*b;
	float div=a/b;
	System.out.println("Addition"+add);
	System.out.println("Subtraction"+sub);
	System.out.println("Multiplication"+mul);
	System.out.println("Division"+div);
	}
}
	
	
	
