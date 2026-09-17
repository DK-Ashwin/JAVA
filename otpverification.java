import java.util.Scanner;
public class otpverification{
    String OTP;
    int generatedOTP;

    String enterOTP(){
        System.out.print("Enter the 4 digit OTP: ");
        OTP=sc.next();
        return OTP;
    }

    int genOTP(){
        generatedOTP=1550;
        return generatedOTP;
    }

    boolean verifyOTP(){
        OTP=enterOTP();
        Otp=Integer.parseInt(OTP);
        boolean pass=true;
        if(generatedOTP!=otp){
            pass=false;
        }
        if(pas){
            System.out.print("OTP verified");
        }
        else{
            System.out.print("Incorrect OTP");
        }
    }
    public static void main(String[] args){
        otpverification obj=new otpverification();
        obj.enterOTP();
    }

}
