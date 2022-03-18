import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public class Account {
    BigDecimal amount;
    LocalDate date;

    void deposit(BigDecimal amount, LocalDate date) {
        System.out.println("Monto: "+amount+", fecha: "+date);
    }

    void withdraw(int amount, Instant date){

    }

    void printStatements() {

    }

}
