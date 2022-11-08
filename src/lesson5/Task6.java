package lesson5;

/*
6. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

import java.util.Arrays;
import java.util.Random;

class Task6 {
    final int FROM = 0;
    final int TO = 10;
    final int ROW = 5;
    final int COLUMN = 5;

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

    void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    Task6() {
        int[][] matrix = new int[ROW][COLUMN];
        fillMatrix(matrix);
        System.out.println("Unsorted matrix: ");
        printMatrix(matrix);

        System.out.println("Sorted matrix: ");
        sortMatrix(matrix);
        printMatrix(matrix);
    }
}
