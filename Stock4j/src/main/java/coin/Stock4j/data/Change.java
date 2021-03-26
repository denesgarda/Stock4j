package coin.Stock4j.data;

public class Change {
    protected double amount;
    public Change() {

    }
    public Change(double amount) {
        this.amount = amount;
    }
    public Change setAmount(double amount) {
        this.amount = amount;
        return this;
    }
    public double getAmount() {
        return this.amount;
    }
    public double getAmountInPercent() {
        return this.amount * 100;
    }
}
