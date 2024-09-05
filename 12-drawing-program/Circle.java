public class Circle extends Shape
     implements Colorable {
    private double radius;
    private String color;
    public Circle() {
        super();
        radius = 0.0; // by default, all numbers have an inital value of 0
    }

    public Circle(String name, double y, double x, double radius) {
        super(name, y, x);
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
