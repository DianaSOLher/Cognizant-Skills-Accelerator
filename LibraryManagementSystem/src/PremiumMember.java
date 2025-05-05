import java.util.ArrayList;
import java.util.List;

public class PremiumMember extends Member{
    private boolean isPremium;
    private final int BOOKS_AVAILABLE = 3;

    //Default constructor
    public PremiumMember(){
        super.name = "";
        super.memberID = "";
        super.borrowedBooks = new ArrayList<>(BOOKS_AVAILABLE);
        isPremium = true;
    }

    //Constructor Parameterized
    public PremiumMember(String name, String memberID){
        super.name = name;
        super.memberID = memberID;
        super.borrowedBooks = new ArrayList<>(BOOKS_AVAILABLE);
        isPremium = true;
    }

    //GETTER & SETTER
    public boolean getIsPremium(){
        return isPremium;
    }

    public void setIsPremium(boolean isPremium){
        this.isPremium = isPremium;
    }

    public void addBookBorrowed(Book book){
        if (getBorrowedBooks().size() < BOOKS_AVAILABLE){
            borrowedBooks.add(book);
            book.setAvailability(false);
        }else if (getBorrowedBooks().size() >= BOOKS_AVAILABLE){
            System.out.println("YOU HAVE REACH MAXIMUM SIZE OF BOOKS TO BORROW: " + getBorrowedBooks().size());
        }
    }

}
