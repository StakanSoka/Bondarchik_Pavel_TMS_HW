package lesson7.task1;

class Circle extends Figure {

    private double r;

    @Override
    double calculateSquare() {
        return r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    Circle(double r) {
        this.r = r;
    }

}
