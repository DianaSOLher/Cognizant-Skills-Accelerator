import java.util.HashMap;
import java.util.HashSet;

public class PetAdoptionCenter {
    private HashSet<Adopter> adopters;
    private HashMap<String, Pet> pets;

    public PetAdoptionCenter() {
        this.adopters = new HashSet<>();
        this.pets = new HashMap<>();
    }

    public HashSet<Adopter> getAdopters() {
        return adopters;
    }

    public void setAdopters(HashSet<Adopter> adopters) {
        this.adopters = adopters;
    }

    public HashMap<String, Pet> getPets() {
        return pets;
    }

    public void setPets(HashMap<String, Pet> pets) {
        this.pets = pets;
    }
}
