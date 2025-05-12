// Archer Class (Inherits Character)
class Archer extends Character {
    public Archer(String name) {
        super(name, 120, 15, 8);
    }

    @Override
    public void performAction(Character target) throws InvalidActionException {
        if (!this.isAlive()) {
            throw new InvalidActionException(name + " is dead and cannot perform actions!");
        }
        // Perform ranged attack
        int damage = this.attackPower - target.defensePower;
        if (damage < 0) damage = 0;
        target.receiveDamage(damage);
        System.out.println(name + " shoots an arrow at " + target.getName() + " for " + damage + " damage.");
    }
}