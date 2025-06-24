
public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        
    }

    public Book(final String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
