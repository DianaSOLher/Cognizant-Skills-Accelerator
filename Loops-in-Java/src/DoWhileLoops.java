import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args){
        //Write a menu-driven program using a do-while loop that repeatedly displays a menu with options to add, subtract, multiply, and divide two numbers. The user should be able to choose an option, perform the operation, and see the result. The program should exit only when the user chooses an exit option.
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        do {
            System.out.print("\n Welcome to the Calculator!\n" +
                    "\n" +
                    "Please select an operation:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit\n" + "Enter your choice: ");
            option = keyboard.nextInt();
            if (option < 5 && option > 0){
                System.out.print( "\nEnter the first number: ");
                firstNumber = keyboard.nextInt();
                System.out.print( "\nEnter the second number: ");
                secondNumber = keyboard.nextInt();
            } else if (option == 5) {
                System.out.println("Exiting the calculator. Thank you!");
            } else {
                System.out.println("Enter a valid option");
            }

            switch (option){
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.println("RESULT: "+ firstNumber +" + " + secondNumber + " = " + result);
                break;
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.println("RESULT: "+ firstNumber +" - " + secondNumber + " = " + result);
                break;
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.println("RESULT: "+ firstNumber +" * " + secondNumber + " = " + result);
                break;
                case 4:
                    result = firstNumber / secondNumber;
                    System.out.println("RESULT: "+ firstNumber +" / " + secondNumber + " = " + result);
                break;
            }

            result = 0;
        }while (option != 5);
    }
}
