class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

public class ClassesBookDiscountDetails {
    public static void main(String[] args) {
        Book obj4 = new Book("Othello", "William Shakespeare", 10.1);
        obj4.displayDetails();
        System.out.println("After Discount The Price is: " + obj4.applyDiscount(13));

        
    }
}
