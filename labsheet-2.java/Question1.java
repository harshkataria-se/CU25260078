import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        double a = sc.nextDouble();

        System.out.print("Enter second side: ");
        double b = sc.nextDouble();

        System.out.print("Enter third side: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Semi-perimeter: " + s);
        System.out.println("Area of triangle: " + area);

        sc.close();
    }
}