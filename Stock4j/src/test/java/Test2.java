import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.ExchangeType;
import coin.Stock4j.data.statics.Market;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        for(int i = 0; i < Market.getAllTickers().length; i++) {
            System.out.println(Market.getAllTickers()[i]);
        }
    }
}
