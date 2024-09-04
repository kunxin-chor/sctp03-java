public class Square extends Shape {
    private double length;
  
    public Square() {
        super();
        length = 1;
    }

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }
  
    // supercedes the calculateArea in the parent class
    @Override
    public double calculateArea() {
        return length * length;
    }
}
