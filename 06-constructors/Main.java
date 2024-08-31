public class Main {
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
       
        System.out.println("Employee e1");
        System.out.println(e1.getName());
        System.out.println(e1.getTitle());
        System.out.println(e1.getSalary());

        Employee e2 = new Employee("Tan Ah Kow", "Manager", 3500);
        System.out.println("Employee e2:");
        System.out.println(e2.getName());
        System.out.println(e2.getTitle());
        System.out.println(e2.getSalary());

        Employee e3 = new Employee("Jon Snow", "Lord Commander");
    }
}

class Employee {
    // Name by default should be "N/A"
    // Title by default should be "Recuritee"
    // Salary by default should be 200
    private String name;
    private String title;
    private double salary;

    // the constructor is a SPECIAL method
    // it is automatically called when a new
    // instance of a class is created
    // - the return type is the same as the class
    // - the name is the same as the class
    // the default constructor is called when we create an instance of a class
    public Employee() {
        this.name = "N/A";
        this.title = "recuritee";
        salary = 200; // the `this` is not needed
    }

    // OVERLOADED CONSTRUCTOR
    // in a class, we can have more than one variant of constructor
    // each constructor is differentiated by having number parameters
    // treat it as : constructor + setter
    public Employee(String newName, String newTitle, double salary) {
        name = newName;
        title = newTitle;
        this.salary = salary;
    }

    // as long as the signature of the method is different (the order of the parameter matters, but NOT the name), 
    // Java will treat it as overloaded
    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
        salary = 200;
    }

    public String getName() {
        return this.name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}