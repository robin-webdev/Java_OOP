public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.002;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Savings withdrawal failed. Amount must be greater than 0.");
            return false;
        }

        if (getBalance() < amount) {
            System.out.println("Savings withdrawal failed. Insufficient balance.");
            return false;
        }

        double updatedBalance = getBalance() - amount;
        updatedBalance += updatedBalance * INTEREST_RATE;
        setBalance(updatedBalance);

        System.out.println("Savings withdrawal successful. Interest applied. New balance: " + getBalance());
        return true;
    }
}
