import java.util.ArrayList;
import java.util.List;

public class Member {
    String name;
    String memberID;
    List<Book> borrowedBooks;
    private final int BOOKS_AVAILABLE = 2;

    //Default Constructor
    public Member(){
        name = "";
        memberID = "";
        borrowedBooks = new ArrayList<>(BOOKS_AVAILABLE);
    }
    //Parameterized Constructor
    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        borrowedBooks = new ArrayList<>(BOOKS_AVAILABLE);
    }

    //GETTER & SETTER
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMemberID(){
        return memberID;
    }

    public void setMemberID(String memberID){
        this.memberID = memberID;
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }

    //Methods
    public void addBookBorrowed(Book book){
        if (getBorrowedBooks().size() < BOOKS_AVAILABLE){
            borrowedBooks.add(book);
            book.setAvailability(false);
        }else if (getBorrowedBooks().size() >= BOOKS_AVAILABLE){
            System.out.println("YOU HAVE REACH MAXIMUM SIZE OF BOOKS TO BORROW: " + getBorrowedBooks().size());
        }
    }

    @Override
    public String toString(){
        return  getName() + " " + getMemberID() + " " + getBorrowedBooks() + "\n";
    }
}
