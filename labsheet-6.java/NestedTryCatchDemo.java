import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Outer try block for division
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Division Result: " + result);

            // Inner try-catch block for array access
            try {
                int[] numbers = {10, 20, 30, 40, 50};

                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();

                System.out.println("Array Element: " + numbers[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index.");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}