
import java.util.List;          // For lists of books, members, etc.
import java.util.ArrayList;     // For creating ArrayList instances
import java.util.Date;          // For date handling


public class Library {

    private String name;
    private List<Librarian> librarians;
    private List<Member> members;
    private List<Book> books;
    private BorrowingSystem borrowingSystem;

    public Library(String name) {
        this.name = name;
        this.librarians = new ArrayList<>();
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
        this.borrowingSystem = new BorrowingSystem();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public BorrowingSystem getBorrowingSystem() {
        return borrowingSystem;
    }
}
