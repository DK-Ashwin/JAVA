
class TrafficSignal extends Thread {

    String direction;

    TrafficSignal(String direction) {
        this.direction = direction;
    }

    public void run() {
        try {
            System.out.println(direction + " signal = RED");
            Thread.sleep(1000);

            System.out.println(direction + " signal = YELLOW");
            Thread.sleep(1000);

            System.out.println(direction + " signal = GREEN");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class signal_thread {

    public static void main(String[] args) throws InterruptedException {
        TrafficSignal North = new TrafficSignal("NORTH");
        North.start();
        North.join();

        TrafficSignal East = new TrafficSignal("EAST");
        East.start();
        East.join();

        TrafficSignal West = new TrafficSignal("WEST");
        West.start();
        West.join();
    }
}
