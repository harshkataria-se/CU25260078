class BankAccount {
    
    long accountNumber;
    double balance;

    static String bankName = "State Bank";

    void deposit(double amount) {
        
        double depositAmount = amount;

        balance = balance + depositAmount;

        System.out.println("Deposited Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountNumber = 1234567890L;
        account.balance = 5000;

        account.displayDetails();

        account.deposit(2000);
    }
}