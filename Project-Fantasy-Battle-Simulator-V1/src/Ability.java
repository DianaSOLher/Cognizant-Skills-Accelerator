public class Ability {
    private String name;
    private String description;
    private int attackPower;
    private int healPower;
    private int defendPower;

    public Ability() {
        name = "Ability default";
        description = "Ability description";
        attackPower = 10;
        healPower = 10;
        defendPower = 10;
    }

    public Ability(String name, String description, int attackPower, int healPower, int defendPower) {
        this.name = name;
        this.description = description;
        this.attackPower = attackPower;
        this.healPower = healPower;
        this.defendPower = defendPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ability name cannot be empty.");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Ability name cannot be empty.");
        }
        this.description = description;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int power) {
        this.attackPower = power;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    public int getDefendPower() {
        return defendPower;
    }

    public void setDefendPower(int defendPower) {
        this.defendPower = defendPower;
    }

    @Override
    public String toString(){
        return "Ability: " + getName() + " Description: " + getDescription() + " Attack power: " + getAttackPower() + " Heal power: " +  getHealPower();
    }
}
