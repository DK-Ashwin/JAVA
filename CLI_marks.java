public class CLI_marks {
    public static void main(String[] args){
        int total=0;
        for(String i:args){
            int m=Integer.parseInt(i);
            total+=m;
        }
        int avg=total/5;
        if(avg>=90){
            System.out.print("Grade A");
        }
        else if(avg>=75){
            System.out.print("Grade B");
        }
        else if(avg>=60){
            System.out.print("Grade C");
        }
        else if(avg>=50){
            System.out.print("Grade D");
        }
        else{
            System.out.print("FAIL");
        }
        System.out.print("Total marks : "+total);
    }
    
}
