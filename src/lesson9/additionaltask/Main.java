package lesson9.additionaltask;

public class Main {

    public static void main(String[] args) {
        MyVector vector1 = new MyVector(1, 2, 3, 4, 5, 6, 7);
        MyVector vector2 = new MyVector(2, 2, 2, 2, 2, 2, 2);
        MyVector vector3 = new MyVector(1, 2, 3, 4, 5, 6, 7);

        System.out.println("vector1 and vector2 information");
        vector1.printInformation();
        vector2.printInformation();

        System.out.println("\nModule vector1 = " + vector1.calculateModule());
        System.out.println("Scalar vector1 by vector2 = " + vector1.calculateScalar(vector2));

        System.out.println("\nVectors coordinates after sum: ");
        vector1.sum(vector2);
        vector1.printInformation();

        System.out.println("\nVectors coordinates after difference : ");
        vector1.difference(vector2);
        vector1.printInformation();

        System.out.println("\nCreating Vector array");
        MyVector[] vectors = MyVector.createRandomVectors(5, 7, 0, 10);
        for (MyVector vector : vectors) {
            vector.printInformation();
        }

        System.out.println("\nComparing...");
        System.out.println("vector1 and vector2 : " + vector1.compare(vector2));
        System.out.println("vector1 and vector1 : " + vector1.compare(vector1));
        System.out.println("vector 1 an vector3 : " + vector1.compare(vector3));
    }

}
