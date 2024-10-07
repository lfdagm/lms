
abstract class Book {
    private String title;
    private String author;
    private String ISBN;
    private Genre genre;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, Genre genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public Genre getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
}
