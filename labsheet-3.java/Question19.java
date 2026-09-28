public class Question19 {
    public static void main(String[] args) {

        int[][] array = new int[3][];

        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        array[0][0] = 10;
        array[0][1] = 20;

        array[1][0] = 30;
        array[1][1] = 40;
        array[1][2] = 50;

        array[2][0] = 60;
        array[2][1] = 70;
        array[2][2] = 80;
        array[2][3] = 90;

        System.out.println("Jagged Array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}