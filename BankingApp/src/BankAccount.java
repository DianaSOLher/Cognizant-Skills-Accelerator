public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(){
        accountNumber = "00000000";
        accountHolder = "Name";
        balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) throws InvalidAmountException{
        if (amount <= 0){
            throw new InvalidAmountException("The amount to deposit has to be more than zero");
        }
        balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
        if (amount <= 0){
            throw new InvalidAmountException("The amount to withdraw has to be more than zero");
        } else if (amount > balance) {
            throw new InsufficientFundsException("The balance is insufficient to be withdraw");
        }
        balance -= amount;
        System.out.println("New Balance: " + balance);
    }
}
