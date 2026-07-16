//Write a java program to Count Special Symbols in a string
import java.util.Scanner;
public class spclchar_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        int count=0,i;
            for(i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                    continue;
                }
                else{
                    count++;
                }
        }
        System.out.print("Special Characters : "+count);
    }
}