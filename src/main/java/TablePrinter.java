import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TablePrinter {
    List<Double> balance = new ArrayList<>();
    Double partialBalance = 0.0;

    public TablePrinter() {
    }

    void calcBalance(Statement statements) {
        List<Account> accounts = statements.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            partialBalance = partialBalance + account.amount;
            balance.add(partialBalance);
        }
    }

    void print(Statement statements){
        statements.getAccounts()
                .sort(Comparator
                .comparing(Account::getDate)
                .reversed());

        List<Account> accounts = statements.getAccounts();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s", "DATE", "CREDIT", "DEBIT", "BALANCE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        Collections.reverse(balance);
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.amount>0) {
                System.out.format("%10s %10s %10s %10s",
                        account.date, "", account.amount, balance.get(i));
            }
            if (account.amount<0) {
                System.out.format("%10s %10s %10s %10s",
                        account.date, account.amount, "", balance.get(i));
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}