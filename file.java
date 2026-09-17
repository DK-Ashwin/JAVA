import java.util.Scanner;
public class file{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=1,w=2,x=4;
        int p=0;
        p=p|r;
        p|=w;
        System.out.println("Read: "+ ((p&r)!=0)+"\nWrite: "+((p&w)!=0)+"\nExecute: "+((p&x)!=0));
        p|=x;
        p&=(~w);
        System.out.println("After grant and revoke : ");
        System.out.println("Read: "+ ((p&r)!=0)+"\nWrite: "+((p&w)!=0)+"\nExecute: "+((p&x)!=0));
    }
}