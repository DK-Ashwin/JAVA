class calculate_total{
    String s1="98";
    String s2="72";
    String s3="63";
    String s4="55";
    String s5="68";
    int marks[]=new int[10];
    int calculatetotal(int[] marks){
        int total=0,i;
        for(i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total;
    }
    double CalculateAverage(int total){
        return total/5.0;

    }
    void displayResult(){
        marks[0]=Integer.parseInt(s1);
        marks[1]=Integer.parseInt(s2);
        marks[2]=Integer.parseInt(s3);
        marks[3]=Integer.parseInt(s4);
        marks[4]=Integer.parseInt(s5);
        Integer total=calculatetotal(marks);
        double avg = CalculateAverage(total);
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        boolean pass=true;
        for(int i=0;i<marks.length;i++){
            if(marks[i]<40)
            pass=false;
            break;
        }
        if(pass)
        System.out.println("Pass");
        else
        System.out.println("Fail");

    }
    public static void main(String[] args){
        calculate_total obj=new calculate_total();
        obj.displayResult();
    }
}
