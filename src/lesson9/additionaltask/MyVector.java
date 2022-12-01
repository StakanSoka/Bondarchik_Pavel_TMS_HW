package lesson9.additionaltask;

/*
Основное задание
1. Создайте класс, который описывает вектор в двумерной системе координат.
Создайте класс, который описывает вектор в трехмерной системе координат.
У каждого класса должны быть:
- конструктор с параметрами в виде списка координат (например, x, y, z);
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
- метод, вычисляющий скалярное произведение;
- метод сложения векторов;
- метод разности векторов;
- статический метод, который принимает целое число N, и
возвращает массив случайных векторов размером N.
Предусмотреть метод сравнение векторов.
Предусмотреть метод для вывода информации о векторе.
Каждый из классов должен иметь константу, содержащею описание вектора.
Например, "Это вектор для двумерной системы координат".
Эта константа так же должна выводиться в методе для вывода информации о векторе.
Дополнительное задание
2. Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
Для этого в классе вектор для хранения координат следует использовать массив.
 */

import java.util.Arrays;
import java.util.Random;

public class MyVector {

    private final double[] x;
    private final String DIMENSION_INFORMATION;

    public MyVector(int dimension) {
        x = new double[dimension];
        DIMENSION_INFORMATION = "This is " + dimension + " - dimensional vector";
    }

    public MyVector(double ... values) {
        x = values;
        DIMENSION_INFORMATION = "This is " + x.length + " - dimensional vector";
    }

    public double calculateModule() {
        double module = 0;

        for (double value : x) {
            module += value * value;
        }

        return Math.sqrt(module);
    }

    public double calculateScalar(MyVector vector) {
        if (vector == null) {
            System.out.println("Difference Method has gotten a null vector"); // Here must be an exception
            return 0;
        }
        double scalar = 0;

        if (x.length != vector.x.length) {
            System.out.println("Vector's dimensions are not the same!"); // Here must be an exception
            return 0;
        }

        for (int i = 0; i < x.length; i++) {
            scalar += x[i] * vector.x[i];
        }

        return scalar;
    }

    public void sum(MyVector vector) {
        if (vector == null) {
            System.out.println("Difference Method has gotten a null vector"); // Here must be an exception
            return;
        }
        if (vector.x.length != x.length) {
            System.out.println("Vector's dimensions are not the same!"); // Here must be an exception
            return;
        }

        for (int i = 0; i < x.length; i++) {
            x[i] += vector.x[i];
        }
    }

    public void difference(MyVector vector) {
        if (vector == null) {
            System.out.println("Difference Method has gotten a null vector"); // Here must be an exception
            return;
        }
        if (vector.x.length != x.length) {
            System.out.println("Vector's dimensions are not the same!"); // Here must be an exception
            return;
        }

        for (int i = 0; i < x.length; i++) {
            x[i] -= vector.x[i];
        }
    }

    public static MyVector sum(MyVector vector1, MyVector vector2) {
        if (vector1 == null || vector2 == null) return null;
        if (vector1.x.length != vector2.x.length) {
            System.out.println("Vector's dimensions are not the same!"); // Here may be an exception
            return null;
        }

        MyVector searchableVector = new MyVector(vector1.x.length);

        for (int i = 0; i < searchableVector.x.length; i++) {
            searchableVector.x[i] = vector1.x[i] + vector2.x[i];
        }

        return searchableVector;
    }

    public static MyVector difference(MyVector target, MyVector vector) {
        if (target == null || vector == null) return null;
        if (target.x.length != vector.x.length) {
            System.out.println("Vector's dimensions are not the same!"); // Here may be an exception
            return null;
        }

        MyVector searchableVector = new MyVector(target.x.length);

        for (int i = 0; i < searchableVector.x.length; i++) {
            searchableVector.x[i] = target.x[i] - vector.x[i];
        }

        return searchableVector;
    }

    public static MyVector[] createRandomVectors(int dimension, int vectorNumber, double from, double to) {
        if (dimension <= 0 || vectorNumber <= 0) return null; // here may be an exception
        MyVector[] searchableVectors = new MyVector[vectorNumber];
        Random random = new Random();

        for (int i = 0; i < searchableVectors.length; i++) {
            searchableVectors[i] = new MyVector(dimension);

            for (int j = 0; j < dimension; j++) {
                searchableVectors[i].x[j] = random.nextDouble(from, to);
            }
        }

        return searchableVectors;
    }

    public MyVector[] createRandomVectors(int dimension, int vectorNumber) {
        return createRandomVectors(dimension, vectorNumber, 0, 1); // basic range
    }

    public boolean compare(MyVector vector) {
        if (vector == null || x.length != vector.x.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != vector.x[i]) return  false;
        }

        return true;
    }

    public void printInformation() {
        System.out.println(DIMENSION_INFORMATION);
        System.out.println("Coordinates: " + Arrays.toString(x));
    }
}
