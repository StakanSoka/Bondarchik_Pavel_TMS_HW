package lesson8.task1;

class Contact {

    private String name;
    private Number number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    Contact(String name, Number number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "\n" + number;
    }

}
