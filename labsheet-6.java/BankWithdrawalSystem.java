import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawalSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            String balanceInput = sc.nextLine();
            double balance = Double.parseDouble(balanceInput);

            System.out.print("Enter withdrawal amount: ");
            String amountInput = sc.nextLine();
            double amount = Double.parseDouble(amountInput);

            if (amount < 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount cannot be negative."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance in the account."
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
            sc.close();
        }
    }
}