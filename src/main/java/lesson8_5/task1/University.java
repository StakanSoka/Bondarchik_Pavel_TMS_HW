package lesson8_5.task1;

class University {

    private final Id id = new Id();
    private String name;
    private Student[] students;
    private final Faculty[] faculties;
    private final Professor[] professors;
    private final Subject[] subjects;
    private int studentsSize;
    private int studentsCapacity;

    public University(String name, Student[] students, Faculty[] faculties, Professor[] professors,
                      Subject[] subjects) {
        this.name = name;
        this.students = students;
        this.faculties = faculties;
        this.professors = professors;
        this.subjects = subjects;

        studentsCapacity = students.length;
        studentsSize = students.length;
    }

    private boolean isFacultyAsUniversity(Faculty faculty) {
        if (faculty == null) return false;

        for(Faculty universityFaculty : faculties) {
            if (universityFaculty.getId() == faculty.getId()) return true;
        }

        return false;
    }

    private boolean isStudentAtUniversity(Student student) {
        if (student == null) return false;

        for (Student universityStudent : students) {
            if (universityStudent == null) return false;
            if (universityStudent.getId() == student.getId()) return true;
        }

        return false;
    }

    private boolean isProfessorAtUniversity(Professor professor) {
        if (professor == null) return false;

        for (Professor universityProfessor : professors) {
            if (universityProfessor.getId() == professor.getId()) return true;
        }

        return false;
    }

    private int findStudentByIndex(Student student) {
        if (student == null) return -1;
        for (int i = 0; i < studentsSize; i++) {
            if (students[i].getId() == student.getId()) return i;
        }

        return -1;
    }

    private void increaseStudentsCapacity() {
        studentsCapacity *= 2;
        Student[] increasedStudents = new Student[studentsCapacity];

        if (studentsSize >= 0) System.arraycopy(students, 0, increasedStudents, 0, studentsSize);

        students = increasedStudents;
    }

    public void removeStudent(Student student) {
        int studentIndex = findStudentByIndex(student);
        if (studentIndex == -1) return;

        for (int i = studentIndex; i < studentsSize - 1; i++) {
            students[i] = students[i + 1];
        }

        studentsSize--;
    }

    public void addStudent(Student student) {
        if (isStudentAtUniversity(student)) {
            System.out.println("The student has not been added");
            return;
        }

        if (studentsCapacity == studentsSize) increaseStudentsCapacity();
        students[studentsSize] = student;
        studentsSize++;
    }

    public Student findStudent(String studentFirstName, String studentLastName, String studentPatronymic) {
        for (Student student : students) {
            if (student == null) return null;
            if (student.getFirstName().equals(studentFirstName) && student.getLastName().equals(studentLastName) &&
                student.getPatronymic().equals(studentPatronymic)) return student;
        }

        return null;
    }

    public Student findStudent(String studentFirstName, String studentLastName,
                               String studentPatronymic, Faculty faculty) {
        if (!isFacultyAsUniversity(faculty)) return null;

        for (int i = 0; i < studentsSize; i++) {
            if (students[i].getFirstName().equals(studentFirstName) &&
                    students[i].getLastName().equals(studentLastName) &&
                    students[i].getPatronymic().equals(studentPatronymic) &&
                    students[i].getFaculty().getId() == faculty.getId()
            ) return students[i];
        }

        return null;
    }

    public Student findStudent(String studentName, String professorFirstName,
                               String professorLastName, String professorPatronymic) {
        for (Student student : students) {
            if (student == null) return null;
            if (student.getFirstName().equals(studentName)) {
                for (Professor professor : student.getProfessors()) {
                    if (professor.getFirstName().equals(professorFirstName) &&
                            professor.getLastName().equals(professorLastName) &&
                            professor.getPatronymic().equals(professorPatronymic)
                    ) return student;
                }
            }
        }

        return null;
    }

    public void printStudents() {
        for (int i = 0; i < studentsSize; i++) {
            System.out.println("\t" + students[i].getFullName());
        }
    }

    public void printInformation() {
        System.out.println("University : " + name);
        System.out.print(name + "'s faculties : ");
        for (Faculty faculty : faculties) {
            System.out.print(faculty.getName() + ", ");
        }
        System.out.println("\b\b");

        System.out.println(name + "'s professors :");
        for (Professor professor : professors) {
            System.out.println("\t" + professor.getFullName());
        }

        System.out.println(name + "'s students : ");
        printStudents();

        System.out.print("\b" + name + "'s subjects : ");
        for (Subject subject : subjects) {
            System.out.print(subject.getName() + ", ");
        }
        System.out.println("\b\b\n");
    }
}
