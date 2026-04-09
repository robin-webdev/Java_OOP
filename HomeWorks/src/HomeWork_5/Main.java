package HomeWork_5;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC001", "Alice");
        BankAccount acc2 = new BankAccount("ACC002", "Bob");

        // Alice's transactions
        acc1.deposit(1000);
        acc1.getAccountDetails();

        acc1.withdraw(400);
        acc1.getAccountDetails();

        acc1.withdraw(700); // Should fail - insufficient funds
        acc1.getAccountDetails();

        // Bob's transactions
        acc2.deposit(500);
        acc2.getAccountDetails();

        acc2.withdraw(500);
        acc2.getAccountDetails();

        acc2.deposit(-50); // Should fail - invalid amount
        acc2.getAccountDetails();
    }
}