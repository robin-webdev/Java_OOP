public abstract class Account {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed. Amount must be greater than 0.");
            return false;
        }

        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
        return true;
    }

    public abstract boolean withdraw(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
