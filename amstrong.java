import java.util.Scanner;
	public class armstrong{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number : ");
		int n = sc.nextInt();
		int org;
		org = n;
		int r=0,temp;
		while(n>0){
			temp=n%10;
			r=r+temp*temp*temp;
			n=n/10;}
		if(r == org){
			System.out.println("armstrong");}
		else{
			System.out.println("not armstrong");}
		}
}
