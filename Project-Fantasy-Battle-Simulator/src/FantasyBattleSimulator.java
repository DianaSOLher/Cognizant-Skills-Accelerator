// Main Class to Start the Game
public class FantasyBattleSimulator {
    public static void main(String[] args) {
        // Create characters
        Character warrior = new Warrior("Warrior");
        Character mage = new Mage("Mage");
        Character archer = new Archer("Archer");

        // Initialize the battle with the characters
        Character[] characters = { warrior, mage, archer };
        Battle battle = new Battle(characters);

        // Start the battle
        battle.start();
    }
}
