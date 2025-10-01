package Chapter_1;

/*Write an algorithm such that if an element in MxN matrix is 0, its entire row and
* column are set to 0.*/

public class Question1_8 {
    public static void setZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix1);

        setZeros(matrix1);

        System.out.println("After setZeros:");
        printMatrix(matrix1);

        int[][] matrix2 = {
                {1, 2, 0},
                {4, 5, 6},
                {0, 8, 9},
                {10, 11, 12}
        };

        System.out.println("\nOriginal matrix 2:");
        printMatrix(matrix2);

        setZeros(matrix2);

        System.out.println("After setZeros:");
        printMatrix(matrix2);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
