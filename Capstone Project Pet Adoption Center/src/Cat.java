public class Cat extends Pet implements Vaccinable{
    private boolean isIndoor;

    public Cat() {
        super();
        this.setSpecies("Cat");
    }

    public Cat(String petID, String name, double age, String breed, Status adoptionStatus) {
        super(petID, name, "Cat", age, breed, adoptionStatus);
    }

    public void purr(){
        System.out.println(getName() + " is purring...");
    }
}
