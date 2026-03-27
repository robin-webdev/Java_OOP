import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private final String bankCode;
    private final String branchCode;
    private final HashMap<Integer, Customer> customers;
    private final ArrayList<Transaction> transactions;
    private static int customerCounter;
    private static int accountCounter;

    static {
        customerCounter = 1000;
        accountCounter = 5000;
    }

    public Bank(String bankCode, String branchCode) {
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.customers = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public void addCustomer() {
        String name = InputUtils.getTextInput("Enter customer name:");
        Customer customer = new Customer(name, customerCounter++);
        customers.put(customer.getCustomerId(), customer);

        System.out.println("Customer added successfully.");
        System.out.println("Customer ID: " + customer.getCustomerId());
    }

    private String generateAccountNumber() {
        return bankCode + "-" + branchCode + "-" + accountCounter++;
    }

    private Customer findCustomer(int id) {
        return customers.get(id);
    }

    public void createAccountForCustomer() {
        int customerId = InputUtils.getNumberInputWithinRange("Enter customer ID:", 1000, Integer.MAX_VALUE);
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        int accountType = InputUtils.getNumberInputWithinRange(
                "Choose account type:\n1. Savings Account\n2. Checking Account",
                1,
                2
        );

        String accountNumber = generateAccountNumber();
        Account account;

        if (accountType == 1) {
            account = new SavingsAccount(accountNumber);
        } else {
            account = new CheckingAccount(accountNumber);
        }

        customer.addAccount(account);
        System.out.println("Account created successfully.");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getClass().getSimpleName());
    }

    public void processDeposit() {
        int customerId = InputUtils.getNumberInputWithinRange("Enter customer ID:", 1000, Integer.MAX_VALUE);
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        String accountNumber = InputUtils.getTextInput("Enter account number:");
        Account account = customer.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        double amount = InputUtils.getDoubleInput("Enter deposit amount:");
        if (account.deposit(amount)) {
            transactions.add(new Transaction(TransactionType.DEPOSIT, amount, customer, account));
        }
    }

    public void processWithdrawal() {
        int customerId = InputUtils.getNumberInputWithinRange("Enter customer ID:", 1000, Integer.MAX_VALUE);
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        String accountNumber = InputUtils.getTextInput("Enter account number:");
        Account account = customer.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        double amount = InputUtils.getDoubleInput("Enter withdrawal amount:");
        if (account.withdraw(amount)) {
            transactions.add(new Transaction(TransactionType.WITHDRAW, amount, customer, account));
        }
    }

    public void showCustomerBalance() {
        int customerId = InputUtils.getNumberInputWithinRange("Enter customer ID:", 1000, Integer.MAX_VALUE);
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer ID: " + customer.getCustomerId());
        customer.displayAccounts();
    }

    public void showAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.showTransactionInfo();
        }
    }
}
