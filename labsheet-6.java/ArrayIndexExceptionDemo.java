import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an integer array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter an array index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
            System.out.println("Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}