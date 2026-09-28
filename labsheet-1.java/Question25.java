import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (0 or 1): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (0 or 1): ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&, |, ^): ");
        char operator = sc.next().charAt(0);

        boolean result;

        if (operator == '&') {
            result = (a != 0) && (b != 0);
            System.out.println("Logical AND result: " + result);

        } else if (operator == '|') {
            result = (a != 0) || (b != 0);
            System.out.println("Logical OR result: " + result);

        } else if (operator == '^') {
            result = (a != 0) ^ (b != 0);
            System.out.println("Logical XOR result: " + result);

        } else {
            System.out.println("Invalid logical operator.");
        }

        sc.close();
    }
}