import java.util.*;

public class ContactDirectory {
    List<Contact> contacts = new ArrayList<>();
    HashSet<String> contactTypes = new HashSet<>();
    HashMap<String, Contact> contactsByName = new HashMap<>();

    //Constructor
    public ContactDirectory(){
        contacts = new ArrayList<>();
        contactTypes = new HashSet<>();
        contactsByName = new HashMap<>();
    }

    //Getter & Setter
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public HashSet<String> getContactTypes() {
        return contactTypes;
    }

    public void setContactTypes(HashSet<String> contactTypes) {
        this.contactTypes = contactTypes;
    }

    public HashMap<String, Contact> getContactsByName() {
        return contactsByName;
    }

    public void setContactsByName(HashMap<String, Contact> contactsByName) {
        this.contactsByName = contactsByName;
    }

    //Methods
    public void addContact(Contact contact){
        contacts.add(contact);
        contactsByName.put(contact.getName(), contact);
    }

    public void sortByName(){
        for (int i = 0; i < contacts.size()-1; i++){
            for (int j = 0; j < contacts.size()-1-i; j++){
                if (contacts.get(j).getName().compareToIgnoreCase(contacts.get(j + 1).getName()) > 0 ){ // string1 is after string2
                    Contact aux = contacts.get(j);
                    contacts.set(j,contacts.get(j + 1));
                    contacts.set(j + 1,aux);
                }
            }
        }
    }



    public Contact searchOrganizeByName(String name){
        return contactsByName.get(name);
    }

    public void showContacts(){
        for (Contact contact : contacts){
            System.out.println(contact.toString());
        }
    }

    public Contact createContact(Scanner input){
        String contactId;
        String name;
        String phoneNumber;
        String email;
        String contactType;

        System.out.println("Input the following information: ");
        System.out.print("ID: ");
        contactId = input.nextLine();
        System.out.print("Name: ");
        name = input.nextLine();
        //input.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = input.nextLine();
        //input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        //input.nextLine();
        System.out.print("Available Contact Types: " + contactTypes + "\n");
        do {
            System.out.print("Contact Type (must match existing types): ");
            contactType = input.nextLine().toUpperCase();
            if (!contactTypes.contains(contactType)) {
                System.out.println("Invalid contact type. Please enter a valid one.");
            }
        } while (!contactTypes.contains(contactType));
        //input.nextLine();
        return new Contact(contactId,name,phoneNumber,email,contactType);
    }

    public void updateContact(Contact contact, Scanner input){
        int option = 0;
        String updated = "";
        System.out.println("\nUpdating " + contact.toString());
        do {
            System.out.println("Choose the contact information to modify: ");
            System.out.print("1. ID\n" +
                    "2. Name\n" +
                    "3. Phone Number\n" +
                    "4. Email\n" +
                    "5. Contact Type\n" +
                    "6. Cancel update\n" +
                    "Option: ");
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    System.out.print("Input ID: ");
                    updated = input.nextLine();
                    contact.setContactId(updated);
                break;
                case 2:
                    System.out.print("Input Name: ");
                    updated = input.nextLine();
                    contact.setName(updated);
                break;
                case 3:
                    System.out.print("Input Phone Number: ");
                    updated = input.nextLine();
                    contact.setPhoneNumber(updated);
                break;
                case 4:
                    System.out.print("Input Email: ");
                    updated = input.nextLine();
                    contact.setEmail(updated);
                break;
                case 5:
                    System.out.println("Available Contact Types: " + contactTypes);
                    do {
                        System.out.print("Input Contact Type: ");
                        updated = input.nextLine().toUpperCase();
                        if (!contactTypes.contains(updated)) {
                            System.out.println("Invalid contact type. Please choose one of the existing types.");
                        }
                    } while (!contactTypes.contains(updated));
                    contact.setContactType(updated);
                break;
                case 6:
                    System.out.println("Exit update menu");
                break;
                default:
                    System.out.println("Please choose a valid option");
                break;
            }
            System.out.println("Contact updated: " + contact.toString());
        }while (option != 6);
    }

    public void addContactType(String contactType){
        //Show message when is duplicated, not needed to compare because SET Do not allow duplicated

        String normalized = contactType.toUpperCase();
        //contactTypes.add(normalized);
        //System.out.println("New Contact Type Added");

        if (contactTypes.contains(normalized)){
            System.out.println("Contact Type duplicated");
        } else {
            contactTypes.add(normalized);
            System.out.println("New Contact Type Added");
        }
    }
}
