package lesson6.task2;

class HDD {

    private String name;
    private int volume;
    private boolean isInner;

    HDD (String name, int volume, boolean isInner) {
        this.name = name;
        this.volume = volume;
        this.isInner = isInner;
    }

    HDD () {
        this.name = "UNKNOWN";
        this.volume = -1;
    }

    @Override
    public String toString() {
        String type = isInner ? "Inner" : "external";
        return "name: " + name + ", volume: " + volume + ", HDD type: " + type;
    }

}
