import java.time.LocalDate;

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
                .forEach(x -> {
                    total = total + x.amount;
                    System.out.println(x.date+" "+ x.amount +" "+total);
                });
        System.out.println(total);
    }

}
