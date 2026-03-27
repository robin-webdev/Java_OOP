public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("JVMS", "RIXS");
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            int choice = InputUtils.getNumberInputWithinRange("Select an option:", 1, 7);

            switch (choice) {
                case 1:
                    bank.addCustomer();
                    break;
                case 2:
                    bank.createAccountForCustomer();
                    break;
                case 3:
                    bank.processDeposit();
                    break;
                case 4:
                    bank.processWithdrawal();
                    break;
                case 5:
                    bank.showCustomerBalance();
                    break;
                case 6:
                    bank.showAllTransactions();
                    break;
                case 7:
                    isRunning = false;
                    System.out.println("Exiting banking system.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("=== Banking System Menu ===");
        System.out.println("1. Add Customer");
        System.out.println("2. Create Account for Customer");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Show Customer Balance");
        System.out.println("6. Show All Transactions");
        System.out.println("7. Exit");
    }
}
