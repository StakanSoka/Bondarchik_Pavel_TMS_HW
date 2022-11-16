package lesson7.task1;

class Rectangle extends Figure {

    private double a;
    private double b;

    @Override
    double calculateSquare() {
        return a * b;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (a + b);
    }

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

}
