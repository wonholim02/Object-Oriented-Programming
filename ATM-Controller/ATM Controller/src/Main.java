public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add some accounts to the bank
        Account account1 = new Account("1234567890", 1000);
        Account account2 = new Account("0987654321", 500);
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Create a new ATM instance and insert a card
        ATM atm = new ATM(bank);
        boolean cardInserted = atm.insertCard("1234567890", "1234");

        if (cardInserted) {
            // Select an account and display the balance
            boolean accountSelected = atm.selectAccount("1234567890");
            if (accountSelected) {
                int balance = atm.getBalance();
                System.out.println("Your balance is: " + balance);

                // Deposit some money and display the new balance
                boolean depositSuccessful = atm.deposit(200);
                if (depositSuccessful) {
                    balance = atm.getBalance();
                    System.out.println("Your new balance is: " + balance);
                } else {
                    System.out.println("Deposit failed");
                }

                // Withdraw some money and display the new balance
                boolean withdrawSuccessful = atm.withdraw(500);
                if (withdrawSuccessful) {
                    balance = atm.getBalance();
                    System.out.println("Your new balance is: " + balance);
                } else {
                    System.out.println("Withdrawal failed");
                }
            } else {
                System.out.println("Account not found");
            }
        } else {
            System.out.println("Invalid card or PIN");
        }
    }
}