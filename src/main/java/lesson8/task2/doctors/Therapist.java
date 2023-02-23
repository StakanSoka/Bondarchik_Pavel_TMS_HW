package lesson8.task2.doctors;

import lesson8.task2.patient.Patient;

public class Therapist extends Doctor {

    @Override
    public void heal(Patient patient) {
        if (patient != null) {
            System.out.println("The Therapist has healed " + patient.getName() + "'s " + patient.getSymptom());
        }
    }

}
