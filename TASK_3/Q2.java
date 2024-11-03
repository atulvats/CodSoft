import java.util.Scanner;
class ATM {
    private double balance;
    public ATM() {
        this.balance = 0.0;
    }
    public double checkBalance() {
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

public class Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\n--- Welcome to the ATM ---");
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                scanner.next(); 
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f\n", atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM! Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
