//write down a program to get marks from the user and find the average
import java.util.Scanner;
public class mark{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.print("Enter the number of subjects :");
        int sub=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=sub;i++){
            System.out.print("Enter the mark of subject "+i+" :");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int avg=sum/5;
        System.out.println("the average is "+avg);



    }
}