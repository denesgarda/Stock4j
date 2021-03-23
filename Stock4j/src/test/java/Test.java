import coin.Stock4j.data.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yahoofinance.YahooFinance;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock("EE");
        System.out.println(stock.getExchange());
    }
}
