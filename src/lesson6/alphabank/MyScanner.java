package lesson6.alphabank;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyScanner {

    final private Scanner scanner;

    int readIntegerNumber(int minNumber, int maxNumber) {
        int usersNumber;
        while (true) {
            try {
                usersNumber = scanner.nextInt();
                if (usersNumber < minNumber || usersNumber > maxNumber) throw new Exception();
                return usersNumber;
            } catch (InputMismatchException exception) {
                System.out.println("Line \"" + scanner.nextLine() + "\" doesn't support... ");
            } catch (Exception exception) {
                System.out.println("Error... You out of the range... ");
            }
            System.out.println("Enter an integer number from " + minNumber + " to " + maxNumber);
        }
    }

    int readIntegerNumber() {
        int usersNumber;
        while (true) {
            try {
                usersNumber = scanner.nextInt();
                return usersNumber;
            } catch (InputMismatchException exception) {
                System.out.println("Line \"" + scanner.nextLine() + "\" doesn't support... ");
            }
            System.out.println("Enter an integer number");
        }
    }

    MyScanner() {
        scanner = new Scanner(System.in);
    }
}
