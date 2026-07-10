//Implement a java program to reverse a number.
import java.util.Scanner;
public class reverse{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		int h,rev=0;
		int temp=a;
		while(a>0){
			h=a%10;
			rev=(rev*10)+h;
			a=a/10;
		}
		System.out.println("The reversed number is :"+rev);
	}
}
