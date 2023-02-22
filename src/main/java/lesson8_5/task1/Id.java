package lesson8_5.task1;

class Id {

    private static int id = 0;
    private int personalId;

    public Id() {
        id++;
        personalId = id;
    }

    public int getPersonalId() {
        return personalId;
    }
}
