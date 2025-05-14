import java.util.*;

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

    @Override
    public String toString(){
        return " -- PET ADOPTION CENTER --\n" +
                "PETS: \n" + getPets() +
                "\nADOPTERS: \n" + getAdopters();
    }

    public void addNewPet(Pet pet){
        pets.put(pet.getName(), pet);
    }

    public void addNewAdopter(Adopter adopter){
        adopters.add(adopter);
    }

    public void updatePetInfo(Pet pet, Scanner input){
        System.out.println("Updating pet: " + pet.getName());
        int option;
        do {
            System.out.println("Choose the contact information to modify: ");
            System.out.print("1. ID\n" +
                    "2. Name\n" +
                    "3. Species\n" +
                    "4. Age\n" +
                    "5. Breed\n" +
                    "6. Adoption status\n" +
                    "7. Exit\n" +
                    "Option: ");
            option = input.nextInt();

            input.nextLine();
            switch (option){
                case 1:
                    System.out.print("Input ID: ");
                    pet.setPetID(input.nextLine());
                    break;
                case 2:
                    System.out.print("Input Name: ");
                    pet.setName(input.nextLine());
                    break;
                case 3:
                    System.out.print("Input Species: ");
                    pet.setSpecies(input.nextLine());
                    break;
                case 4:
                    System.out.print("Input Age: ");
                    pet.setAge(input.nextDouble());
                    break;
                case 5:
                    System.out.println("Input Breed: ");
                    pet.setBreed(input.nextLine());
                    break;
                case 6:
                    System.out.println("Select Adoption status");
                    System.out.println("a. " + Status.ADOPTED.getLabel());
                    System.out.println("c. " + Status.NOT_ADOPTED.getLabel());
                    char status = input.nextLine().charAt(0);
                    switch (status){
                        case 'a':
                            pet.setAdoptionStatus(Status.ADOPTED);
                            break;
                        case 'b':
                            pet.setAdoptionStatus(Status.NOT_ADOPTED);
                            break;
                        default:
                            System.out.println("Please choose a valid option");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }while (option != 7);
    }

    public void adoptPet(Adopter adopter, Pet pet) throws AlreadyAdoptedException{
        if (pet.getAdoptionStatus() == Status.ADOPTED){
            throw new AlreadyAdoptedException("Error: The pet " + pet.getName() + " has already been adopted or does not exist.");
        }
        pet.adopt(adopter);
    }

    public void removePet(Pet pet){
        pets.remove(pet.getName());
        System.out.println("Pet " + pet.getName()+ " removed");
    }

    public void availablePets(){
        System.out.println(" \n|-|-|-| PETS AVAILABLE FOR ADOPTION |-|-|-| ");
        for (Pet pet : pets.values()){
            if (pet.getAdoptionStatus() == Status.NOT_ADOPTED){
                System.out.println(pet.toString());
            }
        }
    }

    public List<Pet> searchByBreed(String breed){
        List<Pet> petsByBreed = new ArrayList<>();
        for (Pet pet : pets.values()){
            if (pet.getBreed().equalsIgnoreCase(breed)){
                petsByBreed.add(pet);
            }
        }
        return petsByBreed;
    }

}
