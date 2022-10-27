import static java.lang.Math.*;

public class Main {
    static void printEverGreen (int size)  {
        for (int j = 0; j < size; j++) {
            System.out.print(' ');
        }
        System.out.println('*');

        for (int i = size - 1; i != 1; i--){
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j < (size - i) * 2 - 1; j++){
                System.out.print(' ');
            }
            System.out.println('*');
        }

        System.out.print(' ');
        for (int i = 0; i < size * 2; i++) {
            if (i % 2 == 0) {
                System.out.print('*');
            }
            else System.out.print(' ');
        }
    }
    public static void main(String[] args) {
        int number = 30;
        printEverGreen(number);
    }
}