package lesson8_5.task1;

class Subject {

    private String name;
    private final Id id;

    public Subject(String name) {
        this.name = name;
        id = new Id();
    }

    public int getId() {
        return id.getPersonalId();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
