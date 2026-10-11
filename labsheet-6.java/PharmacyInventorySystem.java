import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class PharmacyInventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Required quantity exceeds available stock."
                );
            }

            available = available - required;

            System.out.println("\nInventory transaction successful.");
            System.out.println("Medicine Name: " + medicineName);
            System.out.println("Quantity Issued: " + required);
            System.out.println("Remaining Stock: " + available);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric quantities.");
        }
        catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Inventory transaction completed.");
            sc.close();
        }
    }
}