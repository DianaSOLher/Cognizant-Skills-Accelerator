import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("-- LIBRARY MANAGEMENT SYSTEM --");
        Library library = new Library();
        do {
            //Create a menu for Member management
            System.out.println("Initial Menu: ");
            System.out.print("1. Add new Book\n" +
                    "2. View all Books \n" +
                    "3. Search book by ID\n" +
                    "4. Search book by title\n" +
                    "5. Check book availability\n" +
                    "6. Update book information\n" +
                    "7. Remove book from catalog\n" +
                    "8. Exit\n" +
                    "Select Option: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    library.addBookToHashMap(library.newBook(input));
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.println("Searching book by id .... " + library.searchBookByID(input));
                    break;
                case 4:
                    System.out.println("Searching book by title .... " + library.searchBookByTitle(input));
                    break;
                case 5:
                    System.out.println("Availability: " + library.searchBookByID(input).getAvailability());
                    break;
                case 6:
                    library.updateBook(library.searchBookByTitle(input),input);
                    break;
                case 7:
                    library.removeBook(input);
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }while (option != 8);

        input.close();
    }
}
