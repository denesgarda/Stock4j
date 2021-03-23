import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.Market;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Arrays.toString(Market.getAllTickers()));
    }
}
