package lesson8.task2;

/*
Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */

import lesson8.task2.clinic.Clinic;
import lesson8.task2.patient.Patient;

public class Main {

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Patient patient1 = new Patient("Fedor", "broken leg");
        Patient patient2 = new Patient("Slavik", "toothache");
        Patient patient3 = new Patient("Roma","diarrhea");

        try {
            clinic.generatePatientHealingPlan(patient1, 1);
            clinic.generatePatientHealingPlan(patient2, 2);
            clinic.generatePatientHealingPlan(patient3, 33);

            clinic.healPatient(patient1);
            clinic.healPatient(patient2);
            clinic.healPatient(patient3);
        } catch (Exception exception) {
            System.out.println("Something got wrong...");
        }


    }

}
