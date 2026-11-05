class BankAccount {
    private int balance = 10000;
    private final Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }
    }

    int getBalance() {
        synchronized (lock) {
            return balance;
        }
    }
}

class WithdrawalThread extends Thread {
    BankAccount account;

    WithdrawalThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawalThread t1 = new WithdrawalThread(account);
        WithdrawalThread t2 = new WithdrawalThread(account);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Expected Balance: 8000");
        System.out.println("Actual Balance: " + account.getBalance());
    }
}