import java.util.Scanner;

public class ThrowsDemo {

    // Method declares that it may throw an exception
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Eligible: Age is 18 or above.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            // Call the method
            checkAge(age);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}