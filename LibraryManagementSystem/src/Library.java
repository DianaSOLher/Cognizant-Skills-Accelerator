import java.util.ArrayList;
import java.util.Arrays;
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

    public void borrowBook(Member member, Book book){
        if (book.getAvailability()){
            System.out.println("Member: " +member.getName()+ " is requesting Book "+ book.getTitle() + " available");
            member.addBookBorrowed(book);
        }else {
            System.out.println("Member: " + member.getName()+ " could not borrow Book "+ book.getTitle()+ " is not available");
        }
    }
    //METODO MAIN
    public static void main(String[] args){
        System.out.println("-- LIBRARY MANAGEMENT SYSTEM --");

        Library library = new Library();

        Book libro1 = new Book("Titulo 1", "Autor 1", "ISBN 1");
        Book libro2= new Book("Titulo 2", "Autor 2", "ISBN 2");
        Ebook libro3 = new Ebook("Titulo 3", "Autor 1", "ISBN 3", "PDF", 1000.19);
        Ebook libro4 = new Ebook("Titulo 4", "Autor 2", "ISBN 4", "PDF", 2132.66);
        Book libro5 = new Book("Titulo 5", "Autor 1", "ISBN 5");

        library.addBooks(libro1);
        library.addBooks(libro2);
        library.addBooks(libro3);
        library.addBooks(libro4);
        library.addBooks(libro5);

        System.out.println("BOOKS IN LIBRARY: ");
        System.out.println(library.getBooks());

        //Adding members:
        Member member1 = new Member("Viridiana", "SOHV00921");
        PremiumMember member2 = new PremiumMember("Jurian", "JGL00921");
        Member member3 = new Member("Diego", "DZY00921");
        PremiumMember member4 = new PremiumMember("Manuel", "MMS00921");
        Member member5 = new Member("Enrique", "ESL00921");

        //REGISTERING MEMBERS:
        library.registerMembers(member1);
        library.registerMembers(member2);
        library.registerMembers(member3);
        library.registerMembers(member4);
        library.registerMembers(member5);

        System.out.println("REGISTERED MEMBERS: ");
        System.out.println(library.getMembers());

        //BORROWING BOOKS
        //MEMBER
        library.borrowBook(member1, libro1);
        library.borrowBook(member1, libro2);
        library.borrowBook(member1, libro3);
        System.out.println("MEMBER: " +member1.getName() + " BOOKS BORROWED: \n"+ member1.getBorrowedBooks());
        //PREMIUM MEMBER:
        library.borrowBook(member2, libro1);// BOOK is not available
        library.borrowBook(member2, libro2);// BOOK is not available
        library.borrowBook(member2, libro3);// BOOK is available
        library.borrowBook(member2, libro4);// BOOK is available
        library.borrowBook(member2, libro5);// BOOK is available
        System.out.println("PREMIUM MEMBER: " +member2.getName() + " BOOKS BORROWED: \n"+ member2.getBorrowedBooks());

        System.out.println("BOOKS IN LIBRARY: ");
        System.out.println(library.getBooks());
        System.out.println("REGISTERED MEMBERS: ");
        System.out.println(library.getMembers());

    }

}
