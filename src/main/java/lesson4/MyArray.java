package lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyArray {

    private static int findMin(int[] array, int firstRange, int lastRange) {
        int min = array[firstRange];
        int minIndex = firstRange;
        for (int i = firstRange + 1; i < lastRange; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void bubbleSort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            int end = array.length - i;
            isSorted = true;
            for (int j = 1; j < end; j++) {
                if (array[j - 1] > array[j]) {
                    MyArray.swap(array, j - 1, j);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    static void selectionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = findMin(array, i, array.length);
            if (minIndex != i) {
                MyArray.swap(array, i, minIndex);
            }
        }
    }

    static boolean isNumberIn(int[] array, int checkedNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkedNumber) return true;
        }
        return false;
    }

    static void fillArray(int[] array, int rangeFirst, int rangeLast) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * rangeLast) + rangeFirst;
        }
    }

    static int enteringUsersIntegerNumber() {
        Scanner scanner = new Scanner(System.in);
        int usersNumber;

        while (true) {
            try {
                System.out.print("Enter an integer number: ");
                usersNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("\"" + scanner.nextLine() + "\" isn't supported. Enter an integer number!");
            }
        }

        return usersNumber;
    }

    static int calculateArithmeticMean(int[] array) {
        int arithmeticMean = 0;
        for (int i = 0; i < array.length; i++) {
            arithmeticMean += array[i];
        }
        return arithmeticMean / array.length;
    }

    static void swap(int[] array, int first_i, int second_i) {
        int save_value = array[first_i];
        array[first_i] = array[second_i];
        array[second_i] = save_value;
    }

}