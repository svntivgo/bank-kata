import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    BigDecimal amount;
    LocalDate date;

    void deposit(BigDecimal amount, LocalDate date) {
        System.out.println("Depositó un monto de: "+amount+", en la fecha: "+date);
    }

    void withdraw(int amount, Instant date){
        System.out.println("Retiró un monto de: "+amount+", en la fecha: "+date);
    }

    void printStatements() {

    }

}
