public class TablePrinter {
    Double total = 0.0;

    public TablePrinter() {
    }

    void print(Statement statement){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s", "DATE", "CREDIT", "DEBIT", "BALANCE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        statement.getAccounts()
                .forEach(x -> {
                    total = total + x.amount;
                    if (x.amount>0) {
                        System.out.format("%10s %10s %10s %10s",
                                x.date, "", x.amount, total);
                    }
                    if (x.amount<0) {
                        System.out.format("%10s %10s %10s %10s",
                                x.date, x.amount, "", total);
                    }
                    System.out.println();
                });
        System.out.println("-----------------------------------------------------------------------------");
    }
}