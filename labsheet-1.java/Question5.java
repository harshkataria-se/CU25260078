import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        int integerNum = (int) num;

        System.out.println("Original value: " + num);
        System.out.println("Converted integer value: " + integerNum);

        sc.close();
    }
}