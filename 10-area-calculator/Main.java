import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Spongebob", 10));
        shapes.add(new Square("CitySquare Mall", 25));
        shapes.add(new Circle("Circle Line", 100));

        for (Shape s: shapes) {
            System.out.println("Area of " + s.getName() + " is " + s.calculateArea());
        }
    }
}
