import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args){
        /*
        You are in a land full of dragons. In front of you,
You see two caves. In one cave, the dragon is friendly
and will share his treasure with you. The other dragon
is greedy and hungry and will eat you on sight.
Which cave will you go into? (1 or 2)
        * */

        Scanner teclado = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");
        int cave = teclado.nextInt();

        if (cave == 1) {
            System.out.println("You approach the cave…\n" +
                    "It is dark and spooky…\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He opens his jaws and…\n" +
                    "Gobbles you down in one bite!");
        } else if (cave == 2) {
            System.out.println("You approach the cave…\n" +
                    "It is dark and spooky…\n" +
                    "There is no dragon inside\n" +
                    "Cheers you chose a save cave!");
        }else {
            System.out.println("Invalid cave");
        }
    }
}
