// extends  means this class inherits from another class (aka parent class/superclass)
// all the attributes and methods of the parent class are also considered to be in the child class
public class PhysicalProduct extends Product {
    private double weight;
    private int stock;

    // default constructor
    // if we define a default constructor for the child
    // we have to remember to call the parent constructor as well
    public PhysicalProduct() {
        super(); // call parent constructor
        stock = 0;
        weight = 0.01;
    }

    // In a child class, the overloaded constructor
    // must also call the parent's class overload consturctor
    public PhysicalProduct(String name, double price, String sku,
        int stock, double weight) {
            super(name, price, sku);
            this.stock = stock;
            this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String report() {
        return super.report() +
         "Stock: " + stock + "\n"  +
         "Weight: " + weight + "kg\n";
    }

    public String toString() {
        return "Name: " + name + ", price: " + price + ", stock:" + stock;
    }

    
}
