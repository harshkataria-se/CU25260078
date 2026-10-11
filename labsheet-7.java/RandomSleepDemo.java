class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {
        try {
            int time = (int) (Math.random() * 501);
            Thread.sleep(time);

            System.out.println(getName() + ": Thread executed after " 
                               + time + " ms.");
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class RandomSleepDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Reader");
        MyThread t2 = new MyThread("Writer");
        MyThread t3 = new MyThread("Logger");

        t1.start();
        t2.start();
        t3.start();
    }
}