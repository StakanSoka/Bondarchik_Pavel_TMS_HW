package lesson8_5.task1;

/*
сделать универ
в нём есть разные факультеты, студенты, преподы, предметы.
у факультетов списки преподов и предметов
у студентов списки предметов и оценок по ним
у преподов списки предметов и факультетов
у универа список студентов
у всех есть поле id

реализовать приём студентов, отчисление, поиск студента по имени, фамилии, отчеству
поиск студента по имени, фамилии, отчеству, факультету
поиск студента по имени студента и имени, фамилии отчеству препода
 */

public class Main {

    public static void findStudent(University university, Student student, Professor professor) {
        Student findingStudent = university.findStudent(student.getFirstName(),
                professor.getFirstName(),
                professor.getLastName(),
                professor.getPatronymic()
        );

        if (findingStudent != null) {
            System.out.println("We have found : " + findingStudent.getFullName());
            System.out.println("Their id = " + findingStudent.getId());
        }
        else System.out.println("We have not found the student");
    }

    public static void findStudent(University university, Student student, Faculty faculty) {
        Student findingStudent = university.findStudent(student.getFirstName(),
                student.getLastName(), student.getPatronymic(), faculty
        );

        if (findingStudent != null) {
            System.out.println("We have found : " + findingStudent.getFullName());
            System.out.println("Their id = " + findingStudent.getId());
        }
        else System.out.println("We have not found the student" + student.getFullName());
    }

    public static void findStudent(University university, Student student) {
        Student findingStudent = university.findStudent(student.getFirstName(),
                student.getLastName(), student.getPatronymic()
        );
        if (findingStudent != null) {
            System.out.println("We have found : " + findingStudent.getFullName());
            System.out.println("Their id = " + findingStudent.getId());
        }
        else System.out.println("We have not found " + student.getFullName());
    }

    public static void testingFindingStudents(University university, Student student,
                                              Faculty faculty, Professor professor) {
        if (student == null) {
            System.out.println("We can not find null students...");
            return;
        }
        if (university == null) {
            System.out.println("We can not find students in null university");
            return;
        }
        if (professor == null) {
            System.out.println("We can not find students with null professor");
            return;
        }

        findStudent(university, student);
        findStudent(university, student, faculty);
        findStudent(university, student, professor);
    }

    public static void tests() {
        Subject[] subjects = new Subject[] {
                new Subject("Math"),
                new Subject("Algebra"),
                new Subject("Geometry"),
                new Subject("Deep Math"),
                new Subject("Physics"),
                new Subject("Deep physics"),
                new Subject("History"),
                new Subject("Eldritch History"),
                new Subject("PE"),
        };


        Faculty mathFaculty = new Faculty(
                new Subject[] { subjects[0], subjects[1], subjects[2], subjects[3],
                        subjects[subjects.length - 1] },
                "Math"
        );
        Faculty physicsFaculty = new Faculty(
                new Subject[] { subjects[0], subjects[1], subjects[2], subjects[4], subjects[5],
                        subjects[subjects.length - 1] },
                "Physics"
        );
        Faculty historicalFaculty = new Faculty(
                new Subject[] { subjects[6], subjects[7], subjects[subjects.length - 1] },
                "Historical"
        );


        Professor professor1 = new Professor("Анатолий", "Анатольев", "Анатольевич",
                new Subject[] { subjects[0], subjects[1], subjects[2] },
                new Faculty[] { mathFaculty, physicsFaculty }
        );
        Professor professor2 = new Professor("Профессор", "Профессов", "Профессорович",
                new Subject[] { subjects[3] },
                new Faculty[] { mathFaculty }
        );
        Professor professor3 = new Professor("Физик", "Физиков", "Физикович",
                new Subject[] { subjects[4], subjects[5] },
                new Faculty[] { physicsFaculty }
        );
        Professor professor4 = new Professor("Историк", "Историков", "Историкович",
                new Subject[] { subjects[6], subjects[7] },
                new Faculty[] { historicalFaculty }
        );
        Professor peProfessor = new Professor("Физрук", "Физрук", "Еще раз Физрук",
                new Subject[] { subjects[subjects.length - 1] },
                new Faculty[] { mathFaculty, physicsFaculty, historicalFaculty }
        );

        mathFaculty.addProfessor(professor1);
        mathFaculty.addProfessor(professor2);
        mathFaculty.addProfessor(peProfessor);

        physicsFaculty.addProfessor(professor1);
        physicsFaculty.addProfessor(professor3);
        physicsFaculty.addProfessor(peProfessor);

        historicalFaculty.addProfessor(professor4);
        historicalFaculty.addProfessor(peProfessor);


        Student student1 = new Student("Федор", "Федоров", "Федорович", mathFaculty,
                mathFaculty.getProfessors(), mathFaculty.getSubjects(), new int[] { 3, 3, 3, 3, 5 }
        );
        Student student2 = new Student("Ы", "Ыхов", "Ыхович", mathFaculty,
                mathFaculty.getProfessors(), mathFaculty.getSubjects(), new int[] { 4, 5, 3, 3, 5 }
        );
        Student student3 = new Student("Студент", "Студентов", "Студентович", mathFaculty,
                mathFaculty.getProfessors(), physicsFaculty.getSubjects(), new int[] { 3, 3, 3, 3, 5, 4 }
        );
        Student student4 = new Student("Хистори", "Хисториков", "Хисторикович",
                historicalFaculty, historicalFaculty.getProfessors(), historicalFaculty.getSubjects(),
                new int[] { 3, 3, 3 }
        );


        University university = new University("BSU",
                new Student[] { student1, student2, student3, student4 },
                new Faculty[] { mathFaculty, physicsFaculty, historicalFaculty },
                new Professor[] { professor1, professor2, professor3, professor4, peProfessor },
                subjects
        );

        university.printInformation();

        System.out.println("Removing and adding students");
        System.out.println("beginning");
        university.printStudents();
        System.out.println();
        university.removeStudent(student1);
        university.printStudents();
        System.out.println();
        university.addStudent(student1);
        university.printStudents();
        System.out.println("end\n");

        System.out.println("Faculty information:");
        mathFaculty.printInformation();

        System.out.println("Printing professors information:");
        peProfessor.printInformation();
        professor1.printInformation();

        System.out.println("Printing students information:");
        student1.printInformation();
        student4.printInformation();

        System.out.println("Testing fining systems:");
        testingFindingStudents(university, student1, mathFaculty, peProfessor);
        testingFindingStudents(university, student1, historicalFaculty, professor3);

    }

    public static void main(String[] args) {
        tests();
    }
}
