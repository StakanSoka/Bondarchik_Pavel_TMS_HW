package lesson8_5.task1;

class Professor extends Person {

    private Subject[] subjects;
    private Faculty[] faculties;

    public Professor(String firstName, String lastName, String patronymic, Subject[] subjects, Faculty[] faculties) {
        super(firstName, lastName, patronymic);
        this.subjects = subjects;
        this.faculties = faculties;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void printInformation() {
        System.out.println(getFullName());
        System.out.print("\tteaching faculties : ");
        for (Faculty faculty : faculties) {
            System.out.print(faculty.getName() + ", ");
        }
        System.out.println("\b\b");

        System.out.print("\tteaching subjects : ");
        for (Subject subject : subjects ) {
            System.out.print(subject + ", ");
        }
        System.out.println("\b\b\n");
    }

}
