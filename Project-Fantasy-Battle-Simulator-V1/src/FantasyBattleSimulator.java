import java.util.Scanner;

public class FantasyBattleSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int width;
        int height;
        int initialRow;
        int initialColumn;


        System.out.println("Input height of board: ");
        height = input.nextInt();
        System.out.println("Input width of board: ");
        width = input.nextInt();


        System.out.println("-- FANTASY BATTLE SIMULATOR --");
        Battle battle = new Battle();
        System.out.println("GAME STARTED");
        Land land = new Land();
        battle.createBoard(land);

        do{
            System.out.println("Input initial position initialRow for human: ");
            initialRow = input.nextInt();
            if (!(initialRow >= 0 && initialRow < width)){
                System.out.println("Please input a valid position for initialRow >= 0 && initialRow < "+width);
            }

        }while (!(initialRow >= 0 && initialRow < width));
        do{
            System.out.println("Input initial position initialColumn for human: ");
            initialColumn = input.nextInt();
            if(!(initialColumn < height && initialColumn >= 0)){
                System.out.println("Please input a valid position for initialColumn >= 0 && initialColumn < "+height);
            }
        }while (!(initialColumn < height && initialColumn >= 0));

        //New game
        try {
            //Creating characters
            Assasin assasin = new Assasin("Katarina", 100, initialRow, initialColumn);
            //Tank tank = new Tank("Garen", 120);
            //Mage mage = new Mage("Lux", 200);

            //Creating abilities for assasin
            assasin.addAbilityToCharacter(assasin.createAbility(input));
            assasin.addAbilityToCharacter(assasin.createAbility(input));
            //Creating abilities for tank
            //tank.addAbilityToCharacter(tank.createAbility(input));
            //tank.addAbilityToCharacter(tank.createAbility(input));
            //Creating abilities for mage
           // mage.addAbilityToCharacter(mage.createAbility(input));
           // mage.addAbilityToCharacter(mage.createAbility(input));
            battle.addEntityToBoard(assasin);
            battle.showBoard();
            System.out.println("GAME STARTED: ");
            battle.moveEntity(assasin,input,land);

        } catch (InvalidAbilityPowerException e) {
            System.out.println("Error: " + e.getMessage());
        }




        /*
        do {
            System.out.println("Menu:");
            System.out.print("Select characters:\n" +
                    "2. Create Mage\n" +
                    "3. Create Tank\n" +
                    "4. Exit");
            option = input.nextInt();
            switch (option){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while (option!=4);

        System.out.println("Choose from the following characters: ");
        battle.showCharacters();

         */



    }
}
