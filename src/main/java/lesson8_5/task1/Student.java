package lesson8_5.task1;

class Student extends Person {

    private Faculty faculty;
    private Subject[] subjects;
    private Professor[] professors;
    private int[] subjectMarks;

    public Student(String firstName, String lastName, String patronymic, Faculty faculty, Professor[] professors,
                   Subject[] subjects, int[] subjectMarks) {
        super(firstName, lastName, patronymic);
        this.faculty = faculty;
        this.professors = professors;
        this.subjects = subjects;
        this.subjectMarks = subjectMarks;

        deleteEmptyProfessors();
        if (subjects.length != subjectMarks.length) {
            System.out.print("Error! Subjects' length is not equals to subject marks' length!!");
            System.out.println(getFullName());
        }
    }

    private int calculateNumberOfProfessors() {
        int i;
        for (i = 0; i < professors.length; i++) {
            if (professors[i] == null) return i;
        }
        return i;
    }

    private void deleteEmptyProfessors() {
        int numberOfProfessors = calculateNumberOfProfessors();
        if (numberOfProfessors == professors.length) return;

        Professor[] decreasedProfessors = new Professor[numberOfProfessors];
        for (int i = 0; i < decreasedProfessors.length; i++) {
            decreasedProfessors[i] = professors[i];
        }

        professors = decreasedProfessors;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void printInformation() {
        System.out.println(getFullName());

        System.out.println("Professors : ");
        for (Professor professor : professors) {
            System.out.println("\t" + professor.getFullName());
        }

        System.out.println("Subjects : ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("\t" + subjects[i] + " - " + subjectMarks[i]);
        }

        System.out.println();
    }
}
