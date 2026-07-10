import java.util.Scanner;
public class reverse_array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		int[] rev = new int[20];
		int ce=0,co=0;
		System.out.print("enter size : ");
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
			System.out.print("enter element "+(i+1)+" : ");
			arr[i] = sc.nextInt();}
		for(int i = 0 ; i<n; i++){
				rev[n-i-1]=arr[i];}
		System.out.println("reversed arr : ");
		for(int i=0;i<n;i++){
			System.out.print(" "+rev[i]);}
		}
	}
			