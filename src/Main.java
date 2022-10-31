import java.io.IOException;
import java.util.Scanner;
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
    } // I was bored

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int usersEnteredNumber;

        while (true) { // We are waiting for the entering an integer number
            try {
                System.out.print("Enter an integer number... ");
                usersEnteredNumber = in.nextInt();
                in.close();
                break;
            } catch (Exception exception) { // InputMismatchException quite often, but overflow is also can be
                System.out.println("The entered line \"" + in.nextLine() + "\" doesn't support. " +
                                   "You have to enter an integer value like 123, 44 etc...");
            }
        }

        int numberOfBendersQuotes = 0; // Benders number is the same as a number of group
        if (usersEnteredNumber < 15 && usersEnteredNumber > 0) {
            numberOfBendersQuotes = 1;
            System.out.println("Group 1");
        } else if (usersEnteredNumber < 30 && usersEnteredNumber >= 15) {
            numberOfBendersQuotes = 2;
            System.out.println("Group 2");
        } else if (usersEnteredNumber >= 30) {
            numberOfBendersQuotes = 3;
            System.out.println("Group 3");
        } else {
            System.out.println("The number is not in the range...");
        }

        for (int i = 0; i < numberOfBendersQuotes; i++) {
            System.out.println("We’re making beer. I’m the brewery!");
        }

        System.out.println("Ending the program...");
    }
}