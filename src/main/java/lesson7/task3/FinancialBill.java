package lesson7.task3;

import java.util.Date;

public class FinancialBill extends Document implements PrintableDocument {

    double monthSum;
    int departmentCode;

    public FinancialBill(int documentCode, Date date, double monthSum, int departmentCode) {
        super(documentCode, date);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "\nThe sum of the last month: " + monthSum + "\nDepartment code: " + departmentCode;
    }
}
