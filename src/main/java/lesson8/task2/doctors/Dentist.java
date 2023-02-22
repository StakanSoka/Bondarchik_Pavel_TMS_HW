package lesson8.task2.doctors;

import lesson8.task2.patient.Patient;

public class Dentist extends Doctor {

    @Override
    public void heal(Patient patient) {
        if (patient != null) {
            System.out.println("The Dentist has healed " + patient.getName() + "'s " + patient.getSymptom());
        }
    }
}