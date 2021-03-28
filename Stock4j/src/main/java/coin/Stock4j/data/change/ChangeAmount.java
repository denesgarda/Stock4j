package coin.Stock4j.data.change;

public class ChangeAmount {
    protected double amount;
    public ChangeAmount() {

    }
    public ChangeAmount(double amount) {
        this.amount = amount;
    }
    public ChangeAmount setAmount(double amount) {
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
