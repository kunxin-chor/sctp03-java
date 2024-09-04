// Product class is public-access, meaning
// any other classes can use it

import java.util.Scanner;

public class Product {
    protected String name;
    protected double price;
    protected String sku;

    // when a product is created
    // set its name  "N/A"
    // price to 0
    // and SKU to "N/A"
    public Product() {
        this.name = "N/A";
        this.price = 0;
        this.sku = "N/A";
    }

    // overload constructors are different variants
    // of constructors
    public Product(String name, double price, String sku) {
      
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    // only populate the name and sku properties in the object
    public Product(String name, String sku) {
        this.name = name;
        this.sku = sku;
        this.price = 0; // explictly state that we want 0 as the default value
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSKU(String sku) {
        this.sku = sku;
    }

    public String report() {
        return "Name: " + name + "\n" 
             + "SKU: " + sku + "\n"
             + "Price: " + price + "\n";
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new name for the product");
        String newName = sc.nextLine();
        this.name = newName;

        System.out.println("Enter the new price for the product");
        double newPrice = sc.nextDouble();
        sc.nextLine(); // consume the buffered new line
        this.price = newPrice;

        System.out.println("Enter the new SKU for the product");
        String sku = sc.nextLine();
        this.sku = sku;

    }

}
