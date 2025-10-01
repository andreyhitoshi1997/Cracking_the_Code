package Chapter_1;

/*Given an image represented by NxN matriz, where each pixel in the image is 4 bytes, write a method
* to rotate the iamge by 90 degrees. Can you do this in place?*/

public class Question1_7 {

    public static void rotateMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix.length != matrix[0].length){
            return;
        }

        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix){
            for(int val : row){
                System.out.println(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("Rotated 90 degrees clockwise:");
        printMatrix(matrix);
    }

}
