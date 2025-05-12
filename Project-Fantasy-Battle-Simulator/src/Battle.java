// Battle System Class
class Battle {
    private Character[] characters;
    private int turn;

    public Battle(Character[] characters) {
        this.characters = characters;
        this.turn = 0;
    }

    // Switch turn
    private void nextTurn() {
        turn = (turn + 1) % characters.length;
    }

    // Check if a character is alive before performing an action
    private void checkCharacterAlive(Character character) throws CharacterNotFoundException {
        if (!character.isAlive()) {
            throw new CharacterNotFoundException(character.getName() + " is already dead and cannot take any action.");
        }
    }

    // Start the battle
    public void start() {
        while (true) {
            try {
                Character attacker = characters[turn];
                // Skip if the attacker is dead
                checkCharacterAlive(attacker);

                // Pick a target (For simplicity, pick the next character in the array)
                Character target = characters[(turn + 1) % characters.length];
                checkCharacterAlive(target);

                // Perform action
                attacker.performAction(target);

                // If the target is dead, announce and end the battle
                if (!target.isAlive()) {
                    System.out.println(target.getName() + " has been defeated!");
                    break;
                }

                // Switch turns
                nextTurn();
            } catch (CharacterNotFoundException | InvalidActionException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Resources or actions to finalize after each turn can be added here
                System.out.println("End of turn for " + characters[turn].getName());
            }
        }
    }
}
