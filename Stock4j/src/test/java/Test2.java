import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.ExchangeType;
import coin.Stock4j.data.statics.Market;

import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        for(int i = 0; i < Market.getAllTickersNumber(); i++) {
            System.out.println(Market.getAllStocks()[i].getTicker());
        }
    }
}
