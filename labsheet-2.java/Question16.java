import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        int multiplication = num << shift;
        int division = num >> shift;

        System.out.println("After multiplication by 2^" + shift
                + ": " + multiplication);

        System.out.println("After division by 2^" + shift
                + ": " + division);

        sc.close();
    }
}