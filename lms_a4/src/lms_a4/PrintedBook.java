public class PrintedBook extends Book{
    private int pagesCount;
    private PhysicalCondition physicalCondition;

    public PrintedBook(String title, String author, String ISBN, Genre genre, int pagesCount, PhysicalCondition physicalCondition) {
        super(title, author, ISBN, genre);
        this.pagesCount = pagesCount;
        this.physicalCondition = physicalCondition;
    }

    // Getters and Setters
    public int getPagesCount() { return pagesCount; }
    public PhysicalCondition getPhysicalCondition() { return physicalCondition; }
}
