import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        //Declare variables to store two numbers (num1, num2) and the result (result).
        double num1, num2, result = 0, result2 = 0;
        int operation;
        //Use the Scanner class to read the two numbers and the operation choice from the user.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Num1: ");
        num1 = teclado.nextDouble();
        System.out.println("Num2: ");
        num2 = teclado.nextDouble();
        System.out.println("Select an option:\n1. [ + ]\n2. [ - ]\n3. [ / ]\n4. [ * ]");
        operation = teclado.nextInt();
        //Use if-else statements and logical operators to perform the chosen arithmetic operation (+, -, *, /) and store the result in result.
        if (operation == 1){
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 - num2;
        } else if ((operation == 3)) {
            result = num1 * num2;
        } else if (operation == 4) {
            result = num1 / num2;
        }else {
            System.out.println("Invalid operation");
        }

        //Use a switch statement to handle the operations.
        switch (operation){
            case 1:
                result2 = num1 + num2;
            break;
            case 2:
                result2 = num1 - num2;
            break;
            case 3:
                result2 = num1 * num2;
            break;
            case 4:
                result2 = num1 / num2;
            break;
        }
        int option;
        System.out.println("Increment or decrement: \n1.[ ++ ]\n2. [ -- ]");
        option = teclado.nextInt();
        if (option == 1 ){
            result++;
            result2++;
            System.out.println("IF STATEMENT: " + result);
            System.out.println("SWITCH STATEMENT: " + result2);
        } else if (option == 2 ){
            result--;
            result2--;
            System.out.println("IF STATEMENT: " + result);
            System.out.println("SWITCH STATEMENT: " + result2);
        }else {
            System.out.println("IVALID OPTION");
        }
    }
}
