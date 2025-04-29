import java.util.Scanner;

public class ForLoops {
    public static void main (String[] args){
        //Write a for loop that prints the numbers from 1 to 10.
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        // Write a for loop that calculates the sum of the first 10 positive integers and prints the result.
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result+=i;
            //System.out.println(i);
        }
        System.out.println(result);

        // Write a for loop that prints the multiplication table of a number provided by the user (from 1 to 10).
        int number = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Provide a number from 1 to 10: ");
            number = keyboard.nextInt();
        }while (number>10 || number <= 0);
        int multiplication = 0;
        for (int i = 1; i <= 10; i++){
            multiplication = number * i;
            System.out.println(number + " x " + i + " = " + multiplication );
        }
        keyboard.close();
    }
}
