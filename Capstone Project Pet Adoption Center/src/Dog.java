public class Dog extends Pet implements Vaccinable{
    private boolean isTrained;
    private boolean requiresDailyWalk;

    public Dog() {
        super();
        this.setSpecies("Dog");
    }

    public Dog(String petID, String name, double age, String breed, Status adoptionStatus) {
        super(petID, name, "Dog", age, breed, adoptionStatus);
    }

    public void bark(){
        System.out.println(getName() + " is barking...");
    }

    @Override
    public void vaccinate(){
        System.out.println(getName() + " has been vaccinated.");
    }
}
