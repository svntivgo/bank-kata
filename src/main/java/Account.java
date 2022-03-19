import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Account {
    BigDecimal amount;
    LocalDate date;
    Statement statement;

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(BigDecimal amount, LocalDate date) {
        System.out.println("Depositó un monto de: "+amount+", en la fecha: "+date);
        statement.addStatement(amount,date);
    }

    void withdraw(BigDecimal amount, LocalDate date){
        System.out.println("Retiró un monto de: "+amount.negate()+", en la fecha: "+date);
        statement.addStatement(amount.negate(),date);
    }

    void printStatements() {
        statement.getAccounts().stream().forEach(x -> System.out.println(x.amount +" "+ x.date));
    }

}
