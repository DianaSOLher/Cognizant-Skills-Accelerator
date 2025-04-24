//Import the Scanner class from the java.util package.
import java.sql.SQLOutput;
import java.util.Scanner;
public class StringsUserInput {
    public static void main(String[] args){
        //Create a Scanner object to read user input.
        Scanner userInput = new Scanner(System.in);
        //Prompt the user to enter their first name and store it in a String variable firstName.
        System.out.println("First Name: ");
        String firstName = userInput.nextLine();
        //Prompt the user to enter their last name and store it in a String variable lastName.
        System.out.println("Last Name: ");
        String lastName = userInput.nextLine();

        //Concatenate firstName and lastName to form the full name and store it in a String variable fullName.
        String fullName = firstName + " " + lastName;
        //Convert fullName to uppercase and store it in a new variable.
        String upperFullName = fullName.toUpperCase();
        //Count the number of times the first character of fullName appears throughout the string.
        char first = fullName.charAt(0);
        int count = 0;
        for (int i = 0; i<fullName.length(); i++){
            if (fullName.charAt(i) == first){
                count++;
            }
        }
        //Print the full name, its uppercase version, and the number of times the first letter appears.
        System.out.println("FULL NAME: " + fullName);
        System.out.println("UPPER CASE FULL NAME: " + upperFullName);
        System.out.println("Letter " + first + " appears " + count);
    }
}
