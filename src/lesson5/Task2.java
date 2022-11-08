package lesson5;

/*
2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8.
С помощью циклов задать элементам циклам значения B(Black) или W(White). Результат работы программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
*/

class Task2 {

    final int BOARD_SIZE = 8; // chess board is 8x8
    final String ODD = "B";
    final String EVEN = "W";

    void fill (String[][] board) {
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) board[i][j] = EVEN;
                else board[i][j] = ODD;
            }
        }
    }

    void print (String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    Task2() {
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

        fill(board);
        print(board);
    }

}
