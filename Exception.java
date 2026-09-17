
public class Exception{

    public static void main(String args[]) {
        int d = 0;
        int a = 0;
        try {
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        }
        System.out.println("a " + a);
        System.out.println("Other tasks");
        System.out.println("Main exits");
    }
}
