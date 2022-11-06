package lesson4;
import java.util.Arrays;

class Exercises {

    int size;
    int usersNumber;
    int rangeFirst;
    int rangeLast; // must be as 10, 100 etc.

    void startEx0() {
        int[] array = new int[size];
        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("Initialised array: " + Arrays.toString(array));

        usersNumber = MyArray.enteringUsersIntegerNumber();
        System.out.println("Your checked number is: " + usersNumber);

        if (MyArray.isNumberIn(array, usersNumber))
            System.out.println("There is " + usersNumber + " in the array.");
        else
            System.out.println("There isn't " + usersNumber + " in the array...");
    }

    void startEx1() {
        int[] array = new int[size];
        boolean[] isUsersNumber = new boolean[array.length];
        int repeats = 0;

        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("Initialised array: " + Arrays.toString(array));

        usersNumber = MyArray.enteringUsersIntegerNumber();
        if (!MyArray.isNumberIn(array, usersNumber)) {
            System.out.println("There isn't " + usersNumber + " in the array");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == usersNumber) {
                isUsersNumber[i] = true;
                repeats++;
            }
        }

        int[] copiedArray = Arrays.copyOf(array, array.length);
        array = new int[array.length - repeats];
        for (int copiedArrayI = 0, arrayI = 0; copiedArrayI < copiedArray.length; size++) {
            if (!isUsersNumber[size]) {
                array[arrayI] = copiedArray[size];
                arrayI++;
            }
        }

        System.out.println("New array: " + Arrays.toString(array));
    }

    void startEx2() {
        int min, max, average;
        int array[];
        System.out.println("Enter the size of the array");
        while (true) {
            size = MyArray.enteringUsersIntegerNumber();
            if (size <= 0) {
                System.out.println("arrays size must be an integer positive number!");
                continue;
            }
            break;
        }

        array = new int[size];
        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("array = " + Arrays.toString(array));

        int[] copiedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copiedArray);
        min = copiedArray[0];
        max = copiedArray[copiedArray.length - 1];
        average = copiedArray[copiedArray.length / 2];

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + average);
    }

    void startEx3() {
        int array1ArithmeticMean;
        int array2ArithmeticMean;
        size = 5; // our exercise demands it
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        MyArray.fillArray(array1, rangeFirst, rangeLast);
        MyArray.fillArray(array2, rangeFirst, rangeLast);

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        array1ArithmeticMean = MyArray.calculateArithmeticMean(array1);
        array2ArithmeticMean = MyArray.calculateArithmeticMean(array2);
        System.out.println("The first arrays arithmetic mean = " + array1ArithmeticMean);
        System.out.println("The second arrays arithmetic mean = " + array2ArithmeticMean);
        if (array1ArithmeticMean > array2ArithmeticMean)
            System.out.println("The first arithmetic mean is more");
        else if (array2ArithmeticMean > array1ArithmeticMean)
            System.out.println("The second arithmetic mean is more");
        else System.out.println("The arrays have the same arithmetic mean");
    }

    void startEx4() {
        int[] array1;
        int[] array2;
        int evenSize = 0;
        boolean[] isEven;
        final int MIN_SIZE = 5;
        final int MAX_SIZE = 10;

        while (true) {
            System.out.println("Enter the size of the array (" + MIN_SIZE + "; " + MAX_SIZE + "]");
            usersNumber = MyArray.enteringUsersIntegerNumber();
            if (!(usersNumber > MIN_SIZE && usersNumber <= MAX_SIZE)) {
                System.out.println("\"" + usersNumber + "\" is not valid");
                continue;
            }
            break;
        }

        array1 = new int[usersNumber];
        isEven = new boolean[array1.length];
        MyArray.fillArray(array1, rangeFirst, rangeLast);
        System.out.println("array1 = " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                evenSize++;
                isEven[i] = true;
            }
        }

        if (evenSize == 0) {
            System.out.println("There is not at least an even element in the array 1: " + Arrays.toString(array1));
            return;
        }

        array2 = new int[evenSize];
        for(int i = 0, evenArrayI = 0; i < array1.length; i++) {
            if (isEven[i]) {
                array2[evenArrayI] = array1[i];
                evenArrayI++;
            }
        }

        System.out.println("array2: " + Arrays.toString(array2));
    }

    void startEx5() {
        int[] array = new int[size];
        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("array = " + Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("array = " + Arrays.toString(array));
    }

    void startEx6() {
        String[] names = {"Вася", "Петя", "Максим", "Кирилл", "Антон", "Никита", "Наташа", "АШУРБАНАПАЛ ЯДРАКОН!"};
        System.out.println("names: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("names: " + Arrays.toString(names));
    }

    void startEx7() {
        int[] array = new int[size];
        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("Before sort. array = " + Arrays.toString(array));

        MyArray.bubbleSort(array);
        System.out.println("After sort. array = " + Arrays.toString(array));
    }

    void startSelectionSort() {
        int[] array = new int[size];
        MyArray.fillArray(array, rangeFirst, rangeLast);
        System.out.println("Before sort. array = " + Arrays.toString(array));

        MyArray.selectionSort(array);
        System.out.println("After sort. array = " + Arrays.toString(array));
    }

    Exercises() {
        size = 20;
        rangeFirst = 0;
        rangeLast = 100;
    }

}