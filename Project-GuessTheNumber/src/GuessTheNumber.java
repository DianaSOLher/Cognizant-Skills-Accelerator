import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        final int MAX = 20;
        final int MIN = 10;
        Random random = new Random();
        int number1 = random.nextInt(MAX - MIN - 1) + MIN;
        //System.out.println(number1);
        //int number2 = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        //System.out.println(number2);
        //The program should prompt the user to enter their guesses and validate the input to ensure it's a valid integer within the specified range.
        Scanner keyboard = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;
        int option = 0;
        boolean won = false;
        do {
            while (attempts < maxAttempts && won == false){
                attempts++;
                System.out.println("Guess the number between "+ MAX + " and " + MIN + ": ");
                int guessNumber = keyboard.nextInt();
                if (guessNumber == number1){
                    System.out.println("YOU WON");
                    System.out.println("SOLVED IN "+ attempts+ " attempts");
                    won = true;
                } else if (guessNumber>number1){
                    System.out.println("TOO HIGH");
                    System.out.println("You have "+ (maxAttempts-attempts) +" attempts");
                    won = false;
                }else{
                    System.out.println("TOO LOW");
                    System.out.println("You have "+ (maxAttempts-attempts) +" attempts");
                    won = false;
                }
                if (maxAttempts-attempts == 0 && won == false){
                    System.out.println("YOU LOST");
                }
            }
            System.out.println("Do you want to keep playing: \n1.YES\n2.NO");
            option = keyboard.nextInt();
            if (option == 1){
                attempts = 0;
                number1 = random.nextInt(MAX - MIN - 1) + MIN;
                won = false;
            }
        }while (option == 1);

    }
}
