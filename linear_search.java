import java.util.Scanner;
public class linear_search{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[]arr;
		arr=new int[20];
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
		System.out.print("enter element "+(i+1)+" : ");
		arr[i] = sc.nextInt();}
		System.out.print("enter search element : ");
		int se = sc.nextInt();
		for(int i = 0 ; i<n ; i++){
			if(arr[i] == se){
				System.out.println("element found at index "+i);
				break;}
		}
	}
}