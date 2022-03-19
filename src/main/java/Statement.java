import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Statement {
    private final List<Account> accounts = new ArrayList<>();

    public void addStatement(Double amount, LocalDate date) {
        Account account = new Account(new Statement());
        account.amount = amount;
        account.date = date;
        this.accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
