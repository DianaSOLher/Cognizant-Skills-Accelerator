import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Character extends Entity{
    protected String name;
    protected int health;
    protected HashMap<String, Ability> abilities;

    //Constructor
    public Character() {
        name = "Character name";
        health = 100;
        abilities = new HashMap<>();
        super.column = 0;
        super.row = 0;
    }

    //Constructor parameterized
    public Character(String name, int health, int row, int column) {
        this.name = name;
        this.health = health;
        this.abilities = new HashMap<>();
        super.column = column;
        super.row = row;
    }

    //GETTER & SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public HashMap<String, Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(HashMap<String, Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Character: " + getName() + " Health: " + getHealth() + " Abilities: " + getAbilities();
    }

    public void showAbilities(){
        for (Map.Entry<String, Ability> ability : abilities.entrySet()){
            System.out.println("Ability: " + ability.getValue());
            System.out.println("--------------------------------");
        }
    }

    public void addAbilityToCharacter(Ability ability){
        abilities.put(ability.getName(), ability);
    }

    public Ability createAbility(Scanner input) throws InvalidAbilityPowerException, InputMismatchException {
        Ability ability = null;
        try {
            System.out.println("Input the following information: ");

            System.out.print("Name: ");
            String abilityName = input.nextLine();
            if (abilityName.trim().isEmpty()){
                throw new IllegalArgumentException("Ability name cannot be empty");
            }

            System.out.print("Description: ");
            String abilityDescription = input.nextLine();
            if(abilityDescription.trim().isEmpty()){
                throw new IllegalArgumentException("Ability description cannot be empty");
            }
            System.out.print("Attack Power: ");
            int attackPower = input.nextInt();
            input.nextLine();
            if (attackPower < 0){
                throw new InvalidAbilityPowerException("Attack Power must be greater than zero.");
            }
            System.out.print("Heal Power: ");
            int healPower = input.nextInt();
            input.nextLine();
            if (healPower < 0){
                throw new InvalidAbilityPowerException("Heal Power must be greater than zero.");
            }
            System.out.print("Defend Power: ");
            int defendPower = input.nextInt();
            input.nextLine();
            if (defendPower < 0){
                throw new InvalidAbilityPowerException("Defend Power must be greater than zero.");
            }

            ability = new Ability(abilityName, abilityDescription, attackPower, healPower, defendPower);

        } catch (InputMismatchException e) {
            input.nextLine(); // Limpia el buffer mal leído
            System.out.println("Invalid input. Power must be a number.");
        } catch (InvalidAbilityPowerException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return ability;
    }

}
