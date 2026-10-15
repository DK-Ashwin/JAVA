class SquareThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * i);
        }
    }
}

public class join{
    public static void main(String[] args)
            throws InterruptedException {

        SquareThread t = new SquareThread();
        t.start();

        t.join();

        System.out.println("Program completed");
    }
}
