package lesson7.task1;

class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    @Override
    double calculateSquare() {
        double p = calculatePerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Geron
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
