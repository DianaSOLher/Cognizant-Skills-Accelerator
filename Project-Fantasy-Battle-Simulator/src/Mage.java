
// Mage Class (Inherits Character)
class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 25, 5);
    }

    @Override
    public void performAction(Character target) throws InvalidActionException {
        if (!this.isAlive()) {
            throw new InvalidActionException(name + " is dead and cannot perform actions!");
        }
        // Perform magic attack
        int damage = this.attackPower - target.defensePower;
        if (damage < 0) damage = 0;
        target.receiveDamage(damage);
        System.out.println(name + " casts a spell on " + target.getName() + " for " + damage + " damage.");
    }
}