public class multi_exceptions{
    public static void main(String args[]){
        int d=0;
        int a=0;
        int[] arr=new int[5];
        try {
           a=42/d;
           arr[10]=8; 
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}