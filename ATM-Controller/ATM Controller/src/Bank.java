import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean validateCard(String cardNumber) {
        // In a real implementation, this method would check if the card number is valid and if it's associated with a valid account.
        return true;
    }

    public boolean validatePin(String cardNumber, String pin) {
        // In a real implementation, this method would check if the PIN is correct for the given card number.
        return true;
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}