package lesson9.generaltask;

import java.util.Random;

public class DoubleVector {

    private double x;
    private double y;
    public static final String INFORMATION = "Это вектор для двумерной системы координат";

    public DoubleVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double calculateScalar(DoubleVector vector) {
        return x * vector.x + y * vector.y;
    }

    public DoubleVector calculateSum(DoubleVector vector) {
        return new DoubleVector(x + vector.x, y + vector.y);
    }

    public DoubleVector calculateDifference(DoubleVector vector) {
        return new DoubleVector(x - vector.x, y - vector.y);
    }

    public static DoubleVector[] createRandomVectors(int n) {
        DoubleVector[] vectors = new DoubleVector[n];
        Random random = new Random();

        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new DoubleVector(random.nextDouble(100), random.nextDouble(100));
        }

        return vectors;
    }

    public static boolean compare(DoubleVector vector1, DoubleVector vector2) {
        return vector1.x == vector2.x && vector1.y == vector2.y;
    }

    public boolean compare(DoubleVector vector) {
        return x == vector.x && y == vector.y;
    }

    public void printInformation() {
        System.out.println(INFORMATION);
        System.out.println("x = " + x + "\ny = " + y);
    }
}
