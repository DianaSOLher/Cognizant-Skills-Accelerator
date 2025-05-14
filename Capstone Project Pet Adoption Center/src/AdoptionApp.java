public class AdoptionApp {
    public static void main(String[] args) throws AlreadyAdoptedException{
        PetAdoptionCenter center = new PetAdoptionCenter();

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

        
    }
}
