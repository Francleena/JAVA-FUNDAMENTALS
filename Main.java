class Book {
    String title;
    String author;
    double price;
    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("java", " abc", 399.50);
        
        myBook.displayDetails();
    }
}
