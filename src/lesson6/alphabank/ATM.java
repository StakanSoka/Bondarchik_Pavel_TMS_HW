package lesson6.alphabank;

class ATM {

    final private Banknotes banknotes;
    final private MyScanner myScanner;

    void startATM() {
        int usersNumber;
        boolean isExit = false;
        final int ADD = 1;
        final int WITHDRAW = 2;
        final int CHECK_BALANCE = 3;
        final int EXIT = 4;

        while (!isExit) {
            System.out.println("""
                    Enter operation
                    1)Add money to the ATM
                    2)Withdraw money from the ATM
                    3)Check ATM's balance
                    4)Exit""");
            usersNumber = myScanner.readIntegerNumber(ADD, EXIT); // look at the previous sout
            switch (usersNumber) {

                case ADD -> {
                    System.out.println("Enter sum to add");
                    usersNumber = myScanner.readIntegerNumber();
                    banknotes.addMoney(usersNumber, banknotes.NOMINAL_NUMBER - 1);
                }

                case WITHDRAW -> {
                    System.out.println("Enter sum to withdraw");
                    usersNumber = myScanner.readIntegerNumber();
                    if (banknotes.withdrawMoney(usersNumber, banknotes.NOMINAL_NUMBER - 1)) {
                        System.out.println("You withdrew money successfully");
                    }
                    else System.out.println("The ATM doesn't have enough money... Try to withdraw a less sum...");
                }

                case CHECK_BALANCE -> System.out.println(banknotes);

                case EXIT -> isExit = true;
            }
        }

    }

    ATM () {
        banknotes = new Banknotes();
        myScanner = new MyScanner();
    }
}
