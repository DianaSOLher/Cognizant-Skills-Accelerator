import java.util.HashMap;

public class Adopter {
    private String adopterID;
    private String name;
    private String contactInfo;
    private HashMap<String, Pet> adoptedPets; // <Name, Pet>

    public Adopter(String adopterID, String name, String contactInfo) {
        this.adopterID = adopterID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.adoptedPets = new HashMap<>();
    }

    public String getAdopterID() {
        return adopterID;
    }

    public void setAdopterID(String adopterID) {
        this.adopterID = adopterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public HashMap<String, Pet> getAdoptedPets() {
        return adoptedPets;
    }

    public void setAdoptedPets(HashMap<String, Pet> adoptedPets) {
        this.adoptedPets = adoptedPets;
    }

    @Override
    public String toString(){
        return "--------------------\nAdopter ID: " + getAdopterID() + "\nName: " + getName() + "\nContactInfo: " + getContactInfo() + "\nAdopted Pets: " + getAdoptedPets() + "--------------------";
    }
}
