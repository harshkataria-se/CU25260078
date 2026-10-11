class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Harsh Kataria");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                return;
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}