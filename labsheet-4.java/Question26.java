class Matrix {
    int[][] matrix;
    static String matrixType = "2x2 Matrix";

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    void addAndSubtract(Matrix other) {
        int[][] addition = new int[2][2];
        int[][] subtraction = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                addition[i][j] = matrix[i][j] + other.matrix[i][j];
                subtraction[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        System.out.println("Addition:");

        for (int i = 0; i < 2; i++) {
            System.out.println(addition[i][0] + " " + addition[i][1]);
        }

        System.out.println("Subtraction:");

        for (int i = 0; i < 2; i++) {
            System.out.println(subtraction[i][0] + " " + subtraction[i][1]);
        }
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix Type: " + matrixType);

        m1.addAndSubtract(m2);
    }
}