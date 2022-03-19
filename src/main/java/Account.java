import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Account {
    Double amount;
    LocalDate date;
    Statement statement;
    Double total = 0.0;

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(Double amount, LocalDate date) {
        statement.addStatement(amount,date);
    }

    void withdraw(Double amount, LocalDate date){
        statement.addStatement(-amount,date);
    }

    void printStatements() {
        statement.getAccounts()
                .stream()
                .forEach(x -> {
                    total = total + x.amount;
                    System.out.println(x.date+" "+ x.amount +" "+total);
                });
        System.out.println(total);
    }

}
