import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.ExchangeType;
import coin.Stock4j.data.statics.Market;

import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        Stock stock = new Stock("AMC");
        ExchangeType exchangeType = stock.getExchangeType();
        System.out.println(exchangeType.getAsString());
    }
}
