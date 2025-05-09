import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        String search = "";
        String type = "";
        ContactDirectory directory = new ContactDirectory();
        System.out.println("Welcome to Contact Manager:");
        do {
            System.out.println("Initial Menu: ");
            System.out.print("1. Create contact\n" +
                    "2. Update Contact \n" +
                    "3. Show Contacts sorted\n" +
                    "4. Add Contact Types\n" +
                    "5. Show Contact Types\n" +
                    "6. Search by name\n" +
                    "7. Exit\n" +
                    "Select Option: ");
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    //New contacts
                    //Adding new contacts and displaying them.
                    directory.addContact(directory.createContact(input));
                    //Sort
                    directory.sortByName();
                    System.out.println("Contact created");
                break;
                case 2:
                    //Updating a contact’s details and displaying the updated list.
                    System.out.println("Choose contact to update: ");
                    directory.showContacts();
                    System.out.println("Name: ");
                    search = input.nextLine();
                    directory.updateContact(directory.searchOrganizeByName(search), input);
                    directory.sortByName();
                break;
                case 3:
                    //Sorting the list of contacts by name and displaying them in order.
                    directory.showContacts();
                break;
                case 4:
                    System.out.print("Input unique Contact Type: ");
                    type = input.nextLine();
                    //Preventing duplicate contact types from being added.
                    directory.addContactType(type);
                break;
                case 5:
                    System.out.println("Contact Types: ");
                    System.out.println(directory.getContactTypes());
                break;
                case 6:
                    //Searching for contacts by name and displaying their information.
                    System.out.println("Input Name to search: ");
                    System.out.println("Name: ");
                    search = input.nextLine();
                    System.out.println(directory.searchOrganizeByName(search).toString());
                break;
                case 7:
                    System.out.println("Exit");
                break;
                default:
                    System.out.println("Please select a valid option");
                break;
            }
        }while (option != 7);
        input.close();
    }
}
