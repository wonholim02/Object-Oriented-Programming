public class ATM {
    private final Bank bank;
    private Card card;
    private Account account;
    private int balance;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public boolean insertCard(String cardNumber, String pin) {
        if (bank.validateCard(cardNumber) && bank.validatePin(cardNumber, pin)) {
            card = new Card(cardNumber, pin);
            return true;
        }
        return false;
    }

    public boolean selectAccount(String accountNumber) {
        account = bank.getAccount(accountNumber);
        if (account != null) {
            balance = account.getBalance();
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            account.deposit(amount);
            balance = account.getBalance();
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            account.withdraw(amount);
            balance = account.getBalance();
            return true;
        }
        return false;
    }
}