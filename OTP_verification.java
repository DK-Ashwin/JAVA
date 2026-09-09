import java.util.Scanner;
public class OTP_verification{
        Scanner sc=new Scanner(System.in);

        String enteredOTP;
        int generatedOTP;

        String verifyOTP(){
            System.out.print("Enter the 4 digit OTP: ");
            enteredOTP=sc.next();
            return enteredOTP;
        }
        int genOTP(){
            return;
        }
        boolean verifyOTP(){
            if(enteredOTP==generatedOTP){
                return true;
            }
            else{
                return false;
            }
        }
        void displaystatus(){

        }
    


    public static void main(String[] args){
        
        
    }
}
