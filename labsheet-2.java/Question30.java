import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        boolean powerOf4 = false;

        while (temp > 1 && (temp & 3) == 0) {
            temp = temp >> 2;
        }

        if (temp == 1) {
            powerOf4 = true;
        }

        if (powerOf4) {
            System.out.println(num + " is a power of 4.");
        } else {
            System.out.println(num + " is not a power of 4.");
        }
        int toggled = num ^ (1 << 2);

        System.out.println("Number after toggling 3rd bit: " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {

            int result = num * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                break;
            }

            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();
    }
}