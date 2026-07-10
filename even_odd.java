import java.util.Scanner;
	public class even_odd{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[20];
			int ce=0,co=0;
			System.out.print("enter size : ");
			int n = sc.nextInt();
			for(int i =0;i<n;i++){
				System.out.println("enter element "+(i+1)+" : ");
				arr[i] = sc.nextInt();}
			for(int i =0 ; i<n; i++){
				if(arr[i]%2 == 0){
					ce++;}
				else{
					co++;}}
			System.out.println("Number of even digits are : "+ce);
			System.out.println("NUmber of odd digits are : "+co);
			}
}