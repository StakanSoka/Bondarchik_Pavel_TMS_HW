package lesson5;

/*
    4. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */

import java.util.Arrays;
import java.util.Random;

class Task4 {

    final int FROM = 0;
    final int TO = 10;
    final int ROW = 2;
    final int COLUMN = 2;

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

   int calculateMatrixSum(int[][] matrix) {
       int sum = 0;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               sum += matrix[i][j];
           }
       }

       return sum;
   }

   Task4() {
       int[][] matrix = new int[ROW][COLUMN];

       fillMatrix(matrix);
       printMatrix(matrix);

       System.out.println("Elements sum = " + calculateMatrixSum(matrix));
   }

}
