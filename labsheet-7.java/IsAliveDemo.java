class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");

            Thread.sleep(1000);

            System.out.println("Thread is finishing...");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class IsAliveDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        // Before starting the thread
        System.out.println("Before start: " + t.isAlive());

        t.start();

        // While the thread is running
        System.out.println("After start: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // After the thread finishes
        System.out.println("After completion: " + t.isAlive());
    }
}