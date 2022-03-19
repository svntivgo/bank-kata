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
        cuenta.deposit(amountOf( 1000), date("10/01/2021"));
        cuenta.deposit(amountOf(2000), date("13/01/2021"));
        cuenta.withdraw(amountOf(500), date("14/01/2021"));

        cuenta.printStatements();
    }



}
