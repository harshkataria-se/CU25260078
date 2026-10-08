import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter third angle: ");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("The three angles form a valid triangle.");
        } else {
            System.out.println("The three angles do not form a valid triangle.");
        }

        sc.close();
    }
}