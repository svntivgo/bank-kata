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
    public Double amountOf(int number) {
        return (double) number;
    }

    public LocalDate date(String dateOnString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateOnString, formatter);
    }

    @Test
    public void deposito() {
        Account cuenta = new Account(new Statement());
        cuenta.deposit(amountOf( 500), date("03/01/2020"));
        cuenta.withdraw(amountOf(500), date("03/01/2020"));
        cuenta.withdraw(amountOf(200), date("03/01/2020"));

        cuenta.printStatements();
    }



}
