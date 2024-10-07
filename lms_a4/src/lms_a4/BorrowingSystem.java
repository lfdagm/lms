public class BorrowingSystem {
    public void listBorrowedByMember(Member member) {
        System.out.println("Listing books borrowed by: " + member.getName());
    }

    public void listBorrowedByBook(Book book) {
        System.out.println("Listing borrowing history for book: " + book.getTitle());
    }
 
   public void returnBook(Book book) {
        System.out.println("Returning book: " + book.getTitle());
    }
}
