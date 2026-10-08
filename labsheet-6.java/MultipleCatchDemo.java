import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Accept two numbers
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();

            // Convert String to integers
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Perform division
            int result = num1 / num2;
            System.out.println("Division Result: " + result);

            // Accept array index
            System.out.print("Enter array index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            // Display array element
            System.out.println("Array element: " + numbers[index]);
        }

        // Handles division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Handles invalid array index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. Enter an index from 0 to 4.");
        }

        // Handles invalid integer input
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        sc.close();
    }
}