import java.util.Scanner;

public class AdoptionApp {
    public static void main(String[] args) throws AlreadyAdoptedException{
        PetAdoptionCenter center = new PetAdoptionCenter();
        Scanner scanner = new Scanner(System.in);

        Cat cat = new Cat("PET001", "Katsuki", 2.5, "Abyssinian",Status.NOT_ADOPTED);
        Cat cat2 = new Cat("PET002", "Kira", 2.5, "Abyssinian",Status.NOT_ADOPTED);
        Cat cat3 = new Cat("PET003", "Kika", 2.5, "Abyssinian",Status.NOT_ADOPTED);
        Dog dog = new Dog("PET004", "Esperanza", 1.5, "Affenpinscher",Status.NOT_ADOPTED);
        Fish fish = new Fish("PET005", "Monse", 1.2, "Amberjack",Status.NOT_ADOPTED, WaterType.SALTWATER);

        Adopter adopter1 = new Adopter("ADP001", "Viridiana", "5537812213");
        Adopter adopter2 = new Adopter("ADP002", "Daniel", "552291919");
        Adopter adopter3 = new Adopter("ADP003", "Amber", "5512987536");

        center.addNewPet(cat);
        center.addNewPet(cat2);
        center.addNewPet(cat3);
        center.addNewPet(dog);
        center.addNewPet(fish);


        center.addNewAdopter(adopter1);
        center.addNewAdopter(adopter2);
        center.addNewAdopter(adopter3);

        System.out.println(center);

        center.availablePets();

        try {
            center.adoptPet(adopter1, cat);
            center.adoptPet(adopter2, cat);
        }catch (AlreadyAdoptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(center.searchByBreed("Abyssinian"));

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- PET ADOPTION CENTER ---");
            System.out.println("1. Add new pet");
            System.out.println("2. Add new adopter");
            System.out.println("3. Show available pets");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Search pet by breed");
            System.out.println("6. Update pet info");
            System.out.println("7. Show center info");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Pet ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    double age = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Breed: ");
                    String breed = scanner.nextLine();
                    System.out.print("Species (Cat/Dog/Fish): ");
                    String species = scanner.nextLine().toLowerCase();

                    Pet newPet = null;
                    switch (species) {
                        case "cat":
                            newPet = new Cat(id, name, age, breed, Status.NOT_ADOPTED);
                            break;
                        case "dog":
                            newPet = new Dog(id, name, age, breed, Status.NOT_ADOPTED);
                            break;
                        case "fish":
                            System.out.print("Water Type (freshwater/saltwater): ");
                            String waterTypeStr = scanner.nextLine().toUpperCase();
                            WaterType waterType = WaterType.valueOf(waterTypeStr);
                            newPet = new Fish(id, name, age, breed, Status.NOT_ADOPTED, waterType);
                            break;
                        default:
                            System.out.println("Invalid species.");
                            break;
                    }
                    if (newPet != null) {
                        center.addNewPet(newPet);
                        System.out.println("Pet added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Adopter ID: ");
                    String adopterId = scanner.nextLine();
                    System.out.print("Name: ");
                    String adopterName = scanner.nextLine();
                    System.out.print("Contact Info: ");
                    String contact = scanner.nextLine();
                    Adopter newAdopter = new Adopter(adopterId, adopterName, contact);
                    center.addNewAdopter(newAdopter);
                    System.out.println("Adopter added successfully.");
                    break;

                case 3:
                    center.availablePets();
                    break;

                case 4:
                    System.out.print("Adopter name: ");
                    String adopterNameSearch = scanner.nextLine();
                    Adopter foundAdopter = null;
                    for (Adopter a : center.getAdopters()) {
                        if (a.getName().equalsIgnoreCase(adopterNameSearch)) {
                            foundAdopter = a;
                            break;
                        }
                    }
                    if (foundAdopter == null) {
                        System.out.println("Adopter not found.");
                        break;
                    }

                    System.out.print("Pet name: ");
                    String petName = scanner.nextLine();
                    Pet foundPet = center.getPets().get(petName);
                    if (foundPet == null) {
                        System.out.println("Pet not found.");
                        break;
                    }

                    try {
                        center.adoptPet(foundAdopter, foundPet);
                    } catch (AlreadyAdoptedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Enter breed: ");
                    String searchBreed = scanner.nextLine();
                    System.out.println(center.searchByBreed(searchBreed));
                    break;

                case 6:
                    System.out.print("Pet name to update: ");
                    String petToUpdate = scanner.nextLine();
                    Pet pet = center.getPets().get(petToUpdate);
                    if (pet != null) {
                        center.updatePetInfo(pet, scanner);
                    } else {
                        System.out.println("Pet not found.");
                    }
                    break;

                case 7:
                    System.out.println(center);
                    break;

                case 8:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
        
    }
}
