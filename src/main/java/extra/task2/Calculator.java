package extra.task2;

import java.util.Scanner;

class Calculator {

    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        int arg1, arg2;

        while (true) {

            System.out.println("Enter first number");
            arg1 = scanner.nextInt();
            System.out.println("Enter second number");
            arg2 = scanner.nextInt();
            calculateSumAndPrintInRome(arg1, arg2);
        }
    }

    int calculateSumAndPrintInRome(int arg1, int arg2) {
        int result = arg1 + arg2;
        System.out.println(Converter.convertToRome(result));

        return result;
    }
}
