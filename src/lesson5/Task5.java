package lesson5;

import java.util.Arrays;
import java.util.Random;

/*
    5. Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

class Task5 {

    final int FROM = 0;
    final int TO = 10;
    final int ORDER = 2;

    void fillMatrix(int[][]matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(FROM, TO);
            }
        }
    }

    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    void printMatrixDiagonal(int[][] matrix) {
        System.out.print("Diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    Task5() {
        int[][] matrix = new int[ORDER][ORDER];

        fillMatrix(matrix);
        printMatrix(matrix);

        printMatrixDiagonal(matrix);
    }
}
