public class array{
    public static void main(String[] args) {
        int[] month_days={31,28,31,30,31,30,31,31,30,31,30,31};
        int a;
        for(a=0;a<12;a++){
            System.out.println("month "+a+" has "+month_days[a]);
        }
    }
}