import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Currency;
import java.util.Date;
import java.io.*;

public class AcceptanceTest {
    public BigDecimal amountOf(int number) {
        return BigDecimal.valueOf(number);
    }

    public LocalDate date(String dateOnString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(dateOnString, formatter);
        return parsedDate;
    }

    @Test
    public void deposito() {
        Account cuenta = new Account(new Statement());
        cuenta.deposit(amountOf( 500), date("03/01/2020"));
        cuenta.withdraw(amountOf(500), date("03/01/2020"));

        cuenta.printStatements();
    }



}
