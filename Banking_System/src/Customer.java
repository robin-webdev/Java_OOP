import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final int customerId;
    private final List<Account> accounts;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found for this customer.");
            return;
        }

        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Type: " + account.getClass().getSimpleName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
