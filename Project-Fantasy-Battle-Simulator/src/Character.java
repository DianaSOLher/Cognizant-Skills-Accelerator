
// Character Class (Parent Class)
abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int attackPower;
    protected int defensePower;

    public Character(String name, int healthPoints, int attackPower, int defensePower) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    // Abstract method for character's action
    public abstract void performAction(Character target) throws InvalidActionException;

    // Method to check if the character is alive
    public boolean isAlive() {
        return healthPoints > 0;
    }

    // Method to receive damage
    public void receiveDamage(int damage) {
        this.healthPoints -= damage;
        if (healthPoints < 0) healthPoints = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}



