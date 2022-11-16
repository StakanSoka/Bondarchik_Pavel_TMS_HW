package lesson6.task2;

class Computer {

    int cost;
    String model;
    RAM ram;
    HDD hdd;

    Computer (int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    Computer (int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void printInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "cost: " + cost + "\nmodel: " + model + "\nRAM: " + ram + "\nHDD: " + hdd;
    }

}
