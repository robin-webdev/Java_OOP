public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 1000;
    private static final double TRANSACTION_FEE = 5;

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Checking withdrawal failed. Amount must be greater than 0.");
            return false;
        }

        double totalCost = amount + TRANSACTION_FEE;
        if (getBalance() + OVERDRAFT_LIMIT < totalCost) {
            System.out.println("Checking withdrawal failed. Overdraft limit exceeded.");
            return false;
        }

        setBalance(getBalance() - totalCost);
        System.out.println("Checking withdrawal successful. Transaction fee charged: " + TRANSACTION_FEE
                + ". New balance: " + getBalance());
        return true;
    }
}
