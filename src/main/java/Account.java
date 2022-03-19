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
//        statement.getAccounts()
//                .forEach(x -> {
//                    total = total + x.amount;
//                    System.out.println(x.date+" "+ x.amount +" "+total);
//                });
        TablePrinter printer = new TablePrinter();
        printer.print(statement);
    }

}
