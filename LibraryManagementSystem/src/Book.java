import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean availability;

    //Default Constructor
    public Book(){
        title = "";
        author = "";
        ISBN = "";
        availability = true;
    }
    //Parameterized Constructor
    public Book(String title, String author, String ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    //GETTER AND SETTER
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }
}
