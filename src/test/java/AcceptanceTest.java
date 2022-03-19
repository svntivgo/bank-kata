import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        cuenta.deposit(amountOf( 1000), date("03/01/2020"));
        cuenta.deposit(amountOf(2000), date("03/01/2020"));
        cuenta.withdraw(amountOf(500), date("03/01/2020"));

        cuenta.printStatements();
    }



}
