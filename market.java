import java.util.Scanner;
public class market{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int n,i,sub_total=0,price,quantity;
        double total,gst;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Enter the PRICE of item "+(i+1) +": Rs");
            price=sc.nextInt();
            System.out.print("Enter the QUANTITY of item "+(i+1)+" : ");
            quantity=sc.nextInt();
            sub_total=sub_total+(price*quantity);
        }
        gst=sub_total*0.18;
        total=sub_total+gst;
        System.out.println("Total price : "+total);
    } 
}