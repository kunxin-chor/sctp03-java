import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    // display the menu and make sure the user enters between 1 to 3
    public static int displayMenu() {
       
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Quit");
    
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 3) {
                return choice;
            } else {
                System.out.println("Invalid choice. Please choose between 1 to 3");
            }
        }
    }

    public static void main(String args[]) {
  
        // We create an ArrayList that can store Product
        // (when we create a class, that class is also considered as a data type)
        ArrayList<Product> catalog =  new ArrayList<Product>(); 
        do {
            int choice =  displayMenu();
            if (choice==1) {
               addNewProduct(catalog);
            }
            if (choice==2) {
               displayAllProducts(catalog);
            }
            if (choice==3) {
                break;
            }
        } while (true);
    }

    public static void displayAllProducts(ArrayList<Product> catalog){
        System.out.println("List all products");
        for (Product p : catalog) {
            System.out.println("Name: " + p.getName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("SKU: " + p.getSku());
            System.out.println();
        }
    }

    public static void addNewProduct(ArrayList<Product> catalog) {
        System.out.println("Add new product");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // get rid of the buffered \n
        System.out.print("Enter SKU: ");
        String sku = sc.nextLine();
        Product newProduct = new Product(name, price, sku);
        catalog.add(newProduct);
    }
}
