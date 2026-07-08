import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: " + (i + 1) + ":");
            num[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even numbers are : " + even);
        System.out.println("Odd numbers are :" + odd);
    }
}