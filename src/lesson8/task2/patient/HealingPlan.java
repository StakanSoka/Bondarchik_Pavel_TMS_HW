package lesson8.task2.patient;

public class HealingPlan {

    public final static int SURGEON_CODE = 1;
    public final static int DENTIST_CODE = 2;

    private int code;

    public int getCode() {
        return code;
    }

    public HealingPlan(int code) {
        this.code = code;
    }

}