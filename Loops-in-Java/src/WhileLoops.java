import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //Write a Java program that prompts the user to enter a positive integer.
        //Use a Scanner object to read user input.
        Scanner keyboard = new Scanner(System.in);

        int option  = 1;
        System.out.println("Choose an option: \n1. Enter number\n2. Exit");
        option = keyboard.nextInt();

        while (option == 1){
            System.out.print("Enter a positive integer: ");
            int number = keyboard.nextInt();
            String numerString = Integer.toString(number);

            //Use a while loop to calculate the sum of the digits of the entered number.
            int j = 0;
            int result = 0;
            char digit = ' ';
            while (j < numerString.length()){
                digit = numerString.charAt(j);
                //System.out.println("Digit: " + digit);
                result = result + Character.getNumericValue(digit);
                j++;
            }
            System.out.println("RESULT: " + result);
            //Continuously extract the last digit of the number and add it to a running total.
            //Remove the last digit from the number using integer division.
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10; // Obtener el último dígito
                sum += lastDigit;             // Sumarlo
                number = number / 10;          // Eliminar el último dígito
            }
            //Once the sum of the digits has been calculated, print the result to the user.
            System.out.println("SUM: " + sum);
            //Add input validation to ensure the user enters a positive integer.
            //Allow the user to enter multiple numbers and calculate the sum of the digits for each one until they choose to exit.
            System.out.println("Choose an option: \n1. Enter number\n2. Exit");
            option = keyboard.nextInt();
        }

        keyboard.close();
    }
}
