public class Fish extends Pet{
    private final WaterType waterType;

    public Fish() {
        super();
        this.setSpecies("Fish");
        this.waterType = null;
    }

    public Fish(String petID, String name, double age, String breed, Status adoptionStatus, WaterType waterType) {
        super(petID, name, "Fish", age, breed, adoptionStatus);
        this.waterType = waterType;
    }

    public void swimAround(){
        System.out.println(getName() + " is swimming around in the " + waterType.toString().toLowerCase() + " tank.");
    }

}
