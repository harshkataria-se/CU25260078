class MyThread extends Thread {
    MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " (Priority " + getPriority() + ") - Count: " + i);
        }
        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriorityTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1", 1);
        MyThread t2 = new MyThread("Thread-2", 3);
        MyThread t3 = new MyThread("Thread-3", 5);
        MyThread t4 = new MyThread("Thread-4", 7);
        MyThread t5 = new MyThread("Thread-5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}