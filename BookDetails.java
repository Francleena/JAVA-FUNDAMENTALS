class Book {
   
    String title;
    double price;

    public Book() {
        title = "Java Program";  
        price = 100.0;          
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayDetails();
    }
}