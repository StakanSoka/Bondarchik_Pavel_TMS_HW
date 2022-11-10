package lesson5;

/*
3. Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

class Task3 {

    final int MATRIX_ORDER = 3;

    int calculateMatrixElement(int[] row, int[][] column, int columnIndex) {
        int result = 0;
        int order = row.length;
        for(int i = 0; i < order; i++) {
            result += row[i] * column[i][columnIndex];
        }

        return result;
    }

    void multiplyMatrix(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(calculateMatrixElement(a[i], b, j) + " ");
            }
        }
    }

    Task3() {
        int[][] a = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,0,0}
        };

        int[][] b = {
                {1,2,3},
                {1,1,1},
                {0,0,0},
                {2,1,0}
        };

        multiplyMatrix(a, b);
    }
}
