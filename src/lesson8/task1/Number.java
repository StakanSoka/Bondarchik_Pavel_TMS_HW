package lesson8.task1;

import lesson8.task1.utils.Constant;

import java.util.Objects;

class Number {

    private int countryCode = Constant.BELARUSIAN_COUNTRY_CODE;
    private int operatorCode = Constant.A1_OPERATOR_CODE;
    private int number;

    Number(int number) {
        this.number = number;
    }

    Number(int operatorCode, int number) {
        this(number);
        this.operatorCode = operatorCode;
    }

    Number(int countryCode, int operatorCode, int number) {
        this(operatorCode, number);
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "+" + countryCode + "-" + operatorCode + "-" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return countryCode == number1.countryCode && operatorCode == number1.operatorCode && number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, operatorCode, number);
    }
}
