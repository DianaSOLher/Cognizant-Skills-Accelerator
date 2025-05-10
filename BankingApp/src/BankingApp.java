import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        BankAccount account1 = new BankAccount("1234567", "Viridiana Solis", 3000.0);
        System.out.println("Initial Balance for " + account1.getAccountNumber() + ": " + account1.getBalance());
        System.out.println("-- BANKING APP --");

        do {
            System.out.print("Menu for Manage Customer Accounts: \n" +
                    "1. Check Balance\n" +
                    "2. Deposit Funds\n" +
                    "3. Withdraw Funds\n" +
                    "4. Exit\n" +
                    "Option: ");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Balance for account " + account1.getAccountNumber() + ": " + account1.getBalance());
                    break;
                case 2:
                    try {
                        account1.deposit(-1232);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        account1.withdraw(5000);
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exit App");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }while (option != 4);

        input.close();
    }
}
