public class Shape {
    protected String name;
    protected double y; // where on the y axis
    protected double x; // where on the x axis

    public Shape() {
        name = "N/A";
    }

    public Shape(String name, double y, double x) {
        this.name = name;
    }

    public double getPerimeter() {
        // no idea how to calculate perimeter
        // until we know what shape this
        return 0;
    }
    public double getArea() {
        // we have no idea what
        // specific shape this will be
        // hence we cannot calculate the area
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    
}
