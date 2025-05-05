import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    String ISBN;
    boolean availability;

    //Default Constructor
    public Book(){
        title = "";
        author = "";
        ISBN = "";
        availability = true;
    }
    //Parameterized Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        availability = true;
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

    @Override
    public String toString(){
        return "Title: " + getTitle() + " Author: " + getAuthor() + " ISBN: "+ getISBN() +" Availability: "+ getAvailability() + "\n";
    }
}
