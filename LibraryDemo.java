import java.time.LocalDate;

interface LibraryItem {
    String getTitle();
    String getAuthor();
}

interface BorrowableItem {
    LocalDate getDueDate();
    boolean isOverdue();
    double calculateFine();
}

class Book implements LibraryItem, BorrowableItem {
    private String title;
    private String author;
    private String borrowerName;
    private LocalDate borrowDate;
    private int borrowDurationInDays = 14;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void borrow(String borrowerName, LocalDate borrowDate) {
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return borrowDate.plusDays(borrowDurationInDays);
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(getDueDate());
    }

    public double calculateFine() {
        if (!isOverdue()) {
            return 0;
        }
        long daysOverdue = LocalDate.now().toEpochDay() - getDueDate().toEpochDay();
        double finePerDay = 0.50;
        return daysOverdue * finePerDay;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book1.borrow("Alice", LocalDate.of(2023, 4, 1));

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        book2.borrow("Bob", LocalDate.of(2023, 4, 10));

        System.out.println("Books in library:");
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\nBooks borrowed:");
        System.out.println(book1.getTitle() + " borrowed by " + book1.getBorrowerName() + " due on " + book1.getDueDate());
        System.out.println(book2.getTitle() + " borrowed by " + book2.getBorrowerName() + " due on " + book2.getDueDate());

        System.out.println("\nFine amounts:");
        System.out.println(book1.getTitle() + " fine: " + book1.calculateFine());
        System.out.println(book2.getTitle() + " fine: " + book2.calculateFine());
    }
}

