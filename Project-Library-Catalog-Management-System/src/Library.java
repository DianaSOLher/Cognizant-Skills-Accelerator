import java.util.*;

public class Library {
    HashMap<String, Book> booksByTitle;
    HashMap<String, Book> booksByID;
    HashSet<String> bookGenres = new HashSet<>();

    //DEFAULT CONSTRUCTOR
    public Library(){
        booksByTitle = new HashMap<>();
        booksByID = new HashMap<>();
    }
    //CONSTRUCTOR PARAMETERIZED
    public Library(HashMap<String, Book> booksByTitle, HashMap<String, Book> booksByID){
        this.booksByTitle = booksByTitle;
        this.booksByID = booksByID;
    }

    //GETTER AND SETTER
    public HashMap<String, Book> getBooksByTitle(){
        return booksByTitle;
    }

    public void setBooksByTitle(HashMap<String, Book> books){
        this.booksByTitle = books;
    }

    public HashMap<String, Book> getBooksByID() {
        return booksByID;
    }

    public void setBooksByID(HashMap<String, Book> booksByID) {
        this.booksByID = booksByID;
    }

    public HashSet<String> getBookGenres() {
        return bookGenres;
    }

    public void setBookGenres(HashSet<String> bookGenres) {
        this.bookGenres = bookGenres;
    }

    //METHODS
    public void addBookToHashMap(Book book){
        booksByTitle.put(book.getTitle(), book);
        booksByID.put(book.getBookID(), book);
    }

    public void addGenreToHashSet(String genre){
        bookGenres.add(genre.toUpperCase());
    }

    public Book searchBookByTitle(Scanner input){
        String title;
        do {
            System.out.println("Input Book title: ");
            title = input.nextLine();
            if (!isValidTitle(title)){
                System.out.println("Invalid book title Format");
            }
        }while (!isValidTitle(title));
        if (booksByTitle.containsKey(title)){
            return booksByTitle.get(title);
        }else {
            System.out.println("Book not found");
            return null;
        }

    }

    public Book searchBookByID(Scanner input){
        String bookID;
        do {
            System.out.println("Input Book ID: ");
            bookID = input.nextLine();
            if (!isValidBookID(bookID)){
                System.out.println("Invalid book id Format");
            }
        }while (!isValidBookID(bookID));
        if (booksByID.containsKey(bookID)){
            return booksByID.get(bookID);
        }else {
            System.out.println("Book not found");
            return null;
        }
    }

    public boolean searchGenre(String genre){
        for (String genres : bookGenres) {
            if (genres.equalsIgnoreCase(genre)) {
                //System.out.println("Genre: " + genre + " already exists");
                return false;
            }
        }
        return  true;
    }

    public void showBooks(){
        if (booksByID.isEmpty()) {
            System.out.println("No books in the catalog.");
            return;
        }

        System.out.println("----- Library Catalog -----");
        for (Book book : booksByID.values()) {
            System.out.println(book);
            System.out.println("---------------------------");
        }
    }

    public boolean isValidBookID(String bookID){
        return bookID.matches("B\\d{3,}");//Start with B follow by at least 3 digits
    }

    public boolean isValidTitle(String title){
        return title.matches("[A-Za-z ]{3,30}"); // Only letters and spaces, 3-30 characters
    }

    public boolean isValidAuthor(String author){
        return author.matches("[A-Za-z ]{5,40}");
    }

    public boolean isValidGenre(String genre){
        boolean validGenre = false;
        if (genre.matches("[A-Za-z ]{5,30}")){
            if (!searchGenre(genre)){
                System.out.println("Genre: " + genre + " already exists");
            }else {
                validGenre = true;
            }
        }
        return validGenre;
    }

    public String modifyBookID(Scanner input){
        String bookID;
        do {
            System.out.print("Book ID (e.g. B000): ");
            bookID = input.nextLine();
            if (!isValidBookID(bookID)){
                System.out.println("Invalid book ID Format");
            }
        }while (!isValidBookID(bookID));
        return bookID;
    }

    public String modifyBookTitle(Scanner input){
        String title;
        do {
            System.out.print("Title: ");
            title = input.nextLine();
            if (!isValidTitle(title)){
                System.out.println("Invalid book title Format");
            }
        }while (!isValidTitle(title));
        return title;
    }

    public String modifyAuthor(Scanner input){
        String author;
        do {
            System.out.print("Author: ");
            author = input.nextLine();
            if (!isValidAuthor(author)){
                System.out.println("Invalid book author Format");
            }
        }while (!isValidAuthor(author));
        return author;
    }

    public String modifyGenre(Scanner input){
        String genre;
        do {
            System.out.print("Genre: ");
            genre = input.nextLine();
            if (!isValidGenre(genre)){
                System.out.println("Invalid book genre");
            }
        }while (!isValidGenre(genre));
        return genre;
    }

    public void modifyAvailability(Book book){
        book.setAvailability(!book.getAvailability());
        System.out.println("Book availability is set to " + book.getAvailability());
    }

    public Book newBook(Scanner input){
        //VALIDATE INPUTS AS INSTRUCTIONS MENTIONED
        String bookID;
        String title;
        String author;
        String genre;
        boolean availability = true;

        System.out.println("Input the following information: ");
        bookID = modifyBookID(input);
        title = modifyBookTitle(input);
        author = modifyAuthor(input);
        System.out.print("Genre: ");
        genre = input.nextLine();

        return new Book(bookID,title,author,genre,availability);
    }

    public void updateBook(Book book, Scanner input){
        int option = 0;
        String bookID;
        String title;
        String author;
        String genre;


        System.out.println("\nUpdating " + book.toString());
        do {
            System.out.println("Choose the Book information to modify: ");
            System.out.print("1. Book ID\n" +
                    "2. Title\n" +
                    "3. Author\n" +
                    "4. Genre\n" +
                    "5. Availability\n" +
                    "6. Cancel update\n" +
                    "Option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    bookID = modifyBookID(input);
                    book.setBookID(bookID);
                    break;
                case 2:
                    title = modifyBookTitle(input);
                    book.setTitle(title);
                    break;
                case 3:
                    author = modifyAuthor(input);
                    book.setAuthor(author);
                    break;
                case 4:
                    genre = modifyGenre(input);
                    book.setGenre(genre);
                    break;
                case 5:
                    modifyAvailability(book);
                    break;
                case 6:
                    System.out.println("Exit update menu");
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("Book updated: " + book.toString());
        }while (option != 6);
    }

    public void removeBook(Scanner input){
        String bookID;
        Book book = searchBookByID(input);
        bookID = book.getBookID();
        booksByID.remove(bookID);
        booksByTitle.remove(book.getTitle());

        System.out.println("Book removed successfully: " + book.getTitle());
    }
}
