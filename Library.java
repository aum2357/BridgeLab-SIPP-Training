import java.util.*;

public class Library {

    static class BookInfo {
        String author;
        String genre;

        public BookInfo(String author, String genre) {
            this.author = author;
            this.genre = genre;
        }
    }

    static class BookEntry {
        String name;
        BookInfo info;

        public BookEntry(String name, BookInfo info) {
            this.name = name;
            this.info = info;
        }

        public String toString() {
            return name + " by " + info.author;
        }
    }
    static HashMap<String, LinkedList<BookEntry>> library = new HashMap<>();
    static HashSet<String> bookSet = new HashSet<>();

    public static void addBook(String name, String author, String genre) {
        if (bookSet.contains(name)) {
            System.out.println("Book already exists.");
            return;
        }

        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(new BookEntry(name, new BookInfo(author, genre)));
        bookSet.add(name);
        System.out.println("Book added: " + name);
    }

    public static void findBook(String name) {
        for (LinkedList<BookEntry> list : library.values()) {
            for (BookEntry b : list) {
                if (b.name.equals(name)) {
                    System.out.println("Found: " + b.name);
                    System.out.println("Author: " + b.info.author);
                    System.out.println("Genre: " + b.info.genre);
                    return;
                }
            }
        }
        System.out.println("Book not found: " + name);
    }

    public static void removeBook(String name) {
        for (String genre : library.keySet()) {
            LinkedList<BookEntry> list = library.get(genre);
            for (BookEntry b : list) {
                if (b.name.equals(name)) {
                    list.remove(b);
                    bookSet.remove(name);
                    System.out.println("Book removed: " + name);
                    return;
                }
            }
        }
        System.out.println("Book not found to remove: " + name);
    }

    public static void showLibrary() {
        for (String genre : library.keySet()) {
            System.out.println("Genre: " + genre);
            for (BookEntry b : library.get(genre)) {
                System.out.println(" - " + b);
            }
        }
    }

    public static void main(String[] args) {
        addBook("C", "Dennis Ritchie", "Programming");
        addBook("Java", "James Gosling", "Programming");
        addBook("C", "Another Author", "Programming"); // duplicate
        addBook("DSA", "Narasimha Karumanchi", "Algorithms");

        System.out.println();
        findBook("Java");
        findBook("Python");

        System.out.println();
        showLibrary();

        System.out.println();
        removeBook("C");
        removeBook("C");

        System.out.println();
        showLibrary();
    }
}
