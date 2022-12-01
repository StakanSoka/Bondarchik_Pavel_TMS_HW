package lesson9.generaltask;


/* Основное задание
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
*/

import lesson9.generaltask.DoubleVector;

public class Main {
    public static void main(String[] args) {
        DoubleVector vector1 = new DoubleVector(1, 2);
        DoubleVector vector2 = new DoubleVector(2, 3);
        DoubleVector vector3 = vector1.calculateSum(vector2);
        DoubleVector vector4 = vector1.calculateDifference(vector2);
        DoubleVector vector5 = vector1;
        DoubleVector vector6 = new DoubleVector(1, 2);

        System.out.println(vector1.calculateScalar(vector2));

        DoubleVector[] vectors = DoubleVector.createRandomVectors(10);

        System.out.println(DoubleVector.compare(vector1, vector6));
        System.out.println(vector1.compare(vector6));

        vector1.printInformation();

    }
}