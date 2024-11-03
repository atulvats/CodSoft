import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(100.0);
        ATM atm = new ATM(userAccount);
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
                    double depositAmount = getValidAmount(scanner);
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = getValidAmount(scanner);
                    if (withdrawAmount <= atm.checkBalance()) {
                        atm.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Insufficient funds. Please enter a smaller amount.");
                    }
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
    private static double getValidAmount(Scanner scanner) {
        double amount;
        while (true) {
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount > 0) {
                    break;  
                } else {
                    System.out.print("Please enter a positive amount: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); 
            }
        }
        return amount;
    }
}
