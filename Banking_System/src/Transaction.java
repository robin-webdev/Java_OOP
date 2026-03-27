import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Transaction {
    private final UUID transactionId;
    private final TransactionType transactionType;
    private final double transactionAmount;
    private final LocalDateTime transactionTimeAndDate;
    private final Account account;
    private final Customer customer;
    private static final DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Transaction(TransactionType transactionType, double transactionAmount, Customer customer, Account account) {
        this.transactionId = UUID.randomUUID();
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionTimeAndDate = LocalDateTime.now();
        this.customer = customer;
        this.account = account;
    }

    public void showTransactionInfo() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Transaction Amount: " + transactionAmount);
        System.out.println("Transaction Date and Time: " + transactionTimeAndDate.format(CUSTOM_FORMATTER));
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getClass().getSimpleName());
        System.out.println();
    }
}
