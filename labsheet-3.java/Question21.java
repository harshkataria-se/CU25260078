import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int first = array[0];

        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        array[n - 1] = first;

        System.out.println("Array after left rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}