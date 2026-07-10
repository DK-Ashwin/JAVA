//Implement a java program to check a given number is palindrome.
import java.util.Scanner;
public class palindrome{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		int h,rev=0;
		int temp=a;
		while(a>0){
			h=a%10;
			rev=(rev*10)+h;
			a=a/10;
		}
		if (temp==rev){
			System.out.println("THE NUMBER IS PALINDROME");
		}
		else{
			System.out.println("THE NUMBER IS NOT PALINDROME");
		}
	}
}
		
