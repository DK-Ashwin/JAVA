class SquareThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}

class CubeThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
        }
    }
}

public class multi_threads {
    public static void main(String[] args) {
        SquareThread t1 = new SquareThread();
        CubeThread t2 = new CubeThread();

        t1.start();
        t2.start();
    }
}
