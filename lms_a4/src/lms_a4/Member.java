public class Member extends Person{
    private String memberID;
    private int currentBorrowedBooks;

    public Member(String name, String contactInfo, String memberID) {
        super(name, contactInfo);
        this.memberID = memberID;
        this.currentBorrowedBooks = 0;
    }

    public void borrowBook(Book book, java.util.Date borrowDate, java.util.Date dueDate) {
        System.out.println(getName() + " borrowed: " + book.getTitle());
        currentBorrowedBooks++;
    }

    // Getters and Setters
    public String getMemberID() { return memberID; }
    public int getCurrentBorrowedBooks() { return currentBorrowedBooks; }
}
