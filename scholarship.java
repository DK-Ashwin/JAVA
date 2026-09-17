import java.util.Scanner;
public class scholarship {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double CGPA,fam_inc;
        System.out.print("Enter your CGPA :");
        CGPA=sc.nextDouble();
        System.out.print("Enter your family income : ");
        fam_inc=sc.nextInt();
        if(CGPA>=8.5 && fam_inc<300000){
            System.out.print("ELIGIBLE");
        }
        else{
            System.out.print("NOT ELIGIBILE");
        }

    }
}
