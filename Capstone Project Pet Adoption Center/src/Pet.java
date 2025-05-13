abstract public class Pet {
    protected String petID;
    protected String name;
    protected String species;
    protected double age;
    protected String breed;
    protected Status adoptionStatus;

    //Constructor Default
    public Pet(){
        petID = "ID-PET";
        name = "NAME-PET";
        species = "SPECIES-PET";
        age = 0;
        breed = "BREED-PET";
        adoptionStatus = Status.NOT_ADOPTED;
    }

    //Constructor Parameterized

    public Pet(String petID, String name, String species, double age, String breed, Status adoptionStatus) {
        this.petID = petID;
        this.name = name;
        this.species = species;
        this.age = age;
        this.breed = breed;
        this.adoptionStatus = adoptionStatus;
    }

    //Getter & Setter

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Status getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(Status adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    @Override
    public String toString(){
        return "ID: " + getPetID() + " Name: " + getName() + " Species: " + getSpecies() + " Age: " + getAge() + " Breed: " + getBreed() + " Adoption Status: " + getAdoptionStatus();
    }
}

