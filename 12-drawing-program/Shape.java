
// if a class contains at least one abstract method, it must be become an abstract class
// (Note: it's possible for an abstract class not to have an abstract method)
// An abstract class is one that you cannot instantiate
// It is only meant for children to extend
// An abstract class that have children is known
// as an "ABC" - Abstract Base Class
public abstract class Shape implements Drawable {
    protected String name;
    protected double y; // where on the y axis
    protected double x; // where on the x axis

    public Shape() {
        name = "N/A";
    }

    public Shape(String name, double y, double x) {
        this.name = name;
        this.y = y;
        this.x = x;
    }

    // an abstract method is one that should exists on all child classes 
    // BUT the parent class has no way of writing it (i.e, there's no default implementation)
    public abstract double getPerimeter();
    public abstract double getArea();

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
