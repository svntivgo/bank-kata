import java.time.LocalDate;

public class Account {
    Double amount;
    LocalDate date;
    Statement statement;

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
        TablePrinter printer = new TablePrinter();
        printer.print(statement);
    }

    public LocalDate getDate() {
        return date;
    }

}
