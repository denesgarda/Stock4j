package coin.Stock4j.data.statics;

public class ExchangeType {
    public static ExchangeType NASDAQ = new ExchangeType("Nasdaq");
    public static ExchangeType OTC = new ExchangeType("OTC");
    public static ExchangeType NYSE = new ExchangeType("NYSE");

    private String name;

    private ExchangeType(String name) {
        this.name = name;
    }
    public String getAsString() {
        return this.name;
    }
}
