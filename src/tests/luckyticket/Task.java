package tests.luckyticket;

class Task {

    final int DIGIT_CAPACITY = 6;
    final int FIRST_NUMBER = 1;
    final int LAST_NUMBER = (int)1e6;

    private int[] splitNumbers(int number) {
        int[] numbers = new int[DIGIT_CAPACITY];

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = number % 10;
            number /= 10;
        }

        return numbers;
    }

    private int sum(int[] array, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++) {
            result += array[i];
        }

        return result;
    }

    private boolean isLuckyNumber(int number) {
        int[] numbers = splitNumbers(number);
        int firstHalf = sum(numbers, 0, numbers.length / 2);;
        int secondHalf = sum(numbers, numbers.length / 2, numbers.length);;

        return firstHalf == secondHalf;
    }

    void start() {
        int theQuantityOfLuckyNumbers = 0;

        for (int i = FIRST_NUMBER; i < LAST_NUMBER; i++) {
            if (isLuckyNumber(i)) theQuantityOfLuckyNumbers++;
        }

        System.out.println(theQuantityOfLuckyNumbers);
    }
}