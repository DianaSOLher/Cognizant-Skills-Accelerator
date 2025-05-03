import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberID;
    private List<Book> borrowedBooks;

    //Default Constructor
    public Member(){
        name = "";
        memberID = "";
        borrowedBooks = new ArrayList<>();
    }
    //Parameterized Constructor
    public Member(String name, String memberID, List<Book> borrowedBooks) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = borrowedBooks;
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
}
