public class Main {
    public static void main(String[] args) {
        
        int x = 44;
        int y = 52;
        // Refer to the `Math` class and add addTwo
        // ONLY possible because addTwo is static
        // anything that is static belongs to the class
        int sum = Math.addTwo(x, y);

        System.out.println(Math.PI);

        Contact c1 = new Contact();
        Contact c2 = new Contact();

        System.out.println(c1.Count);
        System.out.println(c2.Count);
    }
}

class Contact {
    // if a piece of data differs from instance to instance
    // such data (where instance has its own copy) is known 'dynamic'
    private String firstName;
    private String lastName;

    // this data is belonging to the CLASS (static)
    // therefore all instances of Contact shares the same value for Count 
    public static int Count = 0;
    // the Contact constructor is called whenever a new instance of Contact is created
    public Contact() {
        Count = Count + 1;
    }
}

// static call methods and refer to variables
// without creating an instance
class Math {

    // dynamic variable if it's not static
    // if static,it means all INSTANCE of Math classes share the same PI
    // useful for sharing constant values with every other classes
    public static double PI = 3.1416;

    // A static method can be called
    // DIRECTLY FROM the class
    // (static means the member is IN THE CLASS, NOT IN THE OBJECT)
    public static int addTwo(int a, int b) {
        return a + b;
    }
}
