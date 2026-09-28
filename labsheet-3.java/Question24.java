import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}