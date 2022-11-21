package lesson8.task2.clinic;

import lesson8.task2.doctors.*;
import lesson8.task2.patient.HealingPlan;
import lesson8.task2.patient.Patient;

public class Clinic {

    private static final int SURGEON_INDEX = 0;
    private static final int DENTIST_INDEX = 1;
    private static final int THERAPIST_INDEX = 2;

    private Doctor[] doctors = new Doctor[3]; // number of the created doctors

    public Clinic() {
        doctors[SURGEON_INDEX] = new Surgeon();
        doctors[DENTIST_INDEX] = new Dentist();
        doctors[THERAPIST_INDEX] = new Therapist();
    }

    public void generatePatientHealingPlan(Patient patient, int code) throws Exception {
        if (patient == null) throw new Exception();
        patient.setHealingPlan(new HealingPlan(code));
    }

    public void healPatient(Patient patient) throws Exception {
        if (patient == null) throw new Exception();

        switch (patient.getHealingPlan().getCode()) {
            case HealingPlan.SURGEON_CODE -> doctors[SURGEON_INDEX].heal(patient);
            case HealingPlan.DENTIST_CODE -> doctors[DENTIST_INDEX].heal(patient);
            default -> doctors[THERAPIST_INDEX].heal(patient);
        }
    }

}
