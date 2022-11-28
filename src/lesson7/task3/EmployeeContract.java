package lesson7.task3;

import java.util.Date;

public class EmployeeContract extends Document implements PrintableDocument {

    String name;
    Date contractEnd;

    EmployeeContract(int documentCode, Date date, String name, Date contractEnd) {
        super(documentCode, date);
        this.name = name;
        this.contractEnd = contractEnd;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "\nName: " + name + "\nThe day of the End of the contract: " + contractEnd;
    }
}
