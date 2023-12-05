package main.dry;

public class Application {

    public static void violationOfDry(String[] args) {
       int[][] matrix =  {{1,2},{3,4}};
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
        int[][] matrix2 =  {{3,4},{5,6}};
        //now we are duplicating the same process from the previous iteration and we are violating the DRY Principle
        for (int[] ints : matrix2) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix =  {{1,2},{3,4}};
        printMatrix(matrix);
        int[][] matrix2 =  {{3,4},{5,6}};
        printMatrix(matrix2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
