package lesson6.task1;

class CreditCard {

    private int accountCode;
    private int balance;

    boolean addMoney (int sum) {
        boolean wasOperationCompleted = true;

        if (sum < 0) wasOperationCompleted = false;
        else balance += sum;

        return wasOperationCompleted;
    }

    boolean withdrawMoney (int sum) {
        boolean wasOperationCompleted = true;

        if (balance < sum && sum > 0) wasOperationCompleted = false;
        else balance -= sum;

        return wasOperationCompleted;

    }

    void printCardInformation () {
        System.out.println(this);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Account code: " + accountCode + "\nBalance: " + balance;
    }

    CreditCard (int accountCode, int balance) {
        this.accountCode = accountCode;
        this.balance = balance;

    }

    CreditCard (int accountCode) {
        this.accountCode = accountCode;
    }

    CreditCard () {
        this.balance = 0;
        this.accountCode = 0;
    }

}
