public class DeadlockFixDemo {
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1 acquired Lock1");

                synchronized (Lock2) {
                    System.out.println("Thread 1 acquired Lock2");
                }
            }
            System.out.println("Thread 1 completed.");
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 2 acquired Lock1");

                synchronized (Lock2) {
                    System.out.println("Thread 2 acquired Lock2");
                }
            }
            System.out.println("Thread 2 completed.");
        });

        t1.start();
        t2.start();
    }
}