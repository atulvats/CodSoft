import java.util.Scanner;
public class Q5{
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
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Invalid amount. Please enter a valid number to deposit: ");
                        scanner.next(); // Clear the invalid input
                    }
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Invalid amount. Please enter a valid number to withdraw: ");
                        scanner.next(); // Clear the invalid input
                    }
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
