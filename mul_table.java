//Implement a java program to print the multiplication table of a number given by the user.
import java.util.Scanner;
public class mul_table{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for the table : ");
		int a=sc.nextInt();
		int i,mul;
		for(i=0;i<=10;i++){
			mul=a*i;
			System.out.println(a+"*"+i+"="+mul);
		}
	}
}
