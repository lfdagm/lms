import java.util.Date;

public class BorrowedHistory {
    private Book book;
    private Date borrowDate;
    private Date returnDate;

    public BorrowedHistory(Book book, Date borrowDate, Date returnDate) {
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Getters and Setter
    public Book getBook() { return book; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
}
