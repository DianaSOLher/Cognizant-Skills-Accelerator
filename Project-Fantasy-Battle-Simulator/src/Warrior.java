// Warrior Class (Inherits Character)
class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150, 20, 10);
    }

    @Override
    public void performAction(Character target) throws InvalidActionException {
        if (!this.isAlive()) {
            throw new InvalidActionException(name + " is dead and cannot perform actions!");
        }
        // Perform attack
        int damage = this.attackPower - target.defensePower;
        if (damage < 0) damage = 0;
        target.receiveDamage(damage);
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage.");
    }
}