public class Contact {
    private String contactId;
    private String name;
    private String phoneNumber;
    private String email;
    private String contactType;

    //Constructor
    public Contact(){
        contactId = "ID-00";
        name = "Name";
        phoneNumber = "0000000";
        email = "email@mail.com";
        contactType = "Personal";
    }
    //Constructor Parameterized
    public Contact(String contactId, String name, String phoneNumber, String email, String contactType){
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactType = contactType;
    }

    //Setter & Getter
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString(){
        return "ID: " + getContactId() + ", Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ", Email: " + getEmail() + ", ContactType: " + getContactType() + "\n";
    }
}
