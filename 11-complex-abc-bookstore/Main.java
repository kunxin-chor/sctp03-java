import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // display the menu and make sure the user enters between 1 to 3
    public static int displayMenu() {

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Edit Product");
            System.out.println("4. Quit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                return choice;
            } else {
                System.out.println("Invalid choice. Please choose between 1 to 3");
            }
        }
    }

    public static void main(String args[]) {

        // We create an ArrayList that can store Product
        // (when we create a class, that class is also considered as a data type)
        ArrayList<Product> catalog = new ArrayList<Product>();
        do {
            int choice = displayMenu();
            if (choice == 1) {
                addNewProduct(catalog);
            }
            if (choice == 2) {
                displayAllProducts(catalog);
            }
            if (choice == 3) {
                editProduct(catalog);
            }
            if (choice==4) {
                break;
            }
        } while (true);
    }

    public static void displayAllProducts(ArrayList<Product> catalog) {
        System.out.println("List all products");
        for (Product p : catalog) {
            System.out.println(p.report());
        }
    }

    public static void addNewProduct(ArrayList<Product> catalog) {
        System.out.println("Add new product");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of product to create");
        System.out.println("D for digital or P for physical");

        String productType = sc.nextLine();
        while (!productType.toUpperCase().equals("D") && !productType.toUpperCase().equals("P")) {
            System.out.println("Enter the type of product to create");
            System.out.println("D for digital or P for physical");
            productType = sc.nextLine();

        }

        // ask the user to enter details for parent Product class
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // get rid of the buffered \n
        
        System.out.print("Enter SKU: ");
        String sku = sc.nextLine();

        // create a placeholder and set it to empty
        Product newProduct = null;

        if (productType.toUpperCase().equals("D")) {
            // ask the user for information pertaining to the digital product
            System.out.print("Enter the file format: ");
            String fileFormat = sc.nextLine();

            System.out.println("Enter the file size");
            int filesize = sc.nextInt();
            // consume the buffered \n
            sc.nextLine();

            System.out.print("Enter the file name");
            String filename = sc.nextLine();

            // the `newProduct` is the placeholder that we have created before the `if`
            newProduct = new DigitalProduct(name, price, sku, fileFormat, filesize, filename);


        } else if (productType.toUpperCase().equals("P")) {
            // ask the user for the information needed to create a physical product
            System.out.print("Enter the starting stock: ");
            
            int stock = sc.nextInt();
        
            double weight = sc.nextDouble();

            newProduct = new PhysicalProduct(name, price, sku, stock, weight);

        }
        catalog.add(newProduct);
    }


    public static void editProduct(ArrayList<Product> catalog) {

        // 1. ask the user to select which product to edit
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(i + ": " + catalog.get(i).getName());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to edit: ");
        int productIndex = sc.nextInt();

        // 2. base on the product, we will ask the questions for 
        // the new values for the product
        Product productToEdit = catalog.get(productIndex);
        productToEdit.edit();

    }
}
