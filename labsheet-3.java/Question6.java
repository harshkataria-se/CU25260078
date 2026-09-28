import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of first array:");

        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.println("Elements of copied array:");

        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }

        sc.close();
    }
}