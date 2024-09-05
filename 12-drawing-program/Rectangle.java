public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String name, double y, double x, double length, double width) {
        super(name, y, x);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // putting the @Override for overriden methods
    // is OPTIONAL. It reminds us that this is an overriden method
    // and second if somehow the method is not overriden at all, we get an error
    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    
}
