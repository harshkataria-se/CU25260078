import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);

        sc.close();
    }
}