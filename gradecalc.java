import java.util.Scanner;
public class gradecalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the marks grade :");
        int n=sc.nextInt();
        if(n>=90){
            System.out.println("GRADE A");
        }
        else if(n<90 && n>=80){
            System.out.println("GRADE B");
        }
        else if(n<80 && n>=70){
            System.out.println("GRADE C");
        }  
        else if(n<70 && n>=60){
            System.out.println("GRADE D");
        } 
        else if(n<60 && n>=50){
            System.out.println("GRADE E");
        }   
        else{
            System.out.println("FAIL");
        }

    }
}
