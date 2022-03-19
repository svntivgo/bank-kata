import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Statement {
    private BigDecimal amount;
    private LocalDate date;
    private List<Account> accounts;

    public void addStatement(Account account) {
        this.accounts.add(account);
        System.out.println(accounts);
    }
}
