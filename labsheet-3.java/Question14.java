import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] array = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        // Input elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements of 3-D array:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1));

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}