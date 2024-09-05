public class Circle extends Shape {
    private double radius;
    public Circle() {
        super();
        radius = 0.0; // by default, all numbers have an inital value of 0
    }

    public Circle(String name, double y, double x, double radius) {
        super(name, y, x);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (22/7) * radius;
    }

    @Override
    public double getArea() {
        return (22/7) * (radius * radius);
    }
}
