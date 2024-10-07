public class Librarian extends Person{
    private String staffID;

    public Librarian(String name, String contactInfo, String staffID) {
        super(name, contactInfo);
        this.staffID = staffID;
    }

    public void addBook(String bookTitle) {
        System.out.println("Adding book: " + bookTitle);
    }

    public void removeBook(String bookTitle) {
        System.out.println("Removing book: " + bookTitle);
    }

    public void updateBookInfo(String bookTitle) {
        System.out.println("Updating book info: " + bookTitle);
    }

    // Getters and Setters
    public String getStaffID() { return staffID; }
}
