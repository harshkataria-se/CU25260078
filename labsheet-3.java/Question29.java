import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][];

        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[2];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter elements of row " + (i + 1) + ":");

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {

                for (int k = 0; k < array[i].length - j - 1; k++) {

                    if (array[i][k] > array[i][k + 1]) {

                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array after sorting each row:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}