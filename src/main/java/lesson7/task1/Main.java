package lesson7.task1;

/*
1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра. Площадь треугольника по формуле Герона.
Создать массив из 5 фигур.
Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.
 */

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(1, 2, 2.5),
                new Rectangle(2, 3),
                new Circle((5)),
                new Rectangle(10, 12.5),
                new Circle(56)
        };

        double squareSum = 0;
        double perimeterSum = 0;

        for (Figure figure : figures) {
            squareSum += figure.calculateSquare();
            perimeterSum += figure.calculatePerimeter();
        }

        System.out.println("The total square sum of the figures: " + Math.round(squareSum * 1e2) / 1e2);
        System.out.println("The total perimeter sum of the figures: " + Math.round(perimeterSum * 1e2) / 1e2);

    }

}
