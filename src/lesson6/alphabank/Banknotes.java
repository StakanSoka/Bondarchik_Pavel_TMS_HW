package lesson6.alphabank;

public class Banknotes {
    //Banknotes numbers
    final int[] nominalCollection;
    //Indexes in the array
    final int NOMINAL_NUMBER = 6;
    final int NOMINAL1 = 0;
    final int NOMINAL5 = 1;
    final int NOMINAL10 = 2;
    final int NOMINAL20 = 3;
    final int NOMINAL50 = 4;
    final int NOMINAL100 = 5;

    boolean addMoney(int sum, int maxNominal) { // maxNominal - index of nominalCollection
        if (sum == 0) return true;
        if (maxNominal < 0) return false;
        if (getNominalCost(maxNominal) > sum) return addMoney(sum, maxNominal - 1);

        nominalCollection[maxNominal]++;
        if (addMoney(sum - getNominalCost(maxNominal), maxNominal)) return true;
        nominalCollection[maxNominal]--;
        return false;
    }

    boolean withdrawMoney(int sum, int maxNominal) {
        if (sum == 0) return true;
        if (maxNominal < 0) return false;
        if (nominalCollection[maxNominal] == 0 || getNominalCost(maxNominal) > sum)
            return withdrawMoney(sum, maxNominal - 1);

        nominalCollection[maxNominal]--;
        if (withdrawMoney(sum - getNominalCost(maxNominal), maxNominal)) return true;
        nominalCollection[maxNominal]++;
        return false;
    }

    int getNominalCost(int nominal) {
        int nominalCost;
        switch (nominal) {
            case NOMINAL1 -> nominalCost = 1;
            case NOMINAL5 -> nominalCost = 5;
            case NOMINAL10 -> nominalCost = 10;
            case NOMINAL20 -> nominalCost = 20;
            case NOMINAL50 -> nominalCost = 50;
            case NOMINAL100 -> nominalCost = 100;
            default -> nominalCost = 0;
        }

        return nominalCost;
    }

    public Banknotes() {
        nominalCollection = new int [NOMINAL_NUMBER];
        /*
        nominalCollection[NOMINAL100] = 1;
        nominalCollection[NOMINAL50] = 5;
        nominalCollection[NOMINAL20] = 10;
        nominalCollection[NOMINAL10] = 20;
        nominalCollection[NOMINAL5] = 50;
        nominalCollection[NOMINAL1] = 100;
        */
    }

    @Override
    public String toString() {
        String totalString = "";
        for(int i = 0; i < nominalCollection.length; i++) {
            totalString += getNominalCost(i) + " - " + nominalCollection[i] + "\n";
        }
        return "nominal - banknotes\n" + totalString;
    }
}
