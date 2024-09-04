public class Product {
    // private means only the class itself can access
    // (will also reject children classes)
    // protected: share with the children
    protected String name;
    protected double price;
    protected String sku;

    public Product() {
        this.name = "N/A";
        this.price = 0;
        this.sku = "N/A";
    }
 
    public Product(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    
}
