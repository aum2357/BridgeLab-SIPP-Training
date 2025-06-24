public class Product {
    // Instance Variables
    private String productName;
    private double price;
    // Class Variable
    private static int totalProducts = 0;
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    // Class Method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    // Main Method
    public static void main(String[] args) {
       // Creating Product instances
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 850.50);

        // Displaying Product Details
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying Total Number of Products
        Product.displayTotalProducts();
    }
}
