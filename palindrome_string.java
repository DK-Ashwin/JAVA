//Write a java program to check whether a string is palindrome (ignoring spaces and symbols)
import java.util.Scanner;
public class palindrome_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int i;
        String clean="";
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean=clean+ch;
            }
        }
        String rev = "";
        for (i=clean.length()-1;i >= 0;i--) {
            rev=rev+clean.charAt(i);
        }
        if (clean.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
