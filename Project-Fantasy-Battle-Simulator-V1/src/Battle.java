import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Battle {
    private HashSet<Character> characters;
    private Entity[][] board;
    private int height;
    private int width;

    public Battle(){
        width = 4;
        height = 4;
        board = new Entity[height][width];
        characters = new HashSet<>();
    }

    public Battle(int width, int height){
        this.width = width;
        this.height = height;
        this.board = new Entity[height][width];
    }

    public void createBoard(Land land){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                board[i][j] = new Land();
            }
        }
    }

    public void showBoard(){
        System.out.println("BOARD: ");
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(board[i][j].toString());
            }
            System.out.println();
        }
    }

    public void addEntityToBoard(Entity entity){
        System.out.println("Position row = " + entity.getRow() + " column = " + entity.getColumn());
        board[entity.getRow()][entity.getColumn()] = entity;
    }

    public void updateCharacter(int row, int colum, Character character, Land land){
        board[row][colum] = new Land();
        board[character.getRow()][character.getColumn()] = character;
    }

    public void addCharacter(Character character){
        characters.add(character);
    }

    public void showCharacters(){
        for (Character character : characters){
            System.out.println(character.toString());
        }
    }

    public void moveEntity(Character character, Scanner input, Land land){
        char movement;
        boolean battle = false;
        int prevRow = 0;
        int prevCol = 0;
        do {
            System.out.println("Move Character using W / A / S / D : ");
            movement = input.next().charAt(0);
            prevRow = character.getRow();
            prevCol = character.getColumn();
            switch (movement){
                case 'W':
                    if (character.getRow() == 0){
                        System.out.println("You can't move out of the board");
                    }else{
                        character.setRow(character.getRow()-1);
                    }
                    break;
                case 'A':
                    if (character.getColumn() == 0){
                        System.out.println("You can't move out of the board");
                    }else{
                        character.setColumn(character.getColumn()-1);
                        //updatecharacter(human.getRow(), human.getColumn()-1, human, land);
                    }
                    break;
                case 'D':
                    if (character.getColumn() == width-1){
                        System.out.println("You can't move out of the board");
                    }else{
                        character.setColumn(character.getColumn()+1);
                        //updateHuman(human.getRow(), human.getColumn()+1, human, land);
                    }
                    break;
                case 'S':
                    if (character.getRow() == height-1){
                        System.out.println("You can't move out of the board");
                    }else{
                        character.setRow(character.getRow()+1);
                        //updatecharacter(character.getRow()+1, character.getColumn(), character, land);
                    }
                    break;
                default:
                    System.out.println("Please select a valid movement");
                    break;
            }
            updateCharacter(prevRow, prevCol, character, land);
            battle = isBattle(character, land);
            if (!battle){
                System.out.println("Keep playing");
            }
            showBoard();
        }while (!battle);
    }
    //CORREGIR
    public boolean isBattle(Character currentCharacter, Land land){
        boolean isBattle = false;
        for (Character other : characters) {
            if (other != currentCharacter && other.getRow() == currentCharacter.getRow() && other.getColumn() == currentCharacter.getColumn()) {
                isBattle = true;
                System.out.println("BATTLE STARTED" + currentCharacter.getName() + " vs " + other.getName() );
                battle(currentCharacter, other, land);
            } else {
                isBattle = false;
            }
        }
        return isBattle;
    }

    public void battle(Character attacker, Character defender, Land land) throws InvalidActionException{
        Scanner input = new Scanner(System.in);

        try {
            System.out.println(attacker.getName() + "'s Turn! Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Defend");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    int totalAttack = attacker.getAbilities().values().stream().mapToInt(Ability::getAttackPower).sum();
                    int totalDefense = defender.getAbilities().values().stream().mapToInt(Ability::getDefendPower).sum();
                    int damage = Math.max(0, totalAttack - totalDefense);
                    defender.setHealth(defender.getHealth() - damage);
                    System.out.println(attacker.getName() + " attacks for " + damage + " damage!");
                    break;

                case 2:
                    int totalHeal = attacker.getAbilities().values().stream().mapToInt(Ability::getHealPower).sum();
                    attacker.setHealth(attacker.getHealth() + totalHeal);
                    System.out.println(attacker.getName() + " heals for " + totalHeal + " HP!");
                    break;

                case 3:
                    System.out.println(attacker.getName() + " is defending! (No implementation yet)");
                    // You can add temporary defense buff logic here
                    break;

                default:
                    throw new InvalidActionException("Invalid action selected.");
            }

            // Check deaths
            if (defender.getHealth() <= 0) {
                System.out.println(defender.getName() + " has died!");
                board[defender.getRow()][defender.getColumn()] = land;
                characters.remove(defender);
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            input.nextLine(); // Clear buffer
        } catch (InvalidActionException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectAndPlaceCharacter(Scanner input) {
        System.out.println("Enter character name:");
        String name = input.next();
        System.out.println("Enter health points:");
        int health = input.nextInt();
        System.out.println("Enter row (0 to " + (height - 1) + "):");
        int row = input.nextInt();
        System.out.println("Enter column (0 to " + (width - 1) + "):");
        int col = input.nextInt();

        try {
            if (row >= height || col >= width || row < 0 || col < 0)
                throw new InvalidActionException("Invalid position on board.");

            Character character = new Assasin(name, health, row, col); // O cualquier tipo
            Ability ability = new Ability("Slash", "Basic attack", 15, 0, 5);
            character.addAbility("Slash", ability);

            addCharacter(character);
            addEntityToBoard(character);

        } catch (InvalidActionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



    public void setupCharacters(Scanner scanner) throws InputMismatchException {
        System.out.println("How many characters do you want to add?");
        int numCharacters = scanner.nextInt();

        for (int i = 0; i < numCharacters; i++) {
            try {
                System.out.print("Enter name for character " + (i + 1) + ": ");
                String name = scanner.next();
                System.out.print("Enter health: ");
                int health = scanner.nextInt();

                System.out.print("Enter row (0-" + (height - 1) + "): ");
                int row = scanner.nextInt();

                System.out.print("Enter column (0-" + (width - 1) + "): ");
                int column = scanner.nextInt();

                Character character = new Character(name, health, row, column);

                Ability basicAttack = new Ability("Basic Attack", "Basic hit", 10, 0, 0);
                character.getAbilities().put("Attack", basicAttack);

                characters.add(character);
                addEntityToBoard(character);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
                i--;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }
    }

}
