public class EBook extends Book{
    private String fileFormat;
    private double fileSize;

    public Ebook(String title, String author, String ISBN, Genre genre, String fileFormat, double fileSize) {
        super(title, author, ISBN, genre);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    // Getters and Setters
    public String getFileFormat() { return fileFormat; }
    public double getFileSize() { return fileSize; }
}
