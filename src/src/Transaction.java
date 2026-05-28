public class Transaction {

    private String transactionType;
    private double amount;

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println("Transaction: " + transactionType);
        System.out.println("Amount: €" + amount);
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }
}
