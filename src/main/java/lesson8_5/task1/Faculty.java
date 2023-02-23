package lesson8_5.task1;

class Faculty {

    private final Id id = new Id();
    private String name;
    private Professor[] professors;
    private Subject[] subjects;
    private int professorsSize = 0;
    private int professorsCapacity = 1;

    public Faculty(Subject[] subjects, String name) {
        this.subjects = subjects;
        this.name = name;
        professors = new Professor[professorsCapacity];
    }

    public int getId() {
        return id.getPersonalId();
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    private boolean isProfessorAtFaculty(Professor professor) {
        if (professor == null) return false;

        for (int i = 0; i < professorsSize; i++) {
            if (professors[i].getId() == professor.getId()) return true;
        }

        return false;
    }

    private void increaseProfessorsCapacity() {
        professorsCapacity *= 2;

        Professor[] increasedProfessors = new Professor[professorsCapacity];
        System.arraycopy(professors, 0, increasedProfessors, 0, professors.length);

        professors = increasedProfessors;
    }

    public void addProfessor(Professor professor) {
        if (isProfessorAtFaculty(professor)) {
            System.out.println(professor.getFullName() + " has already been at the faculty " + name);
            return;
        }

        if (professorsSize == professorsCapacity) increaseProfessorsCapacity();
        professors[professorsSize] = professor;
        professorsSize++;
    }

    public void printInformation() {
        System.out.println("Name : " + name);

        System.out.print(name + "'s subjects : ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ", ");
        }
        System.out.println("\b\b");

        System.out.println(name + "'s professors : ");
        for (int i = 0; i < professorsSize; i++) {
            System.out.println("\t" + professors[i].getFullName());
        }
        System.out.println();
    }
}
