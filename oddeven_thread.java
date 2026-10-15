
import java.util.Scanner;

class EvenThread extends Thread {

    int[] ar;

    EvenThread(int[] ar) {
        this.ar = ar;
    }

    public void run() {
        for (int n : ar) {
            if (n % 2 == 0) {
                System.out.println("EVEN");
                System.out.println("SQUARE = " + (n * n));
            }
        }
    }
}

class OddThread extends Thread {

    int[] ar;

    OddThread(int[] ar) {
        this.ar = ar;
    }

    public void run() {
        for (int n : ar) {
            if (n % 2 != 0) {
                System.out.println("ODD");
                System.out.println("SQUARE = " + (n * n));
            }
        }
    }
}

public class oddeven_thread {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements = ");
        int n = sc.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter the elements = ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        EvenThread t1 = new EvenThread(ar);
        OddThread t2 = new OddThread(ar);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
