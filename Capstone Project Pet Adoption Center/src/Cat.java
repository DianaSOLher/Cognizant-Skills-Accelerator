public class Cat extends Pet implements Adoptable, Vaccinable{

    public Cat(String petID, String name, String species, double age, String breed, Status adoptionStatus) {
        super.petID = petID;
        super.name = name;

        super.age = age;
        super.breed = breed;
        super.adoptionStatus = adoptionStatus;

    }
}
