public class BankAccount {
    private double balance;
    public BankAccount() {
        this.balance = 0.0;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Your current balance is: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }
}
