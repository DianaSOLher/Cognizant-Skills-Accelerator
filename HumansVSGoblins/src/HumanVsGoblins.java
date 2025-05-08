
import java.util.*;

public class HumanVsGoblins {
    private Entity[][] board;
    private int height;
    private int width;
    private List<Goblins> goblins= new ArrayList<>();

    public HumanVsGoblins(){
        width = 4;
        height = 4;
        board = new Entity[height][width];
    }

    public HumanVsGoblins(int width, int height){
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

    public void addHumanToBoard(Humans human){
        System.out.println("Position row = " + human.getRow() + " column = " + human.getColumn());
        board[human.getRow()][human.getColumn()] = human;
    }

    public void addGoblinToBoard(Goblins goblins){
        System.out.println("Position row = " + goblins.getRow() + " column = " + goblins.getColumn());
        board[goblins.getRow()][goblins.getColumn()] = goblins;
    }

    public void addLandToBoard(Land land){
        System.out.println("Position row = " + land.getRow() + " column = " + land.getColumn());
        board[land.getRow()][land.getColumn()] = land;
    }

    public void updateHuman(int row, int colum, Humans human, Land land){
        board[row][colum] = new Land();
        board[human.getRow()][human.getColumn()] = human;
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

    public void addGoblinToList(Goblins goblins){
        this.goblins.add(goblins);
    }

    public Goblins setGoblin(int initialRow, int initialColumn, Scanner input){
        int initialRowG;
        int initialColumnG;
        do {
            do{
                System.out.println("Input initial position Row for Goblin: ");
                initialRowG = input.nextInt();
                if (!(initialRowG >= 0 && initialRowG < width)){
                    System.out.println("Please input a valid position for initialRow >= 0 && initialRow < "+width);
                }

            }while (!(initialRowG >= 0 && initialRowG < width));
            do{
                System.out.println("Input initial position Column for Goblin: ");
                initialColumnG = input.nextInt();
                if(!(initialColumnG < height && initialColumnG >= 0)){
                    System.out.println("Please input a valid position for initialColumn >= 0 && initialColumn < " + height);
                }
            }while (!(initialColumnG < height && initialColumnG >= 0));
            if (initialRow == initialRowG && initialColumn == initialColumnG){
                System.out.println("YOU CAN'T CHOOSE INITIAL HUMAN POSITION");
            }
        }while (initialRow == initialRowG && initialColumn == initialColumnG);
        Goblins goblin1 = new Goblins(initialRowG, initialColumnG);
        addGoblinToList(goblin1);
        addGoblinToBoard(goblin1);
        return goblin1;
    }

    public void moveEntity(Humans human, Scanner input, Land land){
        char movement;
        boolean battle = false;
        int prevRow = 0;
        int prevCol = 0;
        do {
            System.out.println("Move human using W / A / S / D : ");
            movement = input.next().charAt(0);
            prevRow = human.getRow();
            prevCol = human.getColumn();
            switch (movement){
                case 'W':
                    if (human.getRow() == 0){
                        System.out.println("You can't move out of the board");
                    }else{
                        human.setRow(human.getRow()-1);
                    }
                break;
                case 'A':
                    if (human.getColumn() == 0){
                        System.out.println("You can't move out of the board");
                    }else{
                        human.setColumn(human.getColumn()-1);
                        //updateHuman(human.getRow(), human.getColumn()-1, human, land);
                    }
                break;
                case 'D':
                    if (human.getColumn() == width-1){
                        System.out.println("You can't move out of the board");
                    }else{
                        human.setColumn(human.getColumn()+1);
                        //updateHuman(human.getRow(), human.getColumn()+1, human, land);
                    }
                break;
                case 'S':
                    if (human.getRow() == height-1){
                        System.out.println("You can't move out of the board");
                    }else{
                        human.setRow(human.getRow()+1);
                        //updateHuman(human.getRow()+1, human.getColumn(), human, land);
                    }
                break;
                default:
                    System.out.println("Please select a valid movement");
                break;
            }
            updateHuman(prevRow, prevCol, human, land);
            battle = isBattle(human, land);
            if (!battle){
                System.out.println("Keep playing");
            }
            showBoard();
        }while (!battle);
    }

    public boolean isBattle(Humans human, Land land){
        boolean isBattle = false;
        for (Goblins goblin : goblins) {
            if (human.getRow() == goblin.getRow() && human.getColumn() == goblin.getColumn()) {
                isBattle = true;
                System.out.println("YOU ARE IN BATTLE" );
                battle(goblin, human, land);
            } else {
                isBattle = false;
            }
        }
        return isBattle;
    }

    public void battle(Goblins goblin, Humans human, Land land){
        Random random = new Random();
        int result = random.nextInt(2);
        if (result == 0){
            System.out.println("Human wins");
            board[human.getRow()][human.getColumn()] = human;
        }else {
            System.out.println("Goblin wins");
            board[goblin.getRow()][goblin.getColumn()] = goblin;
            System.out.println("GAME OVER: The human has died.");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        int width;
        int height;
        int initialRow;
        int initialColumn;
        Scanner input = new Scanner(System.in);
        System.out.println("--- HUMANS VS GOBLINS ---");

        System.out.println("Input height of board: ");
        height = Integer.parseInt(input.nextLine());
        System.out.println("Input width of board: ");
        width = Integer.parseInt(input.nextLine());

        //New game
        HumanVsGoblins game = new HumanVsGoblins(width, height);
        System.out.println("GAME STARTED");
        Land land = new Land();
        game.createBoard(land);
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

        Humans human1 = new Humans(initialRow,initialColumn);
        game.addHumanToBoard(human1);
        game.showBoard();
        Goblins goblin1 = game.setGoblin(initialRow, initialColumn, input);
        Goblins goblin2 = game.setGoblin(initialRow, initialColumn, input);


        System.out.println("HUMAN: " + human1.toString());
        System.out.println("GOBLINS: " + goblin1.toString());
        System.out.println("LAND: " + land.toString());

        game.showBoard();


        System.out.println("GAME STARTED: ");
        game.moveEntity(human1,input,land);

        input.close();
    }
}
