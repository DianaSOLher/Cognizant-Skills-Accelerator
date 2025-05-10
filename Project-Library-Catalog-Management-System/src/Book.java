public class Book {
    protected String bookID;
    protected String title;
    protected String author;
    protected String genre;
    protected boolean availability;

    //Constructor
    public Book(){
        bookID = "ID-BOOK";
        title = "TITLE";
        author = "Author";
        genre = "Genre";
        availability = true;
    }

    public Book(String bookID, String title, String author, String genre, boolean availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString(){
        return "Book ID: "+ getBookID() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Genre: " + getGenre() + ", Availability: " + getAvailability();
    }
}
