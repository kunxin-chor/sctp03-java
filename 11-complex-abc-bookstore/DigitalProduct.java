import java.util.Scanner;

public class DigitalProduct extends Product {
    private String fileFormat;
    private int fileSize;
    private String filename;

    public DigitalProduct() {
        super(); // call the parent constructor
        fileFormat = "N/A";
        fileSize = 0;
        filename = "Untitled";
    }

    public DigitalProduct(String name, double price, String sku, 
        String fileFormat, int fileSize, String filename) {
            super(name, price, sku);
            this.fileFormat = fileFormat;
            this.fileSize = fileSize;
            this.filename = filename;
    }


    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String report() {
        // super refers to the parent class
        // hence super.report() means call the `report` method in parent class
        return super.report() 
        + "File Format: " + fileFormat + "\n"
        + "File Size: " + fileSize + "\n"
        + "File Name: " + filename + "\n";
    }

    @Override
    public void edit() {
        super.edit();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new file format");
        String fileFormat = sc.nextLine();
        this.fileFormat = fileFormat;

        System.out.println("Enter the new file size: ");
        int fileSize = sc.nextInt();
        sc.nextLine(); // consume the buffered /n
        this.fileSize = fileSize;

        System.out.println("Enter the new filename: ");
        String filename = sc.nextLine();
        this.filename = filename;



    }
}
