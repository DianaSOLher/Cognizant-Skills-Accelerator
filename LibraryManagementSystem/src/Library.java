import java.util.ArrayList;
import java.util.List;
public class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    //DEFAULT CONSTRUCTOR
    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    //CONSTRUCTOR PARAMETERIZED
    public Library(List<Book> books, List<Member> members){
        this.books = books;
        this.members = members;
    }

    //GETTER AND SETTER
    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public List<Member> getMembers(){
        return members;
    }

    public void setMembers(List<Member> members){
        this.members = members;
    }

    //METHODS
    public void addBooks(Book book){
        books.add(book);
    }

    public void registerMembers(Member member){
        members.add(member);
    }

    public boolean borrowBook(Member member, Book book){

    }


}
