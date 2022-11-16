package lesson6.task2;

class RAM {

    private String name;
    private int volume;

    RAM (String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    RAM() {
        this.name = "UNKNOWN";
        volume = -1;
    }

    @Override
    public String toString() {
        return "name: " + name + ", volume: " + volume;
    }

}
