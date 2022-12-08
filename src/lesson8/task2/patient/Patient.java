package lesson8.task2.patient;

public class Patient {

    private String name;
    private HealingPlan healingPlan;
    private String symptom;

    public Patient(String name, String symptom) {
        this.name = name;
        this.symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public HealingPlan getHealingPlan() {
        return healingPlan;
    }

    public void setHealingPlan(HealingPlan healingPlan) {
        this.healingPlan = healingPlan;
    }
}
