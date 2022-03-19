import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TablePrinter {
    List<Double> balance = new ArrayList<>();
    Double partialBalance = 0.0;

    String borderHorizontal = "-----------------------------------------------------------------------------";
    String sizeCell = "%10s %10s %10s %10s";

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

        System.out.println(borderHorizontal);
        System.out.printf(sizeCell, "DATE", "CREDIT", "DEBIT", "BALANCE");
        System.out.println();
        System.out.println(borderHorizontal);
        Collections.reverse(balance);
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.amount>0) {
                System.out.format(sizeCell,
                        account.date,
                        account.amount,
                        "",
                        balance.get(i)
                );
            }
            if (account.amount<0) {
                System.out.format(sizeCell,
                        account.date,
                        "",
                        account.amount,
                        balance.get(i)
                );
            }
            System.out.println();

        }
        System.out.println(borderHorizontal);
    }
}