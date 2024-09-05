import java.util.ArrayList;
import java.util.Scanner;

// Use case for the program
// 1. keep a list of shapes, and show their position, area and perimeter
// 2. the program must be able to support text labels
//    store all the shapes and text label in the same ArrayList
public class Main {

  

    // any member variables in the Main must be `static`
    // static methods can only access variables that are static
    private static ArrayList<Shape> drawing = new ArrayList<Shape>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        ArrayList<Drawable> canvas = new ArrayList<>();
        canvas.add(new Circle());
        canvas.add(new TextLabel());

        ArrayList<Colorable> coloredStuff = new ArrayList<>();
        coloredStuff.add(new Circle());
        coloredStuff.add(new TextLabel());
        coloredStuff.add(new Rectangle());

        while (true) {
            displayMenu();
            int choice = getMenuChoice();
            boolean keepRunning = processChoice(choice);
            if (keepRunning == false) {
                break;
            }
        }
     
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("Shape Manager");
        System.out.println("1. Add a new shape");
        System.out.println("2. List all the shapes");
        System.out.println("3. Quit");
    }

    // get the choice that the user has entered
    public static int getMenuChoice() {
        while (true) {
            System.out.print("Enter your choice (1 to 3): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the buffered /n
            // check if `choice` variable is between 1 to 3
            if (choice >= 1 && choice <= 3) {
                return choice;
            }
        }
    }

    // depending on the user has entered at the menu, do something
    // if return true, keep running the program
    // if return false, quit the program
    public static boolean processChoice(int choice) {
        if (choice==1) {
         
            System.out.print("Name of the shape: ");
            String name = sc.nextLine();

            System.out.print("Y coordinate: ");
            double y = sc.nextDouble();

            System.out.print("X coordinate");
            double x = sc.nextDouble();
            sc.nextLine(); // consume the buffered /n

            System.out.print("Enter the type of shape: c for circle, r for rectangle");
            String shapeType = sc.nextLine().toLowerCase();
            if (shapeType.equals("c")) {
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
               
                Shape newCircle = new Circle(name, y, x, radius);
                drawing.add(newCircle);

            } else if (shapeType.equals("r")) {
                System.out.print("Enter the length:");
                double length = sc.nextDouble();

                System.out.print("Enter the width: ");
                double width = sc.nextDouble();

                Shape newRectangle = new Rectangle(name, y, x, length, width);
                drawing.add(newRectangle);
            }
        } else if (choice == 2) {
            // list all the shapes
            for (Shape s : drawing) {
                System.out.println(s.getName() + " is at " + s.getY()+ ", " + s.getX());
                System.out.println("Area = " + s.getArea() + ", Perimeter = " + s.getPerimeter());
            }
        } else if (choice == 3) {
            System.out.println("Good bye.");
            return false;
        } else {
            return false;
        }

        return true; // keeps the program running
    }
}
