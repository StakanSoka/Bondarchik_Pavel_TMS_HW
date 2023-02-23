package lesson8_5.task1;

abstract class Person {

    private String firstName;
    private String lastName;
    private String patronymic;
    private final Id id;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        id = new Id();
    }

    public int getId() {
        return id.getPersonalId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }
}
