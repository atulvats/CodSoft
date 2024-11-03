class ATM {
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
    }
    public double checkBalance() {
        return account.getBalance();
    }
    public void deposit(double amount) {
        account.deposit(amount);
    }
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
