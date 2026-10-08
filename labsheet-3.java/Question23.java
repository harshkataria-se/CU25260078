import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element = " + secondLargest);
        }

        sc.close();
    }
}