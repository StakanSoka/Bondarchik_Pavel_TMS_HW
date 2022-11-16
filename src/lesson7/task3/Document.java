package lesson7.task3;

import java.util.Date;

abstract class Document {

    private int documentCode;
    private Date date;

    Document(int documentCode, Date date) {
        this.documentCode = documentCode;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date: " + date + "\nDocument code: " + documentCode;
    }
}